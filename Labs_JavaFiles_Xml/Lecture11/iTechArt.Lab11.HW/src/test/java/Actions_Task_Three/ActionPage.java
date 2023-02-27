package Actions_Task_Three;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ActionPage {
    private WebDriver driver;

    public ActionPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements( driver, this);
    }

    @FindBy(xpath = "//*[@type =\"range\"]") WebElement elementSlider;
    @FindBy(xpath = "//*[@id = 'range']") WebElement elementAssert;

    public void clickOnSlider() {
        elementSlider.sendKeys(Keys.ARROW_RIGHT);
    }
    public void assertText(){
        Assert.assertTrue(elementAssert.getText().contains("0.5"));
    }
}
