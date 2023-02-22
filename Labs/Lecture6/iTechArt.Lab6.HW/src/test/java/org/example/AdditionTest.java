package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AdditionTest {
    private Addition additionObject;
    @Test
    public void checkAdditionMethods(){
        additionObject = new Addition();
        double numberOne = 3, numberTwo = 5;
        double resultOne = additionObject.additionCalculation(numberOne, numberTwo);
        assertThat("Addition of two numbers is correct", resultOne, is(8.0));
    }
}
