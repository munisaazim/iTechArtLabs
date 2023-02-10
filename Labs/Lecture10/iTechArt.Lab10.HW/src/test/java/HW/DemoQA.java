package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DemoQA {
    private WebDriver driver;
    private DemoQASetUp setUp;
    private WebDriverWait wait;
    private String url = "https://demoqa.com/";

    private int setTime;

    public DemoQA(WebDriver driver, int setTime){
        this.driver = driver;
        this.setTime = setTime;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(setTime));
    }

    protected DemoQASetUp elements(){
        return new DemoQASetUp(driver);
    }
    protected DemoQAWait waitElements(){
        return new DemoQAWait(driver,wait,setTime);
    }
    protected DemoQAAssertion assertElements(){
        return new DemoQAAssertion(driver);
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
        driver.findElement(By.xpath("//h5[text()= 'Alerts, Frame & Windows']")).click();
    }

}
