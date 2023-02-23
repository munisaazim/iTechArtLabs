package com.namespace.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.logging.XMLFormatter;

public class CompareProductsPage {
    private WebDriver driver;
    public CompareProductsPage(WebDriver driver){
       this.driver = driver;
       PageFactory.initElements( driver, this);
    }
    @FindBy(xpath = "//h1[@class = 'b-offers-title']") WebElement elementCompare;
    public void assertCompareProductsPage(){
        Assert.assertTrue(elementCompare.isDisplayed());
    }

}
