package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AdditionTest {
    @Test
    public void checkAdditionOne(){
        Addition object = new Addition();
        double num1 = 3, num2 = 5;
        double resultOne = object.additionCalculation(num1, num2);
        Assert.assertEquals(resultOne, 8.0);
    }
    @Test
    public void checkAdditionTwo(){
        Addition object = new Addition();
        double num1 = 8, num2 = 2.2;
        double resultTwo = object.additionCalculation(num1, num2);
        Assert.assertEquals(resultTwo, 10.2);
    }
}
