package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RunAllTests {
    private WebDriver driver;
    @BeforeTest
    public void settingUp(){
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void Test(){
        TaskOne object = new TaskOne(driver);
        object.enter();
        object.clickOnServices();
        object.clickOnContact();
    }
    @AfterTest
    public void quitDriver(){
        driver.quit();
    }

}

