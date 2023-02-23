package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.time.Duration;

public class Selenium {
    private WebDriver driver;
    private String url = "https://catalog.onliner.by/";
    private WebElement elementApple, elementHONOR, elementChooseNumberOne, elementChooseNumberTwo, elementCompareLink, elementComparePageHeader;
    public Selenium(WebDriver driver){
        this.driver = driver;
    }
    public void enterPage(){
        driver.get(url);
    }
    public void mobileEnter(){
        driver.findElement(By.xpath("(//*[@href = 'https://catalog.onliner.by/mobile'])[2]")).click();
    }
    public void chooseMobile(){
        elementApple = driver.findElement(By.xpath("//ul[@class='schema-filter__list']//span[@class='schema-filter__checkbox-text'][normalize-space()='Apple']"));
        elementApple.click();
        elementHONOR = driver.findElement(By.xpath("//ul[@class='schema-filter__list']//span[@class='schema-filter__checkbox-text'][normalize-space()='HONOR']"));
        elementHONOR.click();
        elementHONOR.click();
    }
    public void chooseProductOneAndProductThree(){
        elementChooseNumberOne = driver.findElement(By.xpath("(//*[@class = 'schema-product__control'])[1]"));
        elementChooseNumberTwo = driver.findElement(By.xpath("(//*[@class = 'schema-product__control'])[3]"));
        elementChooseNumberOne.click();
        elementChooseNumberTwo.click();
        elementCompareLink= driver.findElement(By.xpath("//*[contains(@href , 'https://catalog.onliner.by/compare')]"));
        elementCompareLink.click();
    }
    public void comparePageAssert(){
        elementComparePageHeader = driver.findElement(By.xpath("//h1[@class = 'b-offers-title']"));
        Assert.assertTrue(elementComparePageHeader.isDisplayed(), "Compare Page Header text is displayed");
    }
}
