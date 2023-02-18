package Users_Task_Five;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.webaudio.model.AudioListenerWillBeDestroyed;

public class UserSetUp {
    private WebDriver driver;
    public UserSetUp(WebDriver driver){
        this.driver = driver;
    }
    public void setUp(){
        driver.manage().window().maximize();
    }
}
