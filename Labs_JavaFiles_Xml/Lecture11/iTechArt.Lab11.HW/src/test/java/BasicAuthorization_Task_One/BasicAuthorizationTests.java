package BasicAuthorization_Task_One;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAuthorizationTests {
    private WebDriver driver;

    @BeforeTest
    public void setDriver(){
    driver  = new ChromeDriver();
}
    @Test
    public void test(){
        BasicAuthorization  basicAuthorization = new BasicAuthorization(driver);
        basicAuthorization.enterMainPage();
        basicAuthorization.checkText();
    }
    @AfterTest
    public void quit(){
        driver.quit();
    }
}
