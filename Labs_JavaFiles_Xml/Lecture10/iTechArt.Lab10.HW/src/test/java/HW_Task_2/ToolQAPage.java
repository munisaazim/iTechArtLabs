package HW_Task_2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;

public class ToolQAPage {
    private WebDriver driver;
    private JavascriptExecutor js;

    public ToolQAPage(WebDriver driver){
        this.driver = driver;
        js = (JavascriptExecutor) driver;
        PageFactory.initElements( driver, this);
    }
    @FindBy(xpath = "//*[text()= 'Widgets']") WebElement elementHeader;
    @FindBy(xpath = "//*[text() ='Progress Bar']") WebElement elementProgressBar;
    @FindBy(xpath = "//*[text() ='Start']") WebElement elementStart;
    @FindBy(xpath = "//*[text() = 'Stop']") WebElement elementStop;
    public void clickOnHeaderText(){
        elementHeader.click();
    }
    public void clickOnProgressBar(){
        js.executeScript("arguments[0].scrollIntoView();",elementProgressBar);
        elementProgressBar.click();
    }
    public void clickOnStart(){
        elementStart.click();
    }
    public void clickOnStop(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        elementStop.click();
    }


}
