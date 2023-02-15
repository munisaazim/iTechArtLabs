package Users_Task_Five;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;

public class UserFunctions {
    private WebDriver driver;
    private JavascriptExecutor js;
    private String getUrl;
    public UserFunctions(WebDriver driver){
        this.driver = driver;
        this.js = (JavascriptExecutor)driver;
    }
    protected UserSetUp userSetUp(){
        return new UserSetUp(driver);
    }
    protected UserAssertions userAssertions(){
        return new UserAssertions(driver);
    }
    public void enterMainPage(){
        userSetUp().setUp();
        driver.get("http://the-internet.herokuapp.com/hovers");
    }
    public void firstUser() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("(//*[@src ='/img/avatar-blank.jpg'])[1]"));
        this.getUrl = driver.getCurrentUrl();
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        Thread.sleep(30);
        By userClick = By.xpath("//*[@href ='/users/1']");
        WebElement element2 = driver.findElement(userClick);
        //driver.findElement(userClick).click();
        actions.moveToElement(element2).build().perform();
        this.js.executeScript("arguments[0].click()", element2);
    }
    public void goToParebtPage(){
        driver.switchTo().window(getUrl);
    }
}
