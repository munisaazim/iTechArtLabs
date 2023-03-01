package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage{
    private WebDriver driver;
    private BasePage basePage;

    HomePage(WebDriver driver){
        this.driver = driver;
        basePage = new BasePage(driver);
    }
    public void overrideVariables(){
        basePage.UniqueWebLocator = By.xpath("//@class = 'download-box'");
    }
    private By leftMenuDialogIconLocator = By.xpath("\"//*[@class=\\\"widget\\\"]//*[text()=\\\"Dialog\\\"]\"");
    private WebElement leftMenuDialogIcon = driver.findElement(leftMenuDialogIconLocator);

    public void clickLeftMenuDialogIcon(){
        leftMenuDialogIcon.click();
    }

}
