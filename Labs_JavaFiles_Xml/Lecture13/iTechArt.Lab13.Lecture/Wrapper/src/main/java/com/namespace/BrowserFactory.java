package com.namespace;

import org.openqa.selenium.WebDriver;

public abstract class BrowserFactory {
    public BrowserProfile BrowserProfile;
    protected BrowserFactory(BrowserProfile browserProfile){

    }
    protected WebDriver Webdriver;
    public  Browsere GetBrowser = new Browsere(Webdriver);


}
