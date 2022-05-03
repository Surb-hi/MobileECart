package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class TargetCart extends Utility {
    By yourShoppingText = By.xpath("//h1[text()='Your shopping cart - 1 item']");
    By actual1 = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/span[1]/span[1]/span[1]/span[1]");
    By actual2 = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/span[1]/span[1]/span[1]/span[3]");
    By actual3 = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/span[1]/span[1]/span[1]/span[2]");
    By actual4 = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/span[1]/span[1]/span[1]/span[4]");
    By act1 = By.xpath("//li[@class='total']//span/span[@class='surcharge-cell']/span[@class ='part-prefix']");
    By act2 = By.xpath("//li[@class='total']//span/span[@class='surcharge-cell']/span[@class ='part-integer']");
    By act3 = By.xpath("//li[@class='total']//span/span[@class='surcharge-cell']/span[@class ='part-decimalDelimiter']");
    By act4 = By.xpath("//li[@class='total']//span/span[@class='surcharge-cell']/span[@class ='part-decimal']");
    By goToCheckOut = By.xpath("//button[@class='btn  regular-button regular-main-button checkout']");
    By shippingCart1Text = By.xpath("//h1[text()='Your shopping cart - 1 item']");
    By emptyCart = By.xpath("//a[@class='clear-bag']");
    By itemDeleteText = By.xpath("//li[text()='Item(s) deleted from your cart']");
    By yourCartEmptyText = By.xpath("//h1[text()='Your cart is empty']");



    public String getYourShoppingText(){
        return getTextFromElement(yourShoppingText);
    }
    public String getActual1() {
        return getTextFromElement(actual1);
    }
    public String getActual2() {
        return getTextFromElement(actual2);
    }
    public String getActual3() {
        return getTextFromElement(actual3);
    }
    public String getActual4() {
        return getTextFromElement(actual4);
    }
    public String getAct1() {
        return getTextFromElement(act1);
    }
    public String getAct2() {
        return getTextFromElement(act2);
    }
    public String getAct3() {
        return getTextFromElement(act3);
    }
    public String getAct4() {
        return getTextFromElement(act4);
    }
    public void clickOnGoToCheckOut(){
        clickOnElement(goToCheckOut);
    }
    public void clickOnEmptyCart(){
        clickOnElement(emptyCart);
    }
    public String getAlertText(){
        return getTextFromAlert();
    }
    public void acceptingAlert(){
        acceptAlert();
    }
    public String getShippingCart1Text(){
        return getTextFromElement(shippingCart1Text);
    }
    public String getItemDeleteText(){
        return getTextFromElement(itemDeleteText);
    }
    public String getYourCartEmptyText(){
        return getTextFromElement(yourCartEmptyText);
    }



}
