package namespace.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    WebDriver driver;
    public MainPage( WebDriver driver ) {
        this.driver = driver;
        PageFactory.initElements( driver, this);
    }
    @FindBy(xpath = "//*[@href = 'https://catalog.onliner.by/mobile']") WebElement elementMobile;
    public void clickOnMobileLink(){
        elementMobile.click();
    }
}
