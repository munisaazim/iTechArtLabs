package com.namespace;

import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BaseElement {
    protected By Locator;
    protected String Name;
    protected BaseElement(By locator, String name){
        this.Locator = locator;
        this.Name = name;
    }
    private WebDriver Webdriver(){
        throw new NotImplementedException();
    }
    public void Click(){
        throw new NotImplementedException();
    }
    public String GetText(){
        throw new NotImplementedException();
    }
    public boolean IsDisplayed(){
        return FindElement().isDisplayed();
    }
    protected WebElement FindElement(){
        return Webdriver().findElement(Locator);
    }


}
