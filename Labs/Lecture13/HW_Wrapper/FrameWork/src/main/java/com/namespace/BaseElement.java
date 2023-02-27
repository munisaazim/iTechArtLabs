package com.namespace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BaseElement {
    private final By loc;
    private WebDriverWait wait;
    private final WebDriver driver;

    public BaseElement(WebDriver driver, By loc, String name) {
        this.driver = driver;
        this.loc = loc;
        System.out.println("Driver:" + driver);
    }
    protected WebElement findElement() {
        return this.driver.findElement(loc);
    }
    public void Click(){
      findElement().click();
      System.out.println("Printed:");
    }
    public String getText(){
        return findElement().getText();
    }
    public boolean isDisplayed(){
        return findElement().isDisplayed();
    }
}
