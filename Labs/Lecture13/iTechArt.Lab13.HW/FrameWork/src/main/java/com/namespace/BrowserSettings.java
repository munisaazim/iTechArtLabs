package com.namespace;

import org.openqa.selenium.WebDriver;

public class BrowserSettings {
    private WebDriver driver;
    public BrowserSettings(WebDriver driver){
        this.driver = driver;
    }
    public void MaximizeWindow(){
        driver.manage().window().maximize();
    }
    public void ExitWindow(){
        driver.quit();
    }
}
