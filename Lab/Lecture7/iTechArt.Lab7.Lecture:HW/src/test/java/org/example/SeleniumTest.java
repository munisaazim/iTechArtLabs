package org.example;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumTest {
    @Test
    public void Test(){
         HomePage object = new HomePage();
         String url = "https://www.demoblaze.com/";
         object.open(url);
         object.login();
         object.fillUsernameInput("username");
         object.fillPasswordInput("password");
         object.clickOnLogin();
         Assert.assertTrue(object.isLogoutAppereared());

    }
}
