package com.namespace;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocalBrowserFactory extends BrowserProfile {
    public LocalBrowserFactory(BrowserProfile browserProfile){
        super();

    }
    protected  WebDriver Webdriver(){
        String browserName = BrowserName;
        String driverSettings = DriverSettings;
        WebDriver webDriver;
        switch (browserName){
            case BrowserName(browser): webDriver = new ChromeDriver();
        }
        return null;
    }
}