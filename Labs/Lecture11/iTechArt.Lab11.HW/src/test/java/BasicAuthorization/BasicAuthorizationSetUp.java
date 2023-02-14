package BasicAuthorization;

import org.openqa.selenium.WebDriver;

public class BasicAuthorizationSetUp {
    private WebDriver driver;

    public BasicAuthorizationSetUp(WebDriver driver){
        this.driver = driver;
    }
    public void setUp(){
        driver.manage().window().maximize();
    }
}
