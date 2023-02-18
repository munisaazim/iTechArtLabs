package org.example;

import org.apache.commons.lang3.NotImplementedException;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

public abstract class BasePage {
    protected WebDriver driver;
    protected WebElement elementOne;
     protected By UniqueWebLocator = By.xpath("");
    //protected abstract WebElement elementOne;

    public WebDriver getDriver(){
        return driver;
    }

    public By getUniqueWebLocator() {
        return UniqueWebLocator;
    }

    protected BasePage(WebDriver driver){
        this.driver = driver;
    }
    protected WebElement UniqueElement = driver.findElement(UniqueWebLocator);

    public boolean isPageOpened(){
        boolean isOpened;
        try{
            isOpened = UniqueElement.isDisplayed();
        }
        catch (Exception e){
            isOpened = false;
        }
        return isOpened;
    }
    @Test
    public void waitForPageLoad()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement driverWait;
        //WebElement element = driverWait.findElement(UniqueWebLocator);
        try {
            driverWait = wait.until(ExpectedConditions.visibilityOfElementLocated(UniqueWebLocator));
        }
        catch (TimeoutException  e){
            System.out.println("System is not opened because of: " + UniqueWebLocator );
        }

    }











}
