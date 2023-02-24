package HW_Task_1;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DemoQAPage {
    private WebDriver driver;
    private Alert alert;
    private String messagePrompt = "Munisa";
    DemoQAPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements( driver, this);
    }
    @FindBy(xpath = "//h5[text() = \"Alerts, Frame & Windows\"]") WebElement elementHeaderText;
    @FindBy(xpath = "//*[text() = 'Alerts']") WebElement elementAlertForm;
    @FindBy(id = "alertButton")WebElement AlertButtonInForm;
    @FindBy(xpath = "//*[@id='promtButton']") WebElement elementPrompt;
    @FindBy(xpath = "//span[contains(text(), 'You entered ')]")WebElement elementPromptText;
    public void clickOnHeaderText() {
        System.out.println(elementHeaderText);
        elementHeaderText.click();
    }
    public  void clickOnAlertForm(){
        elementAlertForm.click();
    }
    public void clickOnAlertButtonInForm(){
        AlertButtonInForm.click();
    }
    public void assertTextAppears(){
        this.alert = driver.switchTo().alert();
        String text = alert.getText();
        Assert.assertTrue(text.contains("You clicked a button"));
    }
    public void acceptAlert(){
        alert.accept();
    }
    public void clickOnPromptButton(){
        elementPrompt.click();
    }
    public void sendMessageForPrompt(){
        alert = driver.switchTo().alert();
        alert.sendKeys(messagePrompt);
    }
    public void acceptPrompt() {
        alert.accept();
    }
    public void checkPromptText(){
        Assert.assertTrue(elementPromptText.isDisplayed());
    }

}
