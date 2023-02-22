package org.example;

import org.junit.Test;
import org.testng.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SubstractionTest {
    private Substraction substraction;
    @Test
    public void checkSubTraction(){
        substraction = new Substraction();
        double numberOne = 10, numberTwo = 2, numberThree = 9, numberFour = 3;
        double resultOne = substraction.substractCalculation(numberOne,numberTwo);
        double resultTwo = substraction.substractCalculation(numberThree,numberFour);
        assertThat("Multiplication of two numbers is correct", resultOne, is(8.0));
        assertThat("Multiplication of two numbers is correct", resultTwo, is(6.0));
    }
}
