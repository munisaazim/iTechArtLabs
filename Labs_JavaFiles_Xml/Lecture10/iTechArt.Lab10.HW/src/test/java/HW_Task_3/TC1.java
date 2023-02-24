package HW_Task_3;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC1 {
    private WebDriver driver;
    private String url = "https://demoqa.com/";
    private JavascriptExecutor j;
    private BrowserWindowPage browserWindowPage;

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
        browserWindowPage = new BrowserWindowPage(driver);
        browserWindowPage.clickOnHeadertext();
        browserWindowPage.clickOnNestedFrames();
        browserWindowPage.assertParentText();
    }
   // @AfterTest
    public void quitTest(){
        driver.quit();
    }
}
