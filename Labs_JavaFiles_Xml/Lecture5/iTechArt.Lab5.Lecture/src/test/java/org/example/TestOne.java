package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestOne {
    @Test
    public void test(){
        System.out.println("Testing One");
        WebDriver driver = new ChromeDriver();
        String webName = "https://www.demoblaze.com/";
        driver.get(webName);
        driver.manage().window().maximize();
        driver.close();
    }
}
