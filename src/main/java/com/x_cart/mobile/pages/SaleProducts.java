package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class SaleProducts extends Utility {
    By saleText = By.xpath("//h1[text()='Sale']");
    By sortBy = By.xpath("//span[text()='Sort by:']");
    By sortAToZ = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]");
    By sortPriceLowHigh = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]");
    By sortRate1 = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[7]/a[1]");
    By aToZText = By.xpath("//span[text()='Name A - Z']");
    By lowToHighText = By.xpath("//span[text()='Price Low - High']");
    By rateText = By.xpath("//span[text()='Rates ']");


    public String getSaleText(){
        return getTextFromElement(saleText);
    }

    public void mouseHoverOnSortBy(){
        mouseHoverToElementAndClick(sortBy);
    }

    public void clickOnSortAToZ(){
        clickOnElement(sortAToZ);
    }
    public void clickOnSortPriceLowHigh(){
        clickOnElement(sortPriceLowHigh);
    }
    public void clickOnSortRate(){
        clickOnElement(sortRate1);
    }
    public String getAToZText(){
        return getTextFromElement(aToZText);
    }
    public String getLowToHighText(){
        return getTextFromElement(lowToHighText);
    }
    public String getRateText(){
        return getTextFromElement(rateText);
    }

}
