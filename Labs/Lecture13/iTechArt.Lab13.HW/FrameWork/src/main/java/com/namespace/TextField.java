package com.namespace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextField extends BaseElement{
    protected By loc;
    public TextField(By loc, WebDriver driver) {
        super(loc, driver);
    }

    public void sendKeys(String text){
        FindElement(loc).sendKeys(text);
    }
}
