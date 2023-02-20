package com.namespace;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocalBrowserFactory extends BrowserProfile {
    public LocalBrowserFactory(BrowserProfile browserProfile){
        super();

    }
    protected  WebDriver Webdriver(){
        BrowserProfile browserProfile = new BrowserProfile();
        String browserName =  browserProfile.BrowserName;
        String driverSettings = DriverSettings;
        WebDriver webDriver;
        switch (browserName){
            case ("Chrome"): webDriver = new ChromeDriver();
            return webDriver;
            default: throw new InvalidArgumentException("WebDriver for browser" + browserName + "is not supported");
        }
    }
}