package UploadImage_Task_Two;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UploadImageTests {
    private WebDriver driver;
    @BeforeTest
    public void setDriver(){
        driver = new ChromeDriver();
    }
    @Test
    public void test(){
        UploadImage uploadImage = new UploadImage(driver);
        uploadImage.enterMainPage();
        uploadImage.sendImage();
        uploadImage.clickOnUpload();
        uploadImage.assertFileUpload();
    }
    @AfterTest
    public void quit(){
        driver.quit();
    }
}
