package com.namespace;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CheckoutPage {
    private WebDriver driver;
    private MainPage mainPage;
    CheckoutPage(WebDriver driver) {
        this.driver = driver;
        mainPage = new MainPage(driver);
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
    public void enterDataFieldForDelivery() throws InterruptedException {
        final TextField sendKeysToName = new TextField(By.xpath("//*[@id = 'msordersform-address']"), "Enter data for delivery", driver);
        sendKeysToName.sendKeys("Test");
    }
    public void clickOnCheckbox() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("(//label[@class = 'radio'])[1]"));
        mainPage.waitUntilPageLoaded(element);
        final Button clicknOnNextPage = new Button(By.xpath("//*[@class= 'radio']"), "SendKeys to Name", driver);
        clicknOnNextPage.Click();
    }
    public void clickonNextPageTwo(){
        final Button clicknOnNextPageTwo = new Button(By.xpath("//*[contains(@class, \"pull-right\") and @data-csb = \"payment\"]"), "Clicking on button next", driver);
        clicknOnNextPageTwo.Click();
    }
    public void clickOnPaymentType(){
        final Button clickOnPaymentType = new Button(By.xpath("//*[@for = 'payment_info_0']"), "Clicking on button next", driver);
        final Button clickOnPrivacy = new Button(By.xpath("//*[@id = 'msordersform-offer']"), "Clicking on Privacy", driver);
        final Button clickOnOrder = new Button(By.xpath("//*[@name ='checkout-button']"), "Clicking on Order", driver);
        clickOnPaymentType.Click();
        clickOnPrivacy.Click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        clickOnOrder.Click();
    }
}
