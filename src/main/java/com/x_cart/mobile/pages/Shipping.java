package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class Shipping extends Utility {
    By shippingText = By.xpath("//h1[text()='Shipping']");

    public String getShippingText(){
        return getTextFromElement(shippingText);
    }
}
