package com.namespace;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public abstract class BaseElement {
    protected By loc;
    protected WebDriver wait;
    private WebDriver driver;
    private JavascriptExecutor js;
    String name;
    public BaseElement(By loc, WebDriver driver){
        this.js = (JavascriptExecutor) driver;
        this.loc = loc;
        this.driver = driver;
    }
    public void Click(){
        FindElement(loc).click();
    }
    protected WebElement FindElement(By loc){
        return driver.findElement(loc);
    }
    public String getText(){
        return FindElement(loc).getText();
    }
    public void MoveTo(){
        js.executeScript("scroll(0, 500");
    }
    public boolean isDisplayed(){
        return FindElement(loc).isDisplayed();
    }
}
