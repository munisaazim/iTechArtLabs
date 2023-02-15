package Actions_Task_Three;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionsTests {
    private WebDriver driver;

    @BeforeTest
    public void setDriver(){
        this.driver = new ChromeDriver();
    }

    @Test
    public void Test(){
        ActionsFunctions actionsFunctions = new ActionsFunctions(driver);
        actionsFunctions.openMainPage();
        actionsFunctions.clickOnSlider();
    }
}
