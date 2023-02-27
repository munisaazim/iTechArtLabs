package com.namespace;

import com.namespace.Button;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

    public void clickOnProductOne() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("(//img[@alt = 'Телевизор Samsung UE55AU7500UXCE'])[1]"));
        WebElement  elementTwo =  driver.findElement(By.xpath("(//img[@alt = 'Телевизор Artel A43KF5500 Smart TV'])[1]"));
        waitUntilPageLoaded(element);
        waitUntilPageLoaded(elementTwo);
        final Button productOne = new Button(By.xpath("//*[@data-product = '16470']"), "ProductOne", driver);
        System.out.println("driver:" + driver);
        productOne.Click();
    }

    public void clickOnProductTwo() throws InterruptedException {
        final Button productTwo = new Button(By.xpath("//*[@data-product = '16154']"), "ProductTwo", driver);
        System.out.println("driver:" + driver);
        productTwo.Click();
        Thread.sleep(3000);
    }
    public void assertNumberOfProducts(){
        WebElement element = driver.findElement(By.xpath("//a[@class='karzinka']//span"));
        System.out.println("com.namespace.Elements" + element.getText());
        String number = element.getText();
        Assert.assertEquals("2", number);
    }
    public void clickOnOrder(){
        final Button productTwo = new Button(By.xpath("//*[@class = 'karzinka']"), "ClickOnOrder", driver);
        System.out.println("driver:" + driver);
        productTwo.Click();

    }
}
