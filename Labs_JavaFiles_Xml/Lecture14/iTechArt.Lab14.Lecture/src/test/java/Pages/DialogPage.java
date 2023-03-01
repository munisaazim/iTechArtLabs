package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DialogPage {
    private WebDriver driver;
    private BasePage basePage;

    public DialogPage(WebDriver driver){
        this.driver = driver;
        this.basePage = new BasePage(driver);
    }
    public void overrideVariables(){
        basePage.UniqueWebLocator = By.xpath("//*[contains(@class, \\\"entry-title\\\") and contains(text(),\\\"Dialog\\\")]");
        basePage.urlPath = "/dialog/";
    }
    private  WebElement modalFormIcon = driver.findElement(By.xpath("//*[@class=\\\"demo-list\\\"]//*[text()=\\\"Modal form\\\"]"));
    private WebElement createUserButton = driver.findElement(By.xpath("//*[@id = 'create-user']"));
    private WebElement modalFormFrame = driver.findElement(By.xpath("//*[@class ='demo-frame']"));


}
