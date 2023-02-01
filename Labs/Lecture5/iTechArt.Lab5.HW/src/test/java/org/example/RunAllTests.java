package org.example;

import org.testng.annotations.Test;

public class RunAllTests {
    @Test
    public void Test(){
        TaskOne object = new TaskOne();
        object.enter();
        object.clickOnServices();
        object.clickOnContact();
    }
}

