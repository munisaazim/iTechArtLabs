package org.example;

import org.testng.annotations.Test;

public class Testing {
    private Selenium selenium;
    @Test
    public void test(){
        selenium = new Selenium();
        selenium.setDriver();
        selenium.getPage();
        selenium.dialog();
    }
}
