package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ContactUs extends Utility {
    By contactText = By.xpath("//h1[text()='Contact us']");

    public String getContactTextText(){
        return getTextFromElement(contactText);
    }
}
