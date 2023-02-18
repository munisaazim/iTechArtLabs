package UploadImage_Task_Two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class UploadImage {
    private WebDriver driver;
    private String url = "http://the-internet.herokuapp.com/upload";

    public UploadImage(WebDriver driver){
        this.driver = driver;
    }
    public UploadImageSetUP setUp(){
        return new UploadImageSetUP(driver);
    }
    public UploadImageAssertions assertelements(){
        return new UploadImageAssertions(driver);
    }
    public void enterMainPage(){
        setUp().setUp();
        driver.get(url);
    }
    public void sendImage(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath("//*[@id ='file-upload']"));
        element.sendKeys("/Users/munisaazimkhodjaeva/Desktop/img_0111.png ");
    }
    public void clickOnUpload(){
        driver.findElement(By.xpath("//*[@id ='file-submit']")).click();
    }
    public void assertFileUpload(){
        String text = driver.findElement(By.xpath("//h3")).getText();
        assertelements().assertFileUpload(text);
    }

}
