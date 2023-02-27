package com.namespace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC1 {
    private WebDriver driver;
    private String url = "https://www.mediapark.uz/products/category/8";
    protected WebElement element, elementTwo, elementThree, elementFour;
    private By xpath = By.xpath("//*[@id = 'msordersform-address']");
    private By xpathTwo = By.xpath("(//label[@class = 'radio'])[1]");

    @BeforeTest
    public void setFunctions(){
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }
    @Test
    public void runTests() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickOnProductOne();
        mainPage.clickOnProductTwo();
        mainPage.clickOnOrder();
        OrderPage orderPage = new OrderPage(driver);
        orderPage.clickOnConfirmOrder();
        CheckoutPage page = new CheckoutPage(driver);
        page.enterDataFields();
        page.clickOnNextPage();
        page.enterDataFieldForDelivery();
        page. clickOnCheckbox();
        page.clickonNextPageTwo();
        page.clickOnPaymentType();

    }
    @AfterTest
    public void quit(){
        driver.quit();
    }
}
