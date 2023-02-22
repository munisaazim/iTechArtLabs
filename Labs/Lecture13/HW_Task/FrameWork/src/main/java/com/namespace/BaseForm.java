package com.namespace;

public class BaseForm {
    private BaseElement uniqueElement;
    public BaseForm(BaseElement uniqueElement, String name){
        this.uniqueElement = uniqueElement;
    }
    public boolean isPageOpened(){
        return uniqueElement.isDisplayed();
    }
}
