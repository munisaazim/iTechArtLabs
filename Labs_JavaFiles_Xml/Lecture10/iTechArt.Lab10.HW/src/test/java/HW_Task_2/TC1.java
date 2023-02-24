package HW_Task_2;

import HW_Task_1.DemoQAPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC1 {
    private WebDriver driver;
    private String url = "https://demoqa.com/";
    private JavascriptExecutor j;
    private ToolQAPage toolQAPage;

    @BeforeTest
    public void setUp(){
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        j = (JavascriptExecutor)driver;
        j.executeScript("return document.readyState").toString().equals("complete");
        System.out.println("Page has loaded");
    }
    @Test
    public void runTest(){
        toolQAPage = new ToolQAPage(driver);
        toolQAPage.clickOnHeaderText();
        toolQAPage.clickOnProgressBar();
        toolQAPage.clickOnStart();
        toolQAPage.clickOnStop();
    }
    @AfterTest
   public void quitTest(){
     driver.quit();
    }
}
