package com.Generics;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

public class GenericsTest {

Generics max;
    @Before public void set(){max = new Generics();}

    @Test
    public void maxNumberAtFirstPositionTestReturnsTrue(){
        int result = (int) max.getMax(30, 20, 10);
        Assert.assertEquals(30, result);
    }

    @Test
    public void maxNumberAtSecondPositionTestReturnsTrue(){
        int result = (int) max.getMax(20, 30, 10);
        Assert.assertEquals(30, result);
    }

    @Test
    public void maxNumberAtThirdPositionTestReturnsTrue(){
        int result = (int) max.getMax(10, 20, 30);
        Assert.assertEquals(30, result);
    }

    @Test
    public void maxDoubleAtFirstPositionTestReturnsTrue() {
        double result = (double) max.getMax(10.55, 6.5, 8.5);
        Assert.assertEquals(10.55, result, 0.001);
    }

    @Test
    public void maxDoubleAtSecondPositionTestReturnsTrue(){
        double result = (double) max.getMax(6.5, 10.55, 8.5);
        Assert.assertEquals(10.55, result, 0.001);
    }

    @Test
    public void maxDoubleAtThirdPositionTestReturnsTrue(){
        double result = (double) max.getMax(8.5, 6.5, 10.55);
        Assert.assertEquals(10.55, result, 0.001);
    }

    @Test
    public void given_MaxStringAt_FirstPosition_Returns_True_Test() {
        String result = (String) max.getMax("Peach", "Banana", "Apple");
        Assert.assertEquals("Peach", result);
    }

    @Test
    public void given_MaxStringAt_SecondPosition_Returns_True_Test() {
        String result = (String) max.getMax("Apple","Peach","Banana");
        Assert.assertEquals("Peach", result);
    }

    @Test
    public void given_MaxStringAt_ThirdPosition_Returns_True_Test() {
        String result = (String) max.getMax("Apple", "Peach", "Banana");
        Assert.assertEquals("Peach", result);
    }

}
