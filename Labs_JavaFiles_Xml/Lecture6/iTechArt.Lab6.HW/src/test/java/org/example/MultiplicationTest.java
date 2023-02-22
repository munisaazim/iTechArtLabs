package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MultiplicationTest {
    @Test
    public void checkMultiplication(){
        Multiplication multiplication = new Multiplication();
        double numberOne = 10, numberTwo = 2;
        double result = multiplication.multipleCalculation(numberOne,numberTwo);
        assertThat("Multiplication of two numbers is correct", result, is(20.0));
    }
}
