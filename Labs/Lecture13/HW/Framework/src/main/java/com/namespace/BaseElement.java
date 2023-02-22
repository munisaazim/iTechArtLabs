package com.namespace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BaseElement {
    private By loc;
    private String name;
    private WebDriverWait wait;
    private WebDriver driver;

    BaseElement(By loc, String name, WebDriver driver) {
        this.driver = driver;
        this.loc = loc;
        this.name = name;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    protected WebElement findElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
    }
    public void click(){
      findElement().click();
    }
    public String getText(){
        return findElement().getText();
    }
    public boolean isDisplayed(){
        return findElement().isDisplayed();
    }
}
