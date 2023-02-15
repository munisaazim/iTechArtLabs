package UploadImage_Task_Two;

import org.openqa.selenium.WebDriver;

public class UploadImageSetUP {
    private WebDriver driver;
    public UploadImageSetUP(WebDriver driver){
        this.driver = driver;
    }
    public void setUp(){
        driver.manage().window().maximize();
    }
}
