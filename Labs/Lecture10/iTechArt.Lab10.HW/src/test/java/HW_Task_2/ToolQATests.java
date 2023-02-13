package HW_Task_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToolQATests {
    private WebDriver driver;
    @BeforeTest
    public void setDriver(){
        driver = new ChromeDriver();
        //wait =  new WebDriverWait(driver, Duration.ofSeconds(setTime));
    }
    @Test
    public void Tests(){
        ToolQA toolQA = new ToolQA(driver);
        toolQA.enterPage();
        toolQA.clickOnWidgets();
        toolQA.assertMainPage();
        toolQA.clickOnProgressBar();
        toolQA.clickOnStart();
        toolQA.clickOnStop();
    }
}
