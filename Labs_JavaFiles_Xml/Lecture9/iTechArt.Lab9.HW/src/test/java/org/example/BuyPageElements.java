package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuyPageElements {
    private final WebDriver driver;

    public BuyPageElements(WebDriver driver){
        this.driver = driver;
    }
    public WebElement mobileEnter(){
        return driver.findElement(By.xpath("(//*[@href = 'https://catalog.onliner.by/mobile'])[2]"));
    }
    public WebElement mobileEnterAssert(){
        return driver.findElement(By.xpath("//h1[contains(@class , 'schema-header__title')]"));
    }
    public WebElement chooseMobileApple(){
        return driver.findElement(By.xpath("(//*[text() = 'Apple'])[2]"));
    }
    public WebElement chooseMobileHONOR(){
        return driver.findElement(By.xpath("(//*[text() = 'HONOR'])[2]"));
    }
    public WebElement chooseNumberOne(){
        return driver.findElement(By.xpath("(//*[@class = 'schema-product__control'])[1]"));
    }
    public WebElement chooseNumberThree(){
        return driver.findElement(By.xpath("(//*[@class = 'schema-product__control'])[3]"));
    }
    public WebElement compareLink(){
        return driver.findElement(By.xpath("//*[contains(@href , 'https://catalog.onliner.by/compare')]"));
    }
    public WebElement headerTag(){
        return driver.findElement(By.xpath("//h1"));
    }

}
