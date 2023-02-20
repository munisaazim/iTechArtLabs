package com.namespace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Button extends BaseElement{
    private WebDriver driver;
    public Button(By loc, WebDriver driver) {
        super(loc, driver);
    }
}
