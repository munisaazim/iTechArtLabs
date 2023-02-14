package BasicAuthorization;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasicAuthorization {
    private WebDriver driver;
    private Alert alert;
    private String username = "admin";
    private String password = "admin";
    private String page = "the-internet.herokuapp.com/basic_auth";
    private String url;

    public BasicAuthorization(WebDriver driver){
        this.driver = driver;
    }
    public BasicAuthorizationAssertion assertelements(){
        return new BasicAuthorizationAssertion();
    }
    protected BasicAuthorizationSetUp setUp(){
        return new BasicAuthorizationSetUp(driver);
    }
    public void enterMainPage(){
        setUp().setUp();
        url = "https://" + username + ":" + password + "@" + page;
        System.out.println(url);
        driver.get(url);
    }
    public void checkText(){
        String text = driver.findElement(By.cssSelector("div.example p")).getText().trim();
        assertelements().checkText(text);
    }
}
