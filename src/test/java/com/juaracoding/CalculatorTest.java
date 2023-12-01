package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator(); //Object
        int actual = calculator.add(10,5);
        int expected = 15;
        //Assert.assertEquals(actual, expected); //parameter tidak boleh kebalik
        Assert.assertEquals(actual,expected); //Assert Equals untuk validasi
        //Assert.assertFalse();
        //Assert.assertNull( ); //object nya harus null, jika null berarti testing nya benar.
    }

    @Test
    public void testsubtract(){
        Calculator calculator = new Calculator();
        int actual = calculator.subtract(11,5);
        int expected = 6;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSubstract(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.subtract(10,5), 5); //dapat langsung tanpa membuat variable dengan method assert equals.
    }
}
