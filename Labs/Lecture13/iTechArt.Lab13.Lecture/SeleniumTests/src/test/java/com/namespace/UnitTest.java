package com.namespace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UnitTest {
    private WebDriver driver;
    @BeforeTest
    public void SetUp(){

    }
    @Test
    public void Test1(){
        String url = "https://www.google.com/";
        Browsere browser = BrowserService.Browser;
        browser.GoToUrl(url);

        WebElement element = driver.findElement(By.xpath("//input[@name = 'q']"));
        String text = "Hello World";
        element.sendKeys(text);
        String getText = element.getText();
        Assert.assertEquals(getText, text);
    }


}
