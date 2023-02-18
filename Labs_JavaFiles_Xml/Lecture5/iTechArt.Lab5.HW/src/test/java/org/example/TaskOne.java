package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskOne {
    WebDriver driver = new ChromeDriver();
    @Test
    public void enter(){
        String webName = "https://uzmarketing.com/";
        driver.get(webName);
        Assert.assertEquals(driver.getCurrentUrl(), webName);
    }
    public void clickOnServices(){
        driver.findElement(By.xpath("//*[@id = \"menu-item-1079\"]/a")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//a[@href = \"/services/web-development/\"]")).getText(),"  WEB DEVELOPMENT");
    }
    public void clickOnContact(){
        driver.findElement(By.xpath("//*[@id = \"menu-item-1077\"]/a")).click();
        Assert.assertEquals(driver.findElement(By.xpath("(//*[@class = \"address\"]//span)[4]")).getText(), "Fax: (800) 217-9962");
    }

    public void quit(){
        driver.quit();
    }
}
