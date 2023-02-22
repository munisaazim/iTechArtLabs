package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class DivisionTest {
    private Division division;
    @Test
    public void checkDivisionOne(){
        division = new Division();
        double numOne = 10, numTwo = 2, numThree = 9, numFour = 3;
        double resultOne = division.divide(numOne,numTwo);
        assertThat("Division of the first two numbers is correct", resultOne, is(5.0));
        double resultTwo = division.divide(numThree, numFour);
        assertThat("Division of the first two numbers is correct", resultTwo, is(3.0));
    }
}
