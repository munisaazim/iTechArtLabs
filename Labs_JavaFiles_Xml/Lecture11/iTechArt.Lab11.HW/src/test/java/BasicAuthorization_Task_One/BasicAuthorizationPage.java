package BasicAuthorization_Task_One;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BasicAuthorizationPage {
    private WebDriver driver;
    private String username = "admin";
    private String password = "admin";
    private String page = "the-internet.herokuapp.com/basic_auth";
    private String url;
    public BasicAuthorizationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements( driver, this);
    }
    public void enterMainPageSetUp(){
        driver.manage().window().maximize();
        url = "https://" + username + ":" + password + "@" + page;
        driver.get(url);
    }
    @FindBy(css ="div.example p") WebElement elementText;
    public void checkText(){
        String text = elementText.getText().trim();
        Assert.assertTrue(text.contains("Congratulations! You must have the proper credentials."));
    }

}
