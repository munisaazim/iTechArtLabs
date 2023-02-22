package org.example;

import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TaskOne {
    private WebDriver driver;
    protected String expectedFaxNumber, actualFaxNumber;
    protected WebElement actualFaxNumberElement;
    public TaskOne(WebDriver driver){
        this.driver = driver;
    }
    public void enter(){
        String webName = "https://uzmarketing.com/";
        driver.get(webName);
    }
    public void clickOnServices(){
        driver.findElement(By.xpath("//*[@id = \"menu-item-1079\"]/a")).click();
    }
    public void clickOnContact(){
        driver.findElement(By.xpath("//*[@id = \"menu-item-1077\"]/a")).click();
        expectedFaxNumber = "Fax: (800) 217-9962";
        actualFaxNumberElement = driver.findElement(By.xpath("(//*[@class = \"address\"]//span)[4]"));
        if(actualFaxNumberElement.getText().equals(expectedFaxNumber)){
            System.out.println("The fax number:" + expectedFaxNumber);
        }
        else {
            throw new NotImplementedException();
        }
    }
}
