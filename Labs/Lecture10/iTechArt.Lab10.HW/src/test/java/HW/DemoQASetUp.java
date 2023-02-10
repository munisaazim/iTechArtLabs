package HW;

import org.openqa.selenium.WebDriver;

public class DemoQASetUp {
    private WebDriver driver;

    public DemoQASetUp(WebDriver driver){
        this.driver = driver;
    }

    public void setUp(){
        driver.manage().window().maximize();
    }
}
