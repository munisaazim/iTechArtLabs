package com.namespace;

import org.openqa.selenium.WebDriver;

public class BrowserSettings {
    private WebDriver driver;
    BrowserSettings(WebDriver driver){
        this.driver = driver;
    }
    public void maximizeWindow(){
        driver.manage().window().maximize();
    }
}
