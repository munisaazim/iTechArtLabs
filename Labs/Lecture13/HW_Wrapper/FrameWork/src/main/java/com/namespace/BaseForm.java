package com.namespace;

import org.openqa.selenium.WebDriver;

public class BaseForm {
    private BaseElement uniqueElement;
    private WebDriver driver;
    BaseForm(String name, BaseElement uniqueElement) {
        this.uniqueElement = uniqueElement;
    }
    public boolean isPageOpened(){
        return uniqueElement.isDisplayed();
    }
}
