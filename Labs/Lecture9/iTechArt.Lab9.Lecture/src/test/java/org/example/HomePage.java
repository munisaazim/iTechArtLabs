package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    protected HomePage(WebDriver driver) {
        super(driver);
    }
    protected By UniqueWebLocator = By.cssSelector(".download-box");
    @Override
    public By getUniqueWebLocator() {
        return UniqueWebLocator;
    }

}
