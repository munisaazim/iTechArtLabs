package HW_Task_2;

import HW_Task_1.DemoQASetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.regex.Pattern;

public class ToolQA {
    private WebDriver driver;
    private JavascriptExecutor js;
    private String mainPage= "https://demoqa.com";
    protected By xpathHeader = By.xpath("//*[text()= 'Widgets']");
    protected By xpathProgressBar = By.xpath("//*[text() ='Progress Bar']");

    private WebDriverWait wait;

    public ToolQA(WebDriver driver){
        this.driver = driver;
        this.js = (JavascriptExecutor) driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }
    public ToolQASetUp demoSetUp(){
        return new ToolQASetUp(driver);
    }
    public ToolQAssertions asserts(){
        return new ToolQAssertions(driver);
    }
    public void enterPage(){
        demoSetUp().setUp();
        driver.get(mainPage);
    }
    public void clickOnWidgets(){
        wait.until(ExpectedConditions.elementToBeClickable(xpathHeader));
        js.executeScript("arguments[0].click();", driver.findElement(xpathHeader));
    }
    public void assertMainPage(){
        asserts().AssertionMainPage();
    }
    public void clickOnProgressBar(){
        js.executeScript("arguments[0].click();", driver.findElement(xpathProgressBar));
        //driver.findElement(By.xpath("//*[text() ='Progress Bar']")).click();
    }
    public void clickOnStart(){
        driver.findElement(By.xpath("//*[text() ='Start']")).click();
    }
    public void clickOnStop(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@aria-valuenow = '46']")));
        driver.findElement(By.xpath("//*[text() = 'Stop']")).click();
    }


}
