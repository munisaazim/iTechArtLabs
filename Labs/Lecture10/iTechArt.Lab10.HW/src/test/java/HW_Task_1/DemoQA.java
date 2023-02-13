

package HW_Task_1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DemoQA {
    private WebDriver driver;
    private DemoQASetUp setUp;
    private WebDriverWait wait;
    private String url = "https://demoqa.com/";
    private int setTime;
    private JavascriptExecutor js;
    protected By xpathHeader = By.xpath("//h5[text()= 'Alerts, Frame & Windows']");
    protected By xpathButton = By.xpath("//*[@id = 'alertButton']");
    protected By xpathConfirmClick = By.xpath("//*[@id='timerAlertButton']");
    protected By xpathPrompt = By.xpath("//*[@id='promtButton']");
    public DemoQA(WebDriver driver, int setTime){
        this.driver = driver;
        this.setTime = setTime;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(setTime));
        this.js = (JavascriptExecutor) driver;
    }

    protected DemoQASetUp elements(){
        return new DemoQASetUp(driver);
    }
    protected DemoQAWait waitElements(){
        return new DemoQAWait(driver,wait,setTime);
    }
    protected DemoQAssertion assertElements(){
        return new DemoQAssertion(driver);
    }
    private DemoQAClicks clicks(){
        return new DemoQAClicks(driver);
    }
    public void enterPage(){
        elements().setUp();
        driver.get(url);
    }
    public void waitPage(){
        //waitElements().setWaitTime(i);
        waitElements().waitOpenPage();
    }
    public void assertPage(){
        assertElements().AssertionMainPage();
    }
    public void clickOnAlerts(){
        waitElements().waitAlert();
        js.executeScript("arguments[0].click();", driver.findElement(xpathHeader));
    }
    public void assertAlertForm(){
        assertElements().AssertAlertForm();
    }
    public void clickOnAlertsText(){
        driver.findElement(By.xpath("//*[text() = 'Alerts']")).click();
    }
    public void assertAlertsForm(){
        assertElements().AssertAlertFormText();
    }
    public void clickOnElement(){
        clicks().clickOnAlertButton(xpathButton);
    }

    public void assertTextInAlert(){
        String text = clicks().getAlertMessage();
        assertElements().AlertAcceptedText(text);
    }
    public void acceptAlert(){
        clicks().acceptAlert();
    }
    public void assertClosedAlertWindow(){
        assertElements().AssertClosedWindow();
    }
    public void clickOnConfirmButton(){
        clicks().clickOnAlertButton(xpathConfirmClick);
    }
    public void assertTextInAlertClicked(){
        waitElements().waitImplicit(7);
        waitElements().waitAlertOK();
        String text = clicks().getAlertMessage();
        assertElements().AlertButtonAcceptedText(text);
    }
    public void acceptAlertClicked(){
        clicks().acceptAlert();
    }
    public void clickOnPromptButton(){
        clicks().clickOnAlertButton(xpathPrompt);
    }
    public void sendKeysForAlert(){
        clicks().promptSendKeys();
    }
    public void acceptPrompt(){
        clicks().acceptAlert();
    }
    public void assertTextForPrompt(){
        assertElements().AseertTextForPrompt();
    }

}