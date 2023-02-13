package HW_Task_1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DemoQAssertion {
    private WebDriver driver;
    private JavascriptExecutor js;

    protected By alertLocator = By.xpath(".//*[@src= '/images/Toolsqa.jpg']");
    protected By alertForm = By.xpath("//*[@class = 'header-text'and text()= 'Alerts, Frame & Windows']");
    protected By alertButton = By.xpath("//*[@id = 'javascriptAlertsWrapper']");

    protected String alertClosedMessage = "Click Button to see alert ";
    public DemoQAssertion(WebDriver driver){
        this.driver = driver;
        js = (JavascriptExecutor) driver;
    }
    public void AssertionMainPage(){
        Assert.assertTrue(driver.findElement(alertLocator).isDisplayed());
    }
    public void AssertAlertForm(){
        Assert.assertTrue(driver.findElement(alertForm).isDisplayed());
    }
    public void AssertAlertFormText(){
        Assert.assertTrue(driver.findElement(alertButton).isDisplayed());
    }
    public void AssertAlertWindow(String message){
        Assert.assertEquals(driver.switchTo().alert().getText(), message);
    }
    public void AssertMainPageText(By xpath, String text){
        Assert.assertEquals(driver.findElement(xpath).getText(), text);
    }
    public void AlertAcceptedText(String text){
        Assert.assertEquals(text, "You clicked a button");
    }
    public void AssertClosedWindow(){
        Assert.assertTrue(driver.findElement(By.xpath("//*[text() ='Click Button to see alert ']")).isDisplayed());
    }
    public void AlertButtonAcceptedText(String text){
        Assert.assertEquals(text, "This alert appeared after 5 seconds");
    }
    public void AseertTextForPrompt(){
        Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(), 'You entered ')]")).isDisplayed());
    }


}
