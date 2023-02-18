package HW_Task_3;

import org.openqa.selenium.WebDriver;

public class BrowserWindowSetUp {
    private WebDriver driver;

    public BrowserWindowSetUp(WebDriver driver){
        this.driver = driver;
    }

    public void setUp(){
        driver.manage().window().maximize();
    }
}
