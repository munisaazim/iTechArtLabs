package HW_Task_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoQATest {
    private WebDriver driver;
    private WebDriverWait wait;

    private int setTime = 30;

    @BeforeTest
    public void setDriver(){
        driver = new ChromeDriver();
        //wait =  new WebDriverWait(driver, Duration.ofSeconds(setTime));
    }
    @Test
    public void Test() throws InterruptedException {
            DemoQA object = new DemoQA(driver,setTime);
            object.enterPage();
            object.waitPage();
            //object.assertElements();
            object.assertPage();
            object.clickOnAlerts();
            object.assertAlertForm();
            object.clickOnAlertsText();
            object.clickOnElement();
            object.assertTextInAlert();
            object.acceptAlert();
            object.assertClosedAlertWindow();
            object.clickOnConfirmButton();
            object.assertTextInAlertClicked();
            object.acceptAlertClicked();
            object.clickOnPromptButton();
            object.sendKeysForAlert();
            object.acceptPrompt();

    }
   // @AfterTest
   // public void quitPage(){
     //   driver.quit();
    //}
}
