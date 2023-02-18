package Handles_Task_Four;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HandlesAssertions {
    private WebDriver driver;

    public HandlesAssertions(WebDriver driver){
        this.driver = driver;
    }
    public void assertMainPage(String text){
        Assert.assertEquals(text, "Opening a new window");
    }
    public void assertChildPage(String text){
        Assert.assertEquals(text, "New Window");
    }
    public void assertTabSize(int size){
       if(size==1){
           System.out.println("Checked child: 1");
       }
    }
    public void assertTabSizeTwo(int size){
        if(size==0){
            System.out.println("Checked child: 0");
        }
    }
}
