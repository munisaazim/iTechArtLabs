package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DemoQAAssertion {
    private WebDriver driver;
    public DemoQAAssertion(WebDriver driver){
        this.driver = driver;
    }
    public void AssertionMainPage(){
        Assert.assertTrue(driver.findElement(By.xpath("")).isDisplayed());
    }
}
