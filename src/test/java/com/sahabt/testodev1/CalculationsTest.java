package com.sahabt.testodev1;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple Calculations.
 */
public class CalculationsTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void FindingModTest(){
        Calculations cal = new Calculations();
        int result = cal.FindingMod(7,3);
        Assert.assertEquals(1,result);
    }

    @Test
    public void FactorialTest(){
        Calculations cal = new Calculations();
        int result = cal.Factorial(3);
        Assert.assertEquals(6,result);
    }
    @Test
    public void RemainderCheckTest(){
        Calculations cal = new Calculations();
        boolean result = cal.RemainderCheck(4,2);
        Assert.assertTrue("There is no reminder",result);
    }
}
