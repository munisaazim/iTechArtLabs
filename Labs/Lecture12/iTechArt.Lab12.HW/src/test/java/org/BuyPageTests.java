package org;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BuyPageTests extends LoggerSetUp{
    private WebDriver driver;
    @BeforeTest
    public  void classInit(){
        driver = new ChromeDriver();
        //js = (JavascriptExecutor)driver;
    }
    @Test(priority = 1, description = "Going in all tests")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case: Monitoring all test executions through processes")
    @Story("Story: Checking all tests")
    public void BuyPageTestsRun() throws InterruptedException {
        log.info("Running all tests");
        BuyPage buyPageObject = new BuyPage(driver);
        buyPageObject.js = (JavascriptExecutor)driver;
        buyPageObject.getPage();
        buyPageObject.mobileEnter();
        buyPageObject.chooseMobile();
        buyPageObject.chooseNumber();
        buyPageObject.comparePage();

    }
    @AfterTest
    public void testQuit(){
        driver.quit();
    }
}