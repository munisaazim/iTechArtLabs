package Handles_Task_Four;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandlesTests {
    private WebDriver driver;

    @BeforeTest
    public void setDriver(){
        this.driver = new ChromeDriver();
    }
    @Test
    public void test(){
        HandlesFunctions handlesFunctions = new HandlesFunctions(driver);
        handlesFunctions.openPage();
        handlesFunctions.clickOnHere();
        handlesFunctions.switchToParent();
        handlesFunctions.assertTabSize();
        handlesFunctions.switchToChild();

    }
}
