package com.namespace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Button extends BaseElement{
    Button(By loc, String name, WebDriver driver) {
        super(loc, name, driver);
    }
}
