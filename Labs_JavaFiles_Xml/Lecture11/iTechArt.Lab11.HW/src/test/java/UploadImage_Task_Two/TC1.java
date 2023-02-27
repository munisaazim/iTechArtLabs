package UploadImage_Task_Two;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC1 {
    private WebDriver driver;
    private String pageUrl = "http://the-internet.herokuapp.com/upload";
    private UploadImagePage uploadImage;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(pageUrl);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void runTests(){
        uploadImage = new UploadImagePage(driver);
        uploadImage.sendImage();
        uploadImage.clickOnUpload();
        uploadImage.assertUploadedFileText();
    }
    @AfterTest
    public void quit(){
        driver.quit();
    }
}
