package HW_Task_3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BrowserWindowAssertion {
    private WebDriver driver;
    private JavascriptExecutor js;

    protected By alertLocator = By.xpath(".//*[@src= '/images/Toolsqa.jpg']");
    protected By alertForm = By.xpath("//*[@class = 'header-text'and text()= 'Alerts, Frame & Windows']");
    protected By alertButton = By.xpath("//iframe[@src = '/sampleiframe']");

    protected String alertClosedMessage = "Click Button to see alert ";
    public BrowserWindowAssertion(WebDriver driver){
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
    public void AssertParent(){
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()= 'Parent frame']")).isDisplayed());
    }
    public void AssertChild(){
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()= 'Child Iframe']")).isDisplayed());
    }
}
