package com.namespace;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderPage {
    private WebDriver driver;
    WebDriverWait wait;
    OrderPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickOnConfirmOrder(){
        WebElement element = driver.findElement(By.xpath("//h5[@class = 'my-karzinka-h5']"));
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
        final Button orderButton = new Button(By.xpath("//a[@class = 'karzinka-open-bottom-block-a2']"), "Click on Cofrim button", driver);
        orderButton.Click();
    }
}
