package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class Check_Out extends Utility {
    By loginText = By.xpath("//h3[text()='Log in to your account']");
    By emailField = By.xpath("//input[@id='email']");
    By continueButton = By.xpath("//button[@class='btn  regular-button anonymous-continue-button submit']");
    By secureCheckOutText = By.xpath("//h1[contains(text(),'Secure Checkout')]");
    By firstName = By.xpath("//input[@name='shippingAddress[firstname]']");
    By lastName = By.xpath("//input[@name='shippingAddress[lastname]']");
    By address = By.xpath("//input[@name='shippingAddress[street]']");
    By cityName = By.xpath("//input[@name='shippingAddress[city]']");
    By country = By.xpath("//select[@name='shippingAddress[country_code]']");
    By state = By.xpath("//input[@name='shippingAddress[custom_state]']");
    By zipCode = By.xpath("//input[@name='shippingAddress[zipcode]']");
    By checkTheBox = By.xpath("//input[@id='create_profile']");
    By pass = By.xpath("//input[@name='password']");
    By localShipping = By.xpath("//input[@value='128']");
    By codPayment = By.xpath("//input[@value='6']");

    By a1 = By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/span[2]/span[1]/span[1]/span[1]");
    By a2 = By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/span[2]/span[1]/span[1]/span[2]");
    By a3 = By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/span[2]/span[1]/span[1]/span[3]");
    By a4 = By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/span[2]/span[1]/span[1]/span[4]");

    By placeOrderButton = By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/button[1]");

    public String getLoginText() {
        return getTextFromElement(loginText);
    }

    public void enterEmail(String mail) {
        sendTextToElement(emailField, mail);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

    public String getSecureCheckOutText() {
        return getTextFromElement(secureCheckOutText);
    }

    public void enterFirstName(String fn) {
        sendTextToElement(firstName, fn);
    }

    public void enterLastName(String ln) {
        sendTextToElement(lastName, ln);
    }

    public void enterAddress(String add) {
        sendTextToElement(address, add);
    }
    public void clearCityName(){
        sendTextToElement1(cityName);
    }

    public void enterCityName(String cname) {
        sendTextToElement(cityName, cname);
    }

    public void selectCountry(String contry){
        selectByVisibleTextFromDropDown(country,contry);
    }

    public void enterStateName(String st) {
        sendTextToElement(state, st);
    }
    public void clearZipCodeField(){
        sendTextToElement1(zipCode);
    }

    public void enterZipCode(String zip) {
        sendTextToElement(zipCode, zip);
    }

    public void clickOnCheckTheBox() {
        clickOnElement(checkTheBox);
    }
    public void enterPass(String p) {
        sendTextToElement(pass, p);
    }
    public void mouseHoverOnLocalShipping(){
        mouseHoverToElement(localShipping);
    }
    public void clickOnLocalShipping(){
        clickOnElement(localShipping);
    }
    public void mouseHoverOnCodPayment(){
        mouseHoverToElement(codPayment);
    }
    public void clickOnCodPayment(){
        clickOnElement(codPayment);
    }
    public String getA1(){
        return getTextFromElement(a1);
    }
    public String getA2(){
        return getTextFromElement(a2);
    }
    public String getA3(){
        return getTextFromElement(a3);
    }
    public String getA4(){
        return getTextFromElement(a4);
    }
    public void clickOnPlaceOrderButton(){
        clickOnElement(placeOrderButton);
    }

}
