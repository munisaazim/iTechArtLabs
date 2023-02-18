package org.example;

import org.junit.Test;
import org.testng.Assert;

public class SubstractionTest {
    @Test
    public void checkSubstractionOne(){
        Substraction substraction = new Substraction();
        double num1 = 10, num2 = 2, num3 = 9, num4 = 3;
        double result = substraction.substractCalculation(num1,num2);
        Assert.assertEquals(result, 8.0);
    }
    @Test
    public void checkSubstractionTwo(){
        Substraction substraction = new Substraction();
        double num3 = 9, num4 = 3;
        double result = substraction.substractCalculation(num4,num3);
        Assert.assertEquals(result, 6.0);
    }
}
