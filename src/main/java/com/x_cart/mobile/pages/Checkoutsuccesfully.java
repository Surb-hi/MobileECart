package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class Checkoutsuccesfully extends Utility {
        By thankYouText = By.xpath("//h1[text()='Thank you for your order']");

        public String getThankYouText(){
            return getTextFromElement(thankYouText);
        }
}
