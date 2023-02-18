package HW_Task_2;

import org.openqa.selenium.WebDriver;

public class ToolQASetUp {
    private WebDriver driver;

    public ToolQASetUp(WebDriver driver){
        this.driver = driver;
    }

    public void setUp(){
        driver.manage().window().maximize();
    }
}
