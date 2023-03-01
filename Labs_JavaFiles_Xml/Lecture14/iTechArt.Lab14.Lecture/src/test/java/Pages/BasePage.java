package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    private WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }
    protected By UniqueWebLocator;
    protected String urlPath;
    protected WebElement uniqueWebElement = driver.findElement(UniqueWebLocator);
    public boolean isPageOpened(){
        boolean isOpened;
        try {
            isOpened = uniqueWebElement.isDisplayed();

        }
        catch (Exception e){
            isOpened = false;
        }
        return isOpened;
    }
    public void WaitForPageOpened(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        try {
            wait.until(driver -> driver.findElement(UniqueWebLocator).isDisplayed());
        }
        catch (WebDriverException e){
            throw new WebDriverException("Page with locator" + UniqueWebLocator + "is not opened");
        }
    }
}
