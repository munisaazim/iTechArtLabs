package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Selenium {
    private WebDriver driver;

    public void setDriver() {
        //System.setProperty("webdriver.chrome.driver", "/Users/munisaazimkhodjaeva/Desktop/chromedriver_mac64");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void getPage() {
        driver.get("https://jqueryui.com/progressbar/#download");
    }

    public void dialog() {
        WebElement window = driver.findElement(By.xpath("//*[@class = \"demo-frame\"]"));
        driver.switchTo().frame(window);
        driver.findElement(By.id("downloadButton")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //Implicit wait
        driver.findElement(By.xpath("(//*[text()= 'Close'])[2]")).click();
        WebElement element = driver.findElement(By.xpath("//button[text()= 'Start Download']"));
        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element2;
        element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()= 'Start Download']")));
        Assert.assertTrue(element2.isDisplayed());
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        boolean result = js.executeScript("return document.readyState").equals("complete");
    }
}
