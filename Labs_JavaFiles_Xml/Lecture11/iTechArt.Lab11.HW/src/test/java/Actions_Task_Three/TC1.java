package Actions_Task_Three;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC1 {
    private WebDriver driver;
    private ActionPage actionPage;
    private String url = "http://the-internet.herokuapp.com/horizontal_slider";
    @BeforeTest
    public void setUp(){
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }
    @Test
    public void runTests(){
        actionPage = new ActionPage(driver);
        actionPage.clickOnSlider();
        actionPage.assertText();
    }
    @AfterTest
    public void quit(){
        driver.quit();
    }
}
