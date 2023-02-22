package com.namespace;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MainPage {
    private WebDriver driver;
    private String url = "https://www.mediapark.uz/products/category/8";

    MainPage(WebDriver driver){
        this.driver = driver;
    }
    public void enterMainPage(){
        driver.get(url);
    }
    public void waitUntilPageLoaded(WebElement element) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        while(!(Boolean) js.executeScript("return arguments[0].complete;", element)) {
            Thread.sleep(1000);
        }
        System.out.println("The google logo is loaded... ");
    }
    public void assertMainPage(){
        String text = driver.getCurrentUrl();
        Assert.assertEquals(text, url);
    }

    public void clickOnProductOne(){
        final Button productOne = new Button(By.xpath("//*[@data-product = '16470']"), "ProductOne", driver);
        System.out.println("driver:" + driver);
        productOne.Click();
    }

    public void clickOnProductTwo() {
        final Button productTwo = new Button(By.xpath("//*[@data-product = '16154']"), "ProductTwo", driver);
        System.out.println("driver:" + driver);
        productTwo.Click();
    }
    public void assertNumberOfProducts(){
        WebElement element = driver.findElement(By.xpath("//a[@class='karzinka']//span"));
        System.out.println("Elements" + element.getText());
        String number = element.getText();
        Assert.assertEquals("2", number);
    }
    public void clickOnOrder(){
        final Button productTwo = new Button(By.xpath("//*[@class = 'karzinka']"), "ClickOnOrder", driver);
        System.out.println("driver:" + driver);
        productTwo.Click();

    }
}
