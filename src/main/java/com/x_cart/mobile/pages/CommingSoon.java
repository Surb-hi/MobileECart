package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class CommingSoon extends Utility {

        By comingText = By.xpath("//h1[text()='Coming soon']");

        public String getComingText(){
            return getTextFromElement(comingText);
        }
}
