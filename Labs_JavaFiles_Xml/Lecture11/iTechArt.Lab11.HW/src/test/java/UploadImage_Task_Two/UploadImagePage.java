package UploadImage_Task_Two;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class UploadImagePage {
    private WebDriver driver;
    public  UploadImagePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements( driver, this);
    }
    @FindBy(xpath = "//*[@id ='file-upload']") WebElement elementUploadImg;
    @FindBy(xpath = "//*[@id ='file-submit']") WebElement elementUploadButton;
    @FindBy(xpath = "//h3") WebElement elementUploadedFileText;
    public void sendImage(){
        elementUploadImg.sendKeys("/Users/munisaazimkhodjaeva/Desktop/selenium_upload.png");
    }
    public void clickOnUpload(){
        elementUploadButton.click();
    }
    public void assertUploadedFileText(){
        Assert.assertTrue(elementUploadedFileText.getText().contains("File Uploaded!"));
    }
}
