package Actions_Task_Three;

import org.openqa.selenium.WebDriver;

public class ActionsSetUp {
    private WebDriver driver;
    public ActionsSetUp(WebDriver driver){
        this.driver = driver;
    }
    public void setUp(){
        driver.manage().window().maximize();
    }
}
