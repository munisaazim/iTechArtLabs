package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {
    protected DialogPage objectDialog;
    protected WebDriver objectWebDriver;

    protected HomePage objectHomePage;
    public void SetUp(){
        objectWebDriver = new ChromeDriver();
        objectDialog = new DialogPage(objectWebDriver);
        objectHomePage = new HomePage(objectWebDriver);
    }

    public void quit(){
        objectWebDriver.quit();
    }
}
