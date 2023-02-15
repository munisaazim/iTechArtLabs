package UploadImage_Task_Two;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class UploadImageAssertions {
    private WebDriver driver;
    public UploadImageAssertions(WebDriver driver) {
        this.driver = driver;
    }
    public void assertFileUpload(String text){
        Assert.assertEquals(text, "File Uploaded!");
    }
}
