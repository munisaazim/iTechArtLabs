package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DialogPage extends BasePage{

    protected By UniqueWebLocator = By.cssSelector(".download-box");
    protected DialogPage(WebDriver driver) {
        super(driver);
    }


}
