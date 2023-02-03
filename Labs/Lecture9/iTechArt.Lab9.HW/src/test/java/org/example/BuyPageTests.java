package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BuyPageTests {
    private WebDriver driver;

    @BeforeTest
    public  void classInit(){
        driver = new ChromeDriver();
        //js = (JavascriptExecutor)driver;
    }

    @AfterTest
    public void testQuit(){
        driver.quit();
    }
    @Test
    public void BuyPageTestsRun() throws InterruptedException {
        BuyPage buyPageObject = new BuyPage(driver);
        buyPageObject.js = (JavascriptExecutor)driver;
        buyPageObject.getPage();
        buyPageObject.mobileEnter();
        buyPageObject.chooseMobile();
        buyPageObject.chooseNumber();
        buyPageObject.comparePage();

    }
}
