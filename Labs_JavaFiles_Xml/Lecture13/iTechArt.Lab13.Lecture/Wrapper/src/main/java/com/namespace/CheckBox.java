package com.namespace;

import org.openqa.selenium.By;

public class CheckBox extends BaseElement {
    protected CheckBox(By locator, String name) {
        super(locator, name);
    }
    public boolean IsChecked(){
        return FindElement().isSelected();
    }
}
