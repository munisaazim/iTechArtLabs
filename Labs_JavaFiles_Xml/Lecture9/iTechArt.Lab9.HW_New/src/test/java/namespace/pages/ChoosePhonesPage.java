package namespace.pages;

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
    @FindBy(xpath = "\"(//*[@class = 'schema-product__control'])[1]\"") WebElement elementChooseNumberOne;
    @FindBy(xpath = "\"(//*[@class = 'schema-product__control'])[3]\"") WebElement elementChooseNumberThree;
    @FindBy(xpath = "\"//*[contains(@href , 'https://catalog.onliner.by/compare')]\"") WebElement elementLinkCompareProducts;
    public void clickOnAppleAndHONOR(){
        elementHONOR.click();
        elementApple.click();
        elementHONOR.click();
    }
    public void clickOnProductOneAndProductTwo(){
        elementChooseNumberOne.click();
        elementChooseNumberThree.click();
    }
    public void clickOnLinkCompareProducts(){
        elementLinkCompareProducts.click();
    }
}
