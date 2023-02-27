package BasicAuthorization_Task_One;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC1 {
    private WebDriver driver;
    private BasicAuthorizationPage basicAuthorizationPage;

    @BeforeTest
    public void setUp(){
        this.driver = new ChromeDriver();
        basicAuthorizationPage = new BasicAuthorizationPage(driver);
        basicAuthorizationPage.enterMainPageSetUp();
    }
    @Test
    public void runTests(){
        basicAuthorizationPage.checkText();
    }
    @AfterTest
    public void quit(){
        driver.quit();
    }
}
