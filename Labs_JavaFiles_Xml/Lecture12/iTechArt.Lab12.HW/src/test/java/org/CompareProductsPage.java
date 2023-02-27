package org;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompareProductsPage extends LoggerSetUp{
    private WebDriver driver;
    public CompareProductsPage(WebDriver driver){
       this.driver = driver;
       PageFactory.initElements( driver, this);
    }
    @FindBy(xpath = "//h1[@class = 'b-offers-title']") WebElement elementCompare;
    public void assertCompareProductsPage(){
        log.info("Assert Compare page appears");
        Assert.assertTrue(elementCompare.isDisplayed());
    }

}
