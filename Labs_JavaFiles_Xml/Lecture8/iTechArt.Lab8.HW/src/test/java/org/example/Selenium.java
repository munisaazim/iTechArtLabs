package org.example;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Selenium {
    WebDriver driver;
    JavascriptExecutor js;
    public void setUp(){
        driver = new ChromeDriver();
        js = (JavascriptExecutor)driver;
        driver.manage().window().maximize();
    }
    public void enterPage(){
        driver.get("https://catalog.onliner.by/");
    }
    public void mobileEnter(){
        driver.findElement(By.xpath("(//*[@href = 'https://catalog.onliner.by/mobile'])[2]")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//h1[contains(@class , 'schema-header__title')]")).isDisplayed());
    }
    public void chooseMobile() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("(//*[text() = 'Apple'])[2]"));
        js.executeScript("arguments[0].click()", element);
        Thread.sleep(20);
        //driver.findElement(By.xpath("(//*[text() = 'HONOR'])[2]")).click();
        WebElement element2 =  driver.findElement(By.xpath("(//*[text() = 'HONOR'])[2]"));
        js.executeScript("arguments[0].click()", element2);
        js.executeScript("arguments[0].click()", element2);
    }
    public void chooseNumber(){
        WebElement element1 = driver.findElement(By.xpath("(//*[@class = 'schema-product__control'])[1]"));
        WebElement element3 = driver.findElement(By.xpath("(//*[@class = 'schema-product__control'])[3]"));
        js.executeScript("arguments[0].click()", element1);
        js.executeScript("arguments[0].click()", element3);
        WebElement element4 = driver.findElement(By.xpath("//*[contains(@href , 'https://catalog.onliner.by/compare')]"));
        Assert.assertTrue(element4.isDisplayed());
    }
    public void comparePage(){
        WebElement element4 = driver.findElement(By.xpath("//*[contains(@href , 'https://catalog.onliner.by/compare')]"));
        element4.click();
        Assert.assertEquals(driver.findElement(By.xpath("//h1")).getText(), "Сравнение товаров");
    }
}
