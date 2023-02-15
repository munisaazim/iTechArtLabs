package Handles_Task_Four;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class HandlesFunctions {
    private WebDriver driver;
    private Set <String> originalWindow;
    private WebDriverWait wait;
    private Iterator <String> it;
    private String child;
    private String parent;
    private  int tabSize, tabSizeTwo;

    public HandlesFunctions(WebDriver driver){
        this.driver = driver;
    }
    protected HandlesAssertions assertions(){
        return new HandlesAssertions(driver);
    }
    protected HandlesSetUp setUp(){
        return new HandlesSetUp(driver);
    }
    public void openPage(){
        setUp().setUp();
        driver.get("http://the-internet.herokuapp.com/windows");
        WebElement element = driver.findElement(By.xpath("//h3"));
        String text = element.getText();
        assertions().assertMainPage(text);
    }
    public void clickOnHere(){
        driver.findElement(By.xpath("//*[text()= 'Click Here']")).click();
        //wait.until(numberOfWindowsToBe(2));
        this.originalWindow = driver.getWindowHandles();
        this.it = originalWindow.iterator();
        this.parent =  it.next();
        System.out.println("Parent:" + this.parent);
        this.child = it.next();
        System.out.println("Child:" + this.child);
        driver.switchTo().window(this.child);
        String text = driver.findElement(By.xpath("//h3")).getText();
        assertions().assertChildPage(text);
    }
    public void switchToParent(){
        driver.switchTo().window(this.parent);
        driver.close();
        Set<String> allWindowHandles = driver.getWindowHandles();
        ArrayList<String> tabs = new ArrayList<String>(allWindowHandles);
        System.out.println("No. of tabs: " + tabs.size());
        this.tabSize = tabs.size();
    }
    public void assertTabSize(){
        assertions().assertTabSize(tabSize);
    }
    public void switchToChild(){
        driver.switchTo().window(this.child);
        driver.close();
    }

}
