package Handles_Task_Four;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlesSetUp {
    private WebDriver driver;

    public HandlesSetUp(WebDriver driver){
        this.driver = driver;
    }
    public void setUp(){
        driver.manage().window().maximize();
    }
}
