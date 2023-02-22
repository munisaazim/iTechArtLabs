package com.namespace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkbox extends BaseElement{
    Checkbox(By loc, String name, WebDriver driver) {
        super(loc, name, driver);
    }
    public boolean isChecked(){
        return findElement().isDisplayed();
    }
}
