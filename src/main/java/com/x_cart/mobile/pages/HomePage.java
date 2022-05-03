package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By shippingLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Shipping']");
    By newLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='New!']");
    By comingSoonLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Coming soon']");
    By contactUsLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Contact us']");
    By hotDealLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title']");
    By saleLink = By.xpath("//li[@class='leaf has-sub']//span[text()='Sale']");
    By bestSellerLink = By.xpath("//li[@class='leaf has-sub']//span[text()='Bestsellers']");


    public void clickOnShippingLink(){
        clickOnElement(shippingLink);
    }
    public void clickOnNewLink(){
        clickOnElement(newLink);
    }
    public void clickOnComingSoonLink(){
        clickOnElement(comingSoonLink);
    }
    public void clickOnContactUsLink(){
        clickOnElement(contactUsLink);
    }
    public void mouseHoverOnHotDealLink(){
        mouseHoverToElement(hotDealLink);
    }

    public void mouseHoverAndClickOnSaleLink(){
        mouseHoverToElementAndClick(saleLink);
    }
    public void mouseHoverAndClickOnBestSellerLink(){
        mouseHoverToElementAndClick(bestSellerLink);
    }
}
