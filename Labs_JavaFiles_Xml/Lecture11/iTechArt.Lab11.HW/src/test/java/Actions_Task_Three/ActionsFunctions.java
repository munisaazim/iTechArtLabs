package Actions_Task_Three;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsFunctions {
    private WebDriver driver;
    private Actions actions;

    public ActionsFunctions(WebDriver driver){
        this.driver = driver;
        this.actions = new Actions(driver);
    }
    protected  ActionsSetUp actionsSetUp(){
        return new ActionsSetUp(driver);
    }
    protected ActionsAssertions actionsAssertions(){
        return new ActionsAssertions(driver);
    }
    public void openMainPage(){
        actionsSetUp().setUp();
        driver.get("http://the-internet.herokuapp.com/horizontal_slider");
    }
    public void clickOnSlider() {
        WebElement element = driver.findElement(By.xpath("//*[@type =\"range\"]"));
        element.sendKeys(Keys.ARROW_RIGHT);
    }
    public void assertText(){
        WebElement element = driver.findElement(By.xpath("//*[@id = 'range']"));
        String text = element.getText();
        actionsAssertions().assertText(text);
    }
}
