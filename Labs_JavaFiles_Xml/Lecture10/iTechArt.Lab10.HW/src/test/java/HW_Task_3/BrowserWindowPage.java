package HW_Task_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BrowserWindowPage {
    private WebDriver driver;
    private WebDriverWait wait;
    public BrowserWindowPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements( driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }
    @FindBy(xpath = "//h5[text()= 'Alerts, Frame & Windows']") WebElement elementHeaderText;
    @FindBy(xpath = "//*[text() = 'Nested Frames']")WebElement elementNestedFrames;
    @FindBy(xpath = "//*[contains(text(), 'Parent frame')]")WebElement elementParent;
    public void clickOnHeadertext(){
        elementHeaderText.click();
    }
    public void clickOnNestedFrames(){
        elementNestedFrames.click();
    }
    public void assertParentText(){
        wait.until(ExpectedConditions.visibilityOf(elementParent));
        System.out.println(elementParent.getText() + " element is visible");
    }
}
