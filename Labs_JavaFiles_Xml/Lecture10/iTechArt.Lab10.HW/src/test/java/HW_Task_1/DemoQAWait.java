package HW_Task_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DemoQAWait {
    private WebDriver driver;
    private By waitOpened = By.xpath("//img[@src = '/images/Toolsqa.jpg']");

    private By waitAlert = By.xpath("//h5[text()= 'Alerts, Frame & Windows']");
    private WebDriverWait wait;
    private DemoQAssertion demoQAAssertion;
    private WebElement pageOpened;
    private WebElement pageAlert;
    private WebElement waitAlertElement;

    private DemoQAWait demo;
    private int setTime;
    public DemoQAWait(WebDriver driver, WebDriverWait wait, int setTime){
        this.driver = driver;
        demoQAAssertion = new DemoQAssertion(driver);
        this.setTime = setTime;
        this.wait = wait;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(setTime));
    }
    public void setWaitTime(int n){
        //demo = new DemoQAWait(driver, wait);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(n));
    }
    public void waitOpenPage(){
        pageOpened = wait.until(ExpectedConditions.visibilityOfElementLocated(waitOpened));
    }
    public void waitImplicit(int number){driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(number));}
    public void waitAlert(){
        waitAlertElement = wait.until(ExpectedConditions.elementToBeClickable(waitAlert));
    }
    public void waitUntil(WebElement element, int waitTime, By xpathWay){
        element = wait.until(ExpectedConditions.elementToBeClickable(xpathWay));
    }
    public void waitAlertOK(){
        wait.until(ExpectedConditions.alertIsPresent());
    }
}