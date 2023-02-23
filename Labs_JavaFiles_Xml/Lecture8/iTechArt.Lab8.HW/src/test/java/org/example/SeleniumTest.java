package org.example;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SeleniumTest {
    private WebDriver driver = new ChromeDriver();
    private Selenium seleniumObject;
    @BeforeTest
    public void setUp(){
        driver.manage().window().maximize();
    }
    @Test
    public void Test(){
        seleniumObject = new Selenium(driver);
        seleniumObject.enterPage();
        seleniumObject.mobileEnter();
        seleniumObject.chooseMobile();
        seleniumObject.chooseProductOneAndProductThree();
        seleniumObject.comparePageAssert();
    }
    @AfterTest
    public void quitDriver(){
        driver.quit();
    }
}
