package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BestSeller extends Utility {
    By bestSellersText = By.xpath("//h1[text()='Bestsellers']");
    By sortBy = By.xpath("//span[text()='Sort by:']");
    By sortZToA = By.xpath("//li[@class='list-type-grid ']//a[@data-sort-by='translations.name' and @data-sort-order='desc']");
    By sortAToZ = By.xpath("//li[@class='list-type-grid ']//a[@data-sort-by='translations.name' and @data-sort-order='asc']");
    By sortPriceHighLow = By.xpath("//li[@class='list-type-grid ']//a[@data-sort-by='p.price' and @data-sort-order='desc']");

    By sortRate2 = By.xpath("//ul[@class='display-sort sort-crit grid-list']/child::li[6]/a");

    By zToAText = By.xpath("//span[text()='Name Z - A']");
    By highToLowText = By.xpath("//span[text()='Price High - Low']");
    By nameOrderOriginal = By.xpath("//a[@class='fn url next-previous-assigned']");
    By priceOrderOriginal = By.xpath("//span[@class='price product-price']");

    By rateOrderOriginal = By.xpath("//ul[@class='products-grid grid-list']/li/div/div[2]//div[@class='stars-row full']");

    By mouseOnAddToCart = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[1]/a[1]/img[1]");
    By addToCart = By.xpath("//button[@class='btn  regular-button add-to-cart product-add2cart productid-42']");
    By productText = By.xpath("//li[text()='Product has been added to your cart']");
    By crossSign = By.xpath("//a[@class='close']");
    By yourCartSymbol = By.xpath("//div[@title='Your cart']");
    By viewCart = By.xpath("//a[@class='regular-button cart']");
    By addToCartVinlyProduct = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[8]/div[1]/div[2]/div[4]/div[1]/button[1]");


    public String getBestSellerText() {
        return getTextFromElement(bestSellersText);
    }

    public void mouseHoverOnSortBy() {
        mouseHoverToElementAndClick(sortBy);
    }

    public void clickOnSortZToA() {
        clickOnElement(sortZToA);
    }

    public void clickOnSortAToZ() {
        clickOnElement(sortAToZ);
    }

    public void clickOnSortPriceHighLow() {
        clickOnElement(sortPriceHighLow);
    }

    public void clickOnSortRateBestSeller() {
        clickOnElement(sortRate2);
    }

    public String getzToAText() {
        return getTextFromElement(zToAText);
    }

    public String getHighToLowText() {
        return getTextFromElement(highToLowText);
    }

    public List<WebElement> fetchItemsListName() {
        return listOfWebElementsList(nameOrderOriginal);
    }

    public List<WebElement> fetchItemsListPrice() {
        return listOfWebElementsList(priceOrderOriginal);
    }

    public List<WebElement> fetchItemsListRate() {
        return listOfWebElementsList(rateOrderOriginal);
    }

    public void mouseHoverOnAddToCart() {
        mouseHoverToElement(mouseOnAddToCart);
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }

    public String getProductText() {
        return getTextFromElement(productText);
    }

    public void clickOnCrossSign() {
        clickOnElement(crossSign);
    }

    public void clickOnYourCartSymbol() {
        clickOnElement(yourCartSymbol);
    }

    public void clickOnViewCart() {
        clickOnElement(viewCart);
    }

    public void mouseHoverAndClickOnAddToCartVinlyProduct() {
        mouseHoverToElementAndClick(addToCartVinlyProduct);
    }

}
