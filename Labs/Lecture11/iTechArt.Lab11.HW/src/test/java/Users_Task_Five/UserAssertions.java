package Users_Task_Five;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class UserAssertions {
    private WebDriver driver;

    public UserAssertions(WebDriver driver){
        this.driver = driver;
    }
    public void assertMainPage(String text){
        Assert.assertEquals(text, "Hovers");
    }
    public void assertUserPage(String text){
        Assert.assertEquals(text, "http://the-internet.herokuapp.com/users/1");
    }
}
