package Handles_Task_Four;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class HandlesPage {
    private WebDriver driver;
    private Set<String> originalWindow;
    private Iterator<String> it;
    private String child;
    private String parent;
    private  int tabSize;
    WebDriverWait wait;
    HandlesPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements( driver, this);
    }
    @FindBy(xpath = "//a[text()= 'Click Here']") WebElement elementHereButton;
    @FindBy(xpath = "//h3") WebElement elementChildPageText;
    public void clickOnHreButton(){
        //wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        //wait.until(ExpectedConditions.visibilityOf(elementHereButton));
        elementHereButton.click();
        this.originalWindow = driver.getWindowHandles();
        this.it = originalWindow.iterator();
        this.parent =  it.next();
        this.child = it.next();
        driver.switchTo().window(this.child);
        Assert.assertTrue(elementChildPageText.getText().contains("New Window"));
    }
    public void switchToParent(){
        driver.switchTo().window(this.parent);
        driver.close();
        Set<String> allWindowHandles = driver.getWindowHandles();
        ArrayList<String> tabs = new ArrayList<String>(allWindowHandles);
        this.tabSize = tabs.size();
    }
    public void switchToChild(){
        driver.switchTo().window(this.child);
        driver.close();
    }
}
