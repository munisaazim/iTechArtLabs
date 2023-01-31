package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplicationTest {
    @Test
    public void checkMultiplication(){
        Multiplication multiplication = new Multiplication();
        double num1 = 10, num2 = 2;
        double result = multiplication.multipleCalculation(num1,num2);
        Assert.assertEquals(result, 20.0);
    }
}
