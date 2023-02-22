package com.namespace;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage {
    private WebDriver driver;

    CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void assertCheckoutPage() {
        WebElement element = driver.findElement(By.xpath("//h1"));
        String text = element.getText();
        Assert.assertEquals("Оформить заказ", text);
    }

    public void enterDataFields() {
        final TextField sendKeysToName = new TextField(By.xpath("//*[@name = 'MsOrdersForm[first_name]']"), "SendKeys to Name", driver);
        sendKeysToName.sendKeys("Munisa");
        final TextField sendKeysToPhone = new TextField(By.xpath("//*[@name = 'MsOrdersForm[phone_m]']"), "SendKeys to Name", driver);
        sendKeysToPhone.sendKeys("935955536");
    }
    public void clickOnNextPage(){
        final Button clicknOnNextPage = new Button(By.xpath("(//*[@data-csb = 'delivery'])[1]"), "SendKeys to Name", driver);
        clicknOnNextPage.Click();
    }
    public void waitUntilPageLoaded(By xpath) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
    }
    public void enterDataFieldForDelivery() {
        final TextField sendKeysToName = new TextField(By.xpath("//*[@id = 'msordersform-address']"), "Enter data forr delivery", driver);
        sendKeysToName.sendKeys("Test");
    }
    public void clickOnCheckbox(){
        final Button clicknOnNextPage = new Button(By.xpath("(//*[@class= 'radio']"), "SendKeys to Name", driver);
        clicknOnNextPage.Click();
    }
    public void clickonNextPageTwo(){
        final Button clicknOnNextPageTwo = new Button(By.xpath("//*[@data-csb= 'payment']"), "SendKeys to Name", driver);
        clicknOnNextPageTwo.Click();
    }
}
