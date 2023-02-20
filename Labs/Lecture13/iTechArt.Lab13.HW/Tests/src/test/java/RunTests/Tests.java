package RunTests;

import PageObject.Functions;
import com.namespace.BrowserSettings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tests {
    private WebDriver driver;
    private BrowserSettings browserSettings;
    protected String url = "https://www.mediapark.uz/products/category/8";
    protected By loc;
    private Functions functions;
    @BeforeTest
    public void setDriver(){
        this.driver = new ChromeDriver();
        this.functions = new Functions(loc, driver);
    }
    @Test
    public void runAllTests(){
        functions.enterPage(url);
        functions.assertMainPage();
        functions.clickOnProductOne();
    }
    //@AfterTest
    //public void TearDown(){
      //  functions.TearDown();
    //}

}
