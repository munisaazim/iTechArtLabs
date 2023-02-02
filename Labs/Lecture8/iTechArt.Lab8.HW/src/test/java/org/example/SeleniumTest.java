package org.example;

import org.junit.Test;

public class SeleniumTest {
    Selenium object = new Selenium();
    @Test
    public void Test() throws InterruptedException {
        object.setUp();
        object.enterPage();
        object.mobileEnter();
        object.chooseMobile();
        object.chooseNumber();
        object.comparePage();
    }
}
