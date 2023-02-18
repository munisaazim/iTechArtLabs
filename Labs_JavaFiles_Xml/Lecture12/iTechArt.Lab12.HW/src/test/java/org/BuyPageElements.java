package org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuyPageElements extends LoggerSetUp{
    private final WebDriver driver;

    public BuyPageElements(WebDriver driver){
        this.driver = driver;
    }
    public WebElement mobileEnter(){
        log.info("Setting main page Web Element");
        return driver.findElement(By.xpath("(//*[@href = 'https://catalog.onliner.by/mobile'])[2]"));
    }
    public WebElement mobileEnterAssert(){
        log.info("Setting page header(title) information Web Element");
        return driver.findElement(By.xpath("//h1[contains(@class , 'schema-header__title')]"));
    }
    public WebElement chooseMobileApple(){
        log.info("Setting Apple(text) information Web Element");
        return driver.findElement(By.xpath("(//*[text() = 'Apple'])[2]"));
    }
    public WebElement chooseMobileHONOR(){
        log.info("Setting HONOR(text) information Web Element");
        return driver.findElement(By.xpath("(//*[text() = 'HONOR'])[2]"));
    }
    public WebElement chooseNumberOne(){
        log.info("Setting Apple(checkbox) information Web Element");
        return driver.findElement(By.xpath("(//*[@class = 'schema-product__control'])[1]"));
    }
    public WebElement chooseNumberThree(){
        log.info("Setting HONOR(text) information Web Element");
        return driver.findElement(By.xpath("(//*[@class = 'schema-product__control'])[3]"));
    }
    public WebElement compareLink(){
        log.info("Clicking on Link Web Element");
        return driver.findElement(By.xpath("//*[contains(@href , 'https://catalog.onliner.by/compare')]"));
    }
    public WebElement headerTag(){
        log.info("Clicking on Link Web Element");
        return driver.findElement(By.xpath("//h1"));
    }

}