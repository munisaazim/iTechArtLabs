package com.namespace;

import org.openqa.selenium.By;

public abstract class BaseForm {
    private BaseElement uniqEI;
    protected By loc;
    public BaseForm(BaseElement uniqEI, String name){
        this.uniqEI = uniqEI;
    }

    public boolean isOpen(){
        return uniqEI.FindElement(loc).isDisplayed();
    }
}
