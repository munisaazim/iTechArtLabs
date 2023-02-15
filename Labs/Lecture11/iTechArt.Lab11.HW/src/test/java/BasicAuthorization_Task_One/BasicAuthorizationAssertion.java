package BasicAuthorization_Task_One;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BasicAuthorizationAssertion {
    private WebDriver driver;

    public BasicAuthorizationAssertion(WebDriver driver){
        this.driver = driver;
    }
    public void checkText(String text){
        Assert.assertEquals(text, "Congratulations! You must have the proper credentials.");
    }
}
