package Users_Task_Five;

import UploadImage_Task_Two.UploadImagePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC1 {
    private WebDriver driver;
    private UserPage userPage;
    private String url = "http://the-internet.herokuapp.com/hovers";

    @BeforeTest
    public void setUploadImagePage(){
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }
    @Test
    public void runTests(){
        userPage = new UserPage(driver);
        userPage.firstUser();
        userPage.goToParentPage();
    }
    @AfterTest
    public void quit(){
        driver.quit();
    }
}
