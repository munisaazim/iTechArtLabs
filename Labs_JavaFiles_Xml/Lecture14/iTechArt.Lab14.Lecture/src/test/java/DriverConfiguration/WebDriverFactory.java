package DriverConfiguration;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverFactory {
    public WebDriver getDriver(String name){
        WebDriver driver;
        switch (name){
            case "Chrome":
                driver = new ChromeDriver();
                return driver;
            case "Edge":
                driver = new EdgeDriver();
                return driver;
            case "Safari":
                driver = new SafariDriver();
                return driver;
            default: throw new InvalidArgumentException(name + "browser is nor supported")     ;
        }
    }
}
