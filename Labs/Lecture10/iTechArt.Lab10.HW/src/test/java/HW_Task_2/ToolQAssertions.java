package HW_Task_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ToolQAssertions {
    private WebDriver driver;
    protected By alertLocator = By.xpath("//*[@class = \"element-list collapse show\"]");
    protected By xpathHeader = By.xpath("//h5[text()= 'Alerts, Frame & Windows']");

    public ToolQAssertions(WebDriver driver){
        this.driver = driver;
    }
    public void AssertionMainPage(){
        Assert.assertTrue(driver.findElement(alertLocator).isDisplayed());
    }


}
