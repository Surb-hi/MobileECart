package com.x_cart.mobile.Testsuits;

import com.x_cart.mobile.pages.*;
import com.x_cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Shopping extends TestBase {
    HomePage homePage = new HomePage();
    BestSeller bestsellers = new BestSeller();
    TargetCart targetCart = new TargetCart();
    Check_Out checkOut = new Check_Out();
    Checkoutsuccesfully checkOutSuccess = new Checkoutsuccesfully();


    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForOllieTheAppControlledRobot() throws InterruptedException {
        Thread.sleep(1000);
        homePage.mouseHoverOnHotDealLink();
        Thread.sleep(1000);
        homePage.mouseHoverAndClickOnBestSellerLink();
        Thread.sleep(1000);
        Assert.assertEquals(bestsellers.getBestSellerText(), "Bestsellers", "Not Navigate to page");
        bestsellers.mouseHoverOnSortBy();
        bestsellers.clickOnSortAToZ();
        Thread.sleep(1000);
        bestsellers.mouseHoverOnAddToCart();
        Thread.sleep(500);
        bestsellers.clickOnAddToCart();
        Assert.assertEquals(bestsellers.getProductText(), "Product has been added to your cart", "Not Navigate to page");
        bestsellers.clickOnCrossSign();
        Thread.sleep(500);
        bestsellers.clickOnYourCartSymbol();
        Thread.sleep(500);
        bestsellers.clickOnViewCart();
        Assert.assertEquals(targetCart.getYourShoppingText(), "Your shopping cart - 1 item", "Not Navigate to page");
        Assert.assertEquals(targetCart.getActual1() + targetCart.getActual3() + targetCart.getActual2() + targetCart.getActual4(), "$299.00", "Not Navigate to page");
        Assert.assertEquals(targetCart.getAct1() + targetCart.getAct2() + targetCart.getAct3() + targetCart.getAct4(), "$309.73", "Not Navigate to page");
        targetCart.clickOnGoToCheckOut();
        Assert.assertEquals(checkOut.getLoginText(), "Log in to your account", "Not Navigate to page");
        checkOut.enterEmail("sol@ymail.com");
        checkOut.clickOnContinueButton();
        Assert.assertEquals(checkOut.getSecureCheckOutText(), "Secure Checkout", "Not Navigate to page");
        checkOut.enterFirstName("ram");
        checkOut.enterLastName("Kan");
        checkOut.enterAddress("10, b");
        checkOut.clearCityName();
        checkOut.enterCityName("Derby");
        checkOut.selectCountry("France");
        checkOut.enterStateName("Borough");
        checkOut.clearZipCodeField();
        checkOut.enterZipCode("100-200");
        checkOut.clickOnCheckTheBox();
        checkOut.enterPass("Kd@123456");
        checkOut.mouseHoverOnLocalShipping();
        checkOut.clickOnLocalShipping();
        checkOut.mouseHoverOnCodPayment();
        checkOut.clickOnCodPayment();
        Assert.assertEquals(checkOut.getA1() + checkOut.getA2() + checkOut.getA3() + checkOut.getA4(), "$311.03", "Not Navigate to page");
        Thread.sleep(1000);
        checkOut.clickOnPlaceOrderButton();
        Thread.sleep(1000);
        Assert.assertEquals(checkOutSuccess.getThankYouText(), "Thank you for your order", "Not Navigate to page");

    }

    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        homePage.mouseHoverOnHotDealLink();
        Thread.sleep(1000);
        homePage.mouseHoverAndClickOnBestSellerLink();
        Thread.sleep(1000);
        Assert.assertEquals(bestsellers.getBestSellerText(), "Bestsellers", "Not Navigate to page");
        bestsellers.mouseHoverOnSortBy();
        bestsellers.clickOnSortAToZ();
        Thread.sleep(1000);
        bestsellers.mouseHoverAndClickOnAddToCartVinlyProduct();
        Thread.sleep(500);
        bestsellers.getProductText();
        bestsellers.clickOnCrossSign();
        bestsellers.clickOnYourCartSymbol();
        Thread.sleep(500);
        bestsellers.clickOnViewCart();
        Assert.assertEquals(targetCart.getShippingCart1Text(), "Your shopping cart - 1 item", "Not Navigate to page");
        targetCart.clickOnEmptyCart();
        Assert.assertEquals(targetCart.getAlertText(), "Are you sure you want to clear your cart?", "Not Navigate to page");
        targetCart.acceptingAlert();
        Assert.assertEquals(targetCart.getItemDeleteText(), "Item(s) deleted from your cart", "Not Navigate to page");
        Assert.assertEquals(targetCart.getYourCartEmptyText(), "Your cart is empty", "Not Navigate to page");

    }
}
