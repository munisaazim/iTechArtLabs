package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.swing.*;
import java.time.Duration;

public class SeleniumBasic {
    WebDriver driver;

    public void setuo(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    public void Smoke() throws InterruptedException {
        driver.get("https://jqueryui.com/dialog/#modal-form");
        WebElement elementIframe = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(elementIframe);
        driver.findElement(By.xpath("//*[@id ='create-user']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement elementName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
        elementName.clear();
        elementName.sendKeys("Kimmy");
        WebElement elementEmail = driver.findElement(By.cssSelector("#email"));
        elementEmail.clear();
        elementEmail.sendKeys("kimmy@gmail.com");
        WebElement elementPassword =  driver.findElement(By.cssSelector("#password"));
        elementPassword.clear();
        elementPassword.sendKeys("12345");
        driver.findElement(By.xpath("//*[@type = 'button' and text() = 'Create an account']")).click();
        WebElement element1 = driver.findElement(By.xpath("//*[@id= 'users-contain']//tbody//tr[2]/td[1]"));
        Assert.assertEquals(element1.getText(), "Kimmy");
        driver.close();
        driver.quit();
    }
}
