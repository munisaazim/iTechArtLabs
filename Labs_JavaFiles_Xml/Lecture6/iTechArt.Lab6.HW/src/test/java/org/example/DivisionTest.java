package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivisionTest {
    @Test
    public void checkDivisionOne(){
        Division division = new Division();
        double num1 = 10, num2 = 2, num3 = 9, num4 = 3;
        double result = division.divide(num1,num2);
        Assert.assertEquals(result, 5.0);
        double resultTwo = division.divide(num3, num4);
        Assert.assertEquals(resultTwo, 3.0);
    }
    @Test
    public void checkDivisionTwo(){
        Division division = new Division();
        double num3 = 9, num4 = 3;
        double resultTwo = division.divide(num3, num4);
        Assert.assertEquals(resultTwo, 3.0);
    }


}
