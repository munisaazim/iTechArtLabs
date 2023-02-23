package com.namespace.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChoosePhonesPage {
    private WebDriver driver;

    public ChoosePhonesPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements( driver, this);
    }
    @FindBy(xpath = "\"//ul[@class='schema-filter__list']//span[@class='schema-filter__checkbox-text'][normalize-space()='Apple']\"") WebElement elementApple;
    @FindBy(xpath = "\"//ul[@class='schema-filter__list']//span[@class='schema-filter__checkbox-text'][normalize-space()='HONOR']\"") WebElement elementHONOR;
    public void clickOnAppleAndHONOR(){
        elementHONOR.click();
        elementApple.click();
        elementHONOR.click();
    }
    @FindBy(xpath = "\"(//*[@class = 'schema-product__control'])[1]\"")private WebElement elementChooseNumberOne;
    @FindBy(xpath = "\"(//*[@class = 'schema-product__control'])[3]\"")private WebElement elementChooseNumberThree;
    public void clickOnProductOneAndProductTwo(){
        elementChooseNumberOne.click();
        elementChooseNumberThree.click();
    }
    @FindBy(xpath = "\"//*[contains(@href , 'https://catalog.onliner.by/compare')]\"")private WebElement elementLinkCompareProducts;
    public void clickOnLinkCompareProducts(){
        elementLinkCompareProducts.click();
    }

}