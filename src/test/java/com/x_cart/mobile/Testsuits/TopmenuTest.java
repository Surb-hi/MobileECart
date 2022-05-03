package com.x_cart.mobile.Testsuits;

import com.x_cart.mobile.pages.*;
import com.x_cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopmenuTest extends TestBase {
    HomePage homePage = new HomePage();
    Shipping shipping = new Shipping();
    NewArrivals newArrivals = new NewArrivals();
    CommingSoon comingSoon = new CommingSoon();
    ContactUs contactUs = new ContactUs();

    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully(){
        homePage.clickOnShippingLink();
        Assert.assertEquals(shipping.getShippingText(), "Shipping", "not navigate to page");

    }
    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully(){
        homePage.clickOnNewLink();
        Assert.assertEquals(newArrivals.getNewText(), "New arrivals", "not navigate to page");
    }
    @Test
    public void verifyUserShouldNavigateToComingsoonPageSuccessfully(){
        homePage.clickOnComingSoonLink();
        Assert.assertEquals(comingSoon.getComingText(), "Coming soon", "not navigate to page");
    }
    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully(){
        homePage.clickOnContactUsLink();
        Assert.assertEquals(contactUs.getContactTextText(), "Contact us", "not navigate to page");
    }
}
