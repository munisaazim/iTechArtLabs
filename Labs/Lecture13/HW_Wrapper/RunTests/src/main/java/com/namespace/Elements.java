package com.namespace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elements {
    private WebDriver driver;
    public Elements(WebDriver driver){
        this.driver = driver;
    }
    public WebElement clickOnProductOne(){
        return driver.findElement(By.xpath(""));
    }
}
