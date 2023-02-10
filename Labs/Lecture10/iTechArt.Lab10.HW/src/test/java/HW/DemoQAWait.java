package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DemoQAWait {
    private WebDriver driver;
    private By waitOpened = By.xpath("//img[@src = '/images/Toolsqa.jpg']");
    private WebDriverWait wait;
    private DemoQAAssertion demoQAAssertion;
    private WebElement pageOpened;
    private WebElement pageAlert;

    private DemoQAWait demo;
    private int setTime;
    public DemoQAWait(WebDriver driver, WebDriverWait wait, int setTime){
        this.driver = driver;
        demoQAAssertion = new DemoQAAssertion(driver);
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
    public void waitAlert(){

    }

}
