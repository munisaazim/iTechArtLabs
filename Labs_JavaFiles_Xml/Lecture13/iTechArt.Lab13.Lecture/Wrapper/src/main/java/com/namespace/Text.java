package com.namespace;

import org.openqa.selenium.By;

public class Text extends BaseElement{
    protected Text(By locator, String name) {
        super(locator, name);
    }
    public void Input(String text){
        FindElement().sendKeys(text);
    }

}
