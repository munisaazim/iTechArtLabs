package PageObject;

import com.namespace.BaseElement;
import com.namespace.BrowserSettings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Functions extends BaseElement{
    private WebDriver driver;

    public Functions(By loc,WebDriver driver) {
        super(loc, driver);
        this.driver = driver;
        browserSettings().MaximizeWindow();
    }


    protected BrowserSettings browserSettings(){
        return new BrowserSettings(driver);
    }
    protected Assertions assertions(){
        return new Assertions(driver);
    }

    public void enterPage(String url){
        driver.get(url);
    }
    public void assertMainPage(){
        String getUrl = driver.getCurrentUrl();
        assertions().checkMainPage(getUrl);
    }
    public void clickOnProductOne(){By loc = By.xpath("//*[@data-product = '16470']");

       Click();
    }
    public void TearDown(){
        browserSettings().ExitWindow();
    }
}
