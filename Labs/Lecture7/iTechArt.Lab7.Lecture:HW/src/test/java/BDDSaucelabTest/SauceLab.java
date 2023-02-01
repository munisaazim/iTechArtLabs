package BDDSaucelabTest;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SauceLab {
    WebDriver driver = new ChromeDriver();

    public void enterPage(String name){
        driver.get(name);
    }
    public void enterUsername(){
        driver.findElement(By.cssSelector("input[@placeholder = 'Username']")).sendKeys("standard_user");
    }
    public void enterPassword(){
        driver.findElement(By.cssSelector("input[@placeholder = 'Password']")).sendKeys("password");
    }
    public void clickOnSubmit(){
        driver.findElement(By.cssSelector("input[@type= 'submit']")).click();
    }
    public void navigateToHome(){
        WebElement element = driver.findElement(By.cssSelector(".title"));
        Assert.assertEquals(element.getText(), "Products");
    }
    public void clickOnAddCart(){
        driver.findElement(By.xpath("//*[@id ='add-to-cart-sauce-labs-backpack']")).click();
    }
    public void boxHasItem(){
       WebElement element = driver.findElement(By.cssSelector(".shopping_cart_badge"));
        Assert.assertEquals(element.getText(), "1");
    }
    public void clickOnBox(){
        driver.findElement(By.cssSelector(".shopping_cart_link")).click();
    }
    public void cartPage(){
        WebElement element = driver.findElement(By.cssSelector(".inventory_item_name"));
        Assert.assertEquals(element.getText(), "Sauce Labs Backpack");
    }
}
