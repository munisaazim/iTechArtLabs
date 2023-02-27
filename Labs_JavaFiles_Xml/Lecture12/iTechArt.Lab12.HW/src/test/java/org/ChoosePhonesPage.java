package org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChoosePhonesPage extends LoggerSetUp {
    private WebDriver driver;
    public ChoosePhonesPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements( driver, this);
    }
    @FindBy(xpath = "\"//ul[@class='schema-filter__list']//span[@class='schema-filter__checkbox-text'][normalize-space()='Apple']\"") WebElement elementApple;
    @FindBy(xpath = "\"//ul[@class='schema-filter__list']//span[@class='schema-filter__checkbox-text'][normalize-space()='HONOR']\"") WebElement elementHONOR;
    @FindBy(xpath = "\"(//*[@class = 'schema-product__control'])[1]\"") WebElement elementChooseNumberOne;
    @FindBy(xpath = "\"(//*[@class = 'schema-product__control'])[3]\"") WebElement elementChooseNumberThree;
    @FindBy(xpath = "\"//*[contains(@href , 'https://catalog.onliner.by/compare')]\"") WebElement elementLinkCompareProducts;

    public void clickOnAppleAndHONOR(){
        log.info("Clicking on Apple and HONOR, unclicking HONOR");
        elementHONOR.click();
        elementApple.click();
        elementHONOR.click();
    }
    public void clickOnProductOneAndProductTwo(){
        log.info("Choosing number one and three products to compare");
        elementChooseNumberOne.click();
        elementChooseNumberThree.click();
    }
    public void clickOnLinkCompareProducts(){
        log.info("Click on compare link");
        elementLinkCompareProducts.click();
    }
}
