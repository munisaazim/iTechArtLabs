package Users_Task_Five;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UserTests {
    private WebDriver driver;

    @BeforeTest
    public void setUp(){
        this.driver = new ChromeDriver();
    }
    @Test
    public void test() throws InterruptedException {
        UserFunctions userFunctions = new UserFunctions(driver);
        userFunctions.enterMainPage();
        userFunctions.assertMainPage();
        userFunctions.firstUser();
        userFunctions.firsrUserPage();
        userFunctions.goToParentPage();
        userFunctions.assertMainPage();
    }
}
