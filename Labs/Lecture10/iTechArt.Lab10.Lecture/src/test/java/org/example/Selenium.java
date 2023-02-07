package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Selenium {
private WebDriver driver;

public void setDriver(){
    System.setProperty("webdriver.chrome.driver", "/Users/munisaazimkhodjaeva/Desktop/chromedriver_mac64");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
}
public void getPage(){
    driver.get("https://jqueryui.com/progressbar/#download");
}
public void dialog(){
    WebElement window = driver.findElement(By.xpath("//*[@class = \"demo-frame\"]"));
    driver.findElement(By.id("downloadButton")).click();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

}
}
