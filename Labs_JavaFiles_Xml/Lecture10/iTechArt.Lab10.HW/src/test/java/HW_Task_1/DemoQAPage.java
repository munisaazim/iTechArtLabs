package HW_Task_1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoQAPage {
    private WebDriver driver;
    private Alert alert;
    DemoQAPage(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(xpath = "\"//*[@id = 'alertButton']\"") WebElement elementAlertButton;
    public void clickOnAlertButton(){
        elementAlertButton.click();
    }
    @FindBy(xpath = "\"//*[text() = 'Alerts']\"") WebElement elementAlertForm;
    public  void clickOnAlertForm(){
        elementAlertButton.click();
    }
    @FindBy(id = "alertButton")WebElement AlertButtonInForm;
    public void clickOnAlertButtonInForm(){
        AlertButtonInForm.click();
    }
    public void assertTextAppears(){
        alert =
    }

}
