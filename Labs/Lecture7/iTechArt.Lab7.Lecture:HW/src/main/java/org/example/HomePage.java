package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    WebDriver driver = new ChromeDriver();
    public void open(String url){
        driver.get(url);
    }
    public void login(){
        WebElement loginLabel = driver.findElement(By.cssSelector("#login2"));
        loginLabel.click();
    }
    public void fillUsernameInput(String username){
         WebElement userNameInput = driver.findElement(By.cssSelector("#loginusername"));
        userNameInput.sendKeys(username);
    }
    public void fillPasswordInput(String password){
         WebElement passwordInput = driver.findElement(By.cssSelector("#loginpassword"));
        passwordInput.sendKeys(password);
    }
    public void clickOnLogin(){
         WebElement loginButton = driver.findElement(By.cssSelector("[onclick= 'logIn()']"));
        loginButton.click();
    }
    public boolean isLogoutAppereared(){
         WebElement logoutButton = driver.findElement(By.cssSelector("[onclick= 'logOut()']"));
         return logoutButton.isEnabled();
    }
}
