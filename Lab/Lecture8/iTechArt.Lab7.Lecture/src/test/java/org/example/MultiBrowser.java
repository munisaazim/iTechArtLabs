package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.example.MultiBrowser.Browser.FireFox;

public class MultiBrowser {
    public WebDriver GetDriver(Browser browser) {
        WebDriver driver;
        switch (browser) {
            case Chrome:
                driver = new ChromeDriver();
                return driver;
            case Edge:
                driver = new EdgeDriver();
                return driver;
            case FireFox:
                driver = new FirefoxDriver();
                return driver;
            default:
                throw new IllegalStateException("Unexpected value: " + browser);
        }
    }

    public enum Browser{
        Chrome,
        Edge,
        FireFox
    }
}