package HW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

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
    public void Test(){
            DemoQA object = new DemoQA(driver,setTime);
            object.enterPage();
            object.waitPage();
            object.assertElements();

    }
    @AfterTest
    public void quitPage(){
        driver.quit();
    }
}
