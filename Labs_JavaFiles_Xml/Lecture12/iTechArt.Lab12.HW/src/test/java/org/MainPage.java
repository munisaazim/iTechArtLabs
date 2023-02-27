package org;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends LoggerSetUp{
    WebDriver driver;

    public MainPage( WebDriver driver ) {
        this.driver = driver;
        PageFactory.initElements( driver, this);
    }
    @FindBy(xpath = "//*[@href = 'https://catalog.onliner.by/mobile']") WebElement elementMobile;
    @Step("Entering page")
    public void clickOnMobileLink(){
        log.info("Clicking on link");
        elementMobile.click();
    }
}
