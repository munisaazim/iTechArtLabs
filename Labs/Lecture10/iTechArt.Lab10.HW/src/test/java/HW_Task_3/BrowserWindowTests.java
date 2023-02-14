package HW_Task_3;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class BrowserWindowTests {
    private WebDriver driver;
    private WebDriverWait wait;

    private int setTime = 30;

    @BeforeTest
    public void setDriver() {
        driver = new ChromeDriver();
        //wait =  new WebDriverWait(driver, Duration.ofSeconds(setTime));
    }

    @Test
    public void Test() throws InterruptedException {
        BrowserWindow object = new BrowserWindow(driver, setTime);
        object.enterPage();
        object.waitPage();
        //object.assertElements();
        object.assertPage();
        object.clickOnAlerts();
        object.assertAlertForm();
        object.clickOnAlertsText();
        object.assertAlertsForm();
        object.assertParent();
        object.assertChild();

    }
}
