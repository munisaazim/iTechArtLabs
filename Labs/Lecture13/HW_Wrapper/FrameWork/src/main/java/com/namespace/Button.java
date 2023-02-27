package com.namespace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Button extends BaseElement{
    Button(By loc, String name, WebDriver driver) {
        super(driver, loc, name);
        System.out.println("DRIVER1:"+ driver);
        System.out.println("Name: " + name);
        System.out.println("Loc: " + loc);
    }
}
