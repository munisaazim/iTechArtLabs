package com.namespace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextField extends BaseElement{
    TextField(By loc, String name, WebDriver driver) {
        super(loc, name, driver);
    }
    public void sendKeys(String keyText){
        findElement().sendKeys(keyText);
    }
}
