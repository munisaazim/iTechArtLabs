package Handles_Task_Four;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC1 {
    private WebDriver driver;
    private HandlesPage handlesPage;
    private String url = "http://the-internet.herokuapp.com/windows";

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }
    @Test
    public void runTests(){
        handlesPage = new HandlesPage(driver);
        handlesPage.clickOnHreButton();
        handlesPage.switchToParent();
        handlesPage.switchToChild();
    }
    @AfterTest
    public void quit(){
        driver.quit();
    }
}
