package HW_Task_3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BrowserWindow {
    private WebDriver driver;
    private BrowserWindowSetUp setUp;
    private WebDriverWait wait;
    private String url = "https://demoqa.com/";
    private int setTime;
    private JavascriptExecutor js;
    protected WebElement element;
    protected By xpathHeader = By.xpath("//h5[text()= 'Alerts, Frame & Windows']");
    protected By xpathButton = By.xpath("//*[@id = 'alertButton']");
    protected By xpathConfirmClick = By.xpath("//*[@id='timerAlertButton']");
    protected By xpathPrompt = By.xpath("//*[@id='promtButton']");
    public BrowserWindow(WebDriver driver, int setTime){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(setTime));
        this.js = (JavascriptExecutor) driver;
    }

    protected BrowserWindowSetUp elements(){
        return new BrowserWindowSetUp(driver);
    }
    protected BrowserWindowWait waitElements(){
        return new BrowserWindowWait(driver,wait,setTime);
    }
    protected BrowserWindowAssertion assertElements(){
        return new BrowserWindowAssertion(driver);
    }
    private BrowserWindowClicks clicks(){
        return new BrowserWindowClicks(driver);
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
        driver.findElement(By.xpath("//*[text() = 'Nested Frames']")).click();
    }
    public void assertAlertsForm(){
        assertElements().AssertAlertFormText();
    }
    public void assertParent(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        //element = wait.until(driver.findElement(By.xpath("//*[text()= 'Parent frame']")).getText());
        System.out.println(driver.findElement(By.xpath("//*[text()= 'Parent frame']")).getText());
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()= 'Parent frame']")));
        assertElements().AssertParent();
    }
    public void assertChild(){
        assertElements().AssertChild();
    }
}
