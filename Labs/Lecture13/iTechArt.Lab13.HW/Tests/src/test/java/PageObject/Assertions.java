package PageObject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Assertions {
    private WebDriver driver;
    Assertions(WebDriver driver){
        this.driver = driver;
    }
    public void checkMainPage(String text){
        String url = "https://www.mediapark.uz/products/category/8";
        Assert.assertEquals(text, url);
    }

}
