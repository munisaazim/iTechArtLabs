package com.namespace;

import org.asynchttpclient.uri.Uri;
import org.openqa.selenium.WebDriver;

public class Browsere {
    public WebDriver WebDriver;
    public Browsere(WebDriver webdriver){
        this.WebDriver = webdriver;
    }
    public void GoTo(Uri uri){
        GoToUrl(String.valueOf(uri));
    }
    public void GoToUrl(String uri){
        WebDriver.navigate().to(uri);
    }
    public void WindowMaximize(){
        WebDriver.manage().window().maximize();
    }
}
