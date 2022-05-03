package com.x_cart.mobile.Testsuits;

import com.x_cart.mobile.pages.BestSeller;
import com.x_cart.mobile.pages.HomePage;
import com.x_cart.mobile.pages.SaleProducts;
import com.x_cart.mobile.testbase.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HotDeals extends TestBase {
    HomePage homePage = new HomePage();
    SaleProducts saleProducts = new SaleProducts();
    BestSeller bestsellers = new BestSeller();

    @Test
    public void verifySaleProductsArrangeAlphabetically() throws InterruptedException {
        Thread.sleep(1000);
        homePage.mouseHoverOnHotDealLink();
        Thread.sleep(1000);
        homePage.mouseHoverAndClickOnSaleLink();
        Thread.sleep(1000);
        Assert.assertEquals(saleProducts.getSaleText(), "Sale", "Not Navigate to page");
        saleProducts.mouseHoverOnSortBy();
        saleProducts.clickOnSortAToZ();
        Thread.sleep(400);
        Assert.assertEquals(saleProducts.getAToZText(), "Name A - Z", "Not Navigate to page");

    }

    @Test
    public void verifySaleProductsPriceArrangeLowToHigh() throws InterruptedException {
        Thread.sleep(1000);
        homePage.mouseHoverOnHotDealLink();
        Thread.sleep(1000);
        homePage.mouseHoverAndClickOnSaleLink();
        Thread.sleep(1000);
        Assert.assertEquals(saleProducts.getSaleText(), "Sale", "Not Navigate to page");
        saleProducts.mouseHoverOnSortBy();
        saleProducts.clickOnSortPriceLowHigh();
        Thread.sleep(400);
        Assert.assertEquals(saleProducts.getLowToHighText(), "Price Low - High", "Not Navigate to page");
    }

    @Test
    public void verifySaleProductsArrangeByRates() throws InterruptedException {
        Thread.sleep(1000);
        homePage.mouseHoverOnHotDealLink();
        Thread.sleep(1000);
        homePage.mouseHoverAndClickOnSaleLink();
        Thread.sleep(1000);
        Assert.assertEquals(saleProducts.getSaleText(), "Sale", "Not Navigate to page");
        saleProducts.mouseHoverOnSortBy();
        saleProducts.clickOnSortRate();
        Thread.sleep(400);
        Assert.assertEquals(saleProducts.getRateText(), "Rates", "Not Navigate to page");
    }

    @Test
    public void verifyBestSellersProductsArrangeByZToA() throws InterruptedException {
        Thread.sleep(1000);
        homePage.mouseHoverOnHotDealLink();
        Thread.sleep(1000);
        homePage.mouseHoverAndClickOnBestSellerLink();
        Thread.sleep(1000);
        Assert.assertEquals(bestsellers.getBestSellerText(), "Bestsellers", "Not Navigate to page");
        List<WebElement> originalList = bestsellers.fetchItemsListName();
        List<String> expected = new ArrayList<>();

        for (WebElement data : originalList) {
            expected.add(data.getText());
        }
        Collections.sort(expected, Collections.reverseOrder());
        System.out.println(expected);
        Thread.sleep(1000);

        bestsellers.mouseHoverOnSortBy();
        Thread.sleep(1000);
        bestsellers.clickOnSortZToA();
        Thread.sleep(1000);

        List<WebElement> actualList = bestsellers.fetchItemsListName();
        List<String> actual = new ArrayList<>();
        Thread.sleep(1000);

        for (WebElement data : actualList) {
            actual.add(data.getText());
        }
        System.out.println(actual);
        Assert.assertEquals(actual, expected, "not sorted");


    }

    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow() throws InterruptedException {
        Thread.sleep(1000);
        homePage.mouseHoverOnHotDealLink();
        Thread.sleep(1000);
        homePage.mouseHoverAndClickOnBestSellerLink();
        Thread.sleep(1000);
        Assert.assertEquals(bestsellers.getBestSellerText(), "Bestsellers", "Not Navigate to page");
        List<WebElement> originalList = bestsellers.fetchItemsListPrice();
        List<Double> expected = new ArrayList<>();

        for (WebElement data : originalList) {
            String a = data.getText();
            String b = a.substring(1).replace(".", "");
            Double price = Double.valueOf(b);
            expected.add(price);
        }
        System.out.println(expected);

        Thread.sleep(2000);
        bestsellers.mouseHoverOnSortBy();
        Thread.sleep(1000);
        bestsellers.clickOnSortPriceHighLow();

        List<WebElement> actualList = bestsellers.fetchItemsListPrice();
        List<Double> actual = new ArrayList<>();

        for (WebElement data : actualList) {
            String a = data.getText();
            String b = a.substring(1).replace(".", "");
            Double price = Double.valueOf(b);
            actual.add(price);
        }
        System.out.println(actual);
        Assert.assertEquals(actual, expected, "not sorted");


    }

    @Test
    public void verifyBestSellersProductsArrangeByRates() throws InterruptedException {
        Thread.sleep(1000);
        homePage.mouseHoverOnHotDealLink();
        Thread.sleep(1000);
        homePage.mouseHoverAndClickOnBestSellerLink();
        Thread.sleep(1000);
        Assert.assertEquals(bestsellers.getBestSellerText(), "Bestsellers", "Not Navigate to page");

        List<WebElement> originalList = bestsellers.fetchItemsListRate();
        List<String> expected = new ArrayList<>();
        Thread.sleep(1000);

        for (WebElement data : originalList) {
            String a = data.getDomAttribute("Style");
            expected.add(a);
        }
        Thread.sleep(1000);
        Collections.sort(expected, Collections.reverseOrder());
        System.out.println(expected);

        Thread.sleep(1000);
        bestsellers.mouseHoverOnSortBy();
        Thread.sleep(1000);
        bestsellers.clickOnSortRateBestSeller();
        Thread.sleep(2000);

        List<WebElement> actualList = bestsellers.fetchItemsListRate();
        List<String> actual = new ArrayList<>();

        for (WebElement data : actualList) {
            String a = data.getDomAttribute("Style");
            actual.add(a);
        }
        System.out.println(actual);
        Assert.assertEquals(actual, expected, "not sorted");

    }
}
