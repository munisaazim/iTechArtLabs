package HW_Task_1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class DemoQAClicks {
    private WebDriver driver;
    private JavascriptExecutor js;
    private Alert alert;

    public DemoQAClicks(WebDriver driver){
        this.driver = driver;
    }
    public void clickOnAlertButton(By xpath){
        driver.findElement(xpath).click();
    }

    public String getAlertMessage(){
        alert = driver.switchTo().alert();
        return driver.switchTo().alert().getText();
    }
    public void acceptAlert(){
        alert = driver.switchTo().alert();
        alert.accept();
    }
    public void promptSendKeys(){
        alert = driver.switchTo().alert();
        alert.sendKeys("Munisa");
    }

}
