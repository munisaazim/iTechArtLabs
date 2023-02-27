package Users_Task_Five;

import Actions_Task_Three.ActionPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class UserPage {
    private WebDriver driver;
    private String getUrl;
    private Actions actions;

    public UserPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements( driver, this);
        actions = new Actions(driver);
    }
    @FindBy(xpath = "(//*[@src ='/img/avatar-blank.jpg'])[1]") WebElement elementImgSrc;
    @FindBy(xpath = "//*[@href ='/users/1']") WebElement elementUsersHref;
    public void firstUser(){
        this.getUrl = driver.getCurrentUrl();
        actions.moveToElement(elementImgSrc);
        actions.moveToElement(elementImgSrc).build().perform();
        elementImgSrc.click();
    }
    public void goToParentPage(){
        driver.get(getUrl);
    }
}
