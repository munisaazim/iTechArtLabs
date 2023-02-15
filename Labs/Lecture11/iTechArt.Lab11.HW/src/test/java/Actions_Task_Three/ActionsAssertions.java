package Actions_Task_Three;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ActionsAssertions {
    private WebDriver driver;
    public ActionsAssertions(WebDriver driver) {
        this.driver = driver;
    }
    public void assertText(String text){
        Assert.assertEquals(text, "0.5");
    }
}
