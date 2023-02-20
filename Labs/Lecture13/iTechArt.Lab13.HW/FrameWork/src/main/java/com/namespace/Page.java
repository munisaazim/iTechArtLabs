package com.namespace;

import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.By;

public abstract class Page {
    private BaseElement uniqueElement;
    protected By loc;
    protected Page(BaseElement uniqueElement, String pageName){
        this.uniqueElement = uniqueElement;
    }
    public boolean IsPageOpened(){
        return uniqueElement.FindElement(loc).isDisplayed();
    }
    public void WaitForPageOpened(){
        throw new NotImplementedException();
    }
}
