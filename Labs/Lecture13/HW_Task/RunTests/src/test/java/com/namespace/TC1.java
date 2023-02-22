package com.namespace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC1 {
    private WebDriver driver;
    protected WebElement element, elementTwo, elementThree, elementFour;
    private By xpath = By.xpath("//*[@id = 'msordersform-address']");
    private By xpathTwo = By.xpath("(//label[@class = 'radio'])[1]");
    @BeforeTest
    public void setFunctions(){
        this.driver = new ChromeDriver();
    }
    @Test
    public void runTests() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.enterMainPage();
        mainPage.assertMainPage();
        element = driver.findElement(By.xpath("(//img[@alt = 'Телевизор Samsung UE55AU7500UXCE'])[1]"));
        elementTwo =  driver.findElement(By.xpath("(//img[@alt = 'Телевизор Artel A43KF5500 Smart TV'])[1]"));
        mainPage.waitUntilPageLoaded(element);
        mainPage.waitUntilPageLoaded(elementTwo);
        mainPage.clickOnProductOne();
        mainPage.clickOnProductTwo();
        Thread.sleep(3000);
        elementThree =  driver.findElement(By.xpath("//a[@class='karzinka']//span"));
        mainPage.assertNumberOfProducts();
        mainPage.clickOnOrder();
        OrderPage orderPage = new OrderPage(driver);
        orderPage.assertOrderPageOpened();
        orderPage.clickOnConfirmOrder();
        CheckoutPage page = new CheckoutPage(driver);
        page.assertCheckoutPage();
        page.enterDataFields();
        page.clickOnNextPage();
        elementFour = driver.findElement(By.xpath("//*[@id = 'msordersform-address']"));
        System.out.println(elementFour);
        page.waitUntilPageLoaded(xpath);
        page.enterDataFieldForDelivery();
        page.waitUntilPageLoaded(xpathTwo);
        page. clickOnCheckbox();

    }
}
