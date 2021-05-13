package com.Generics;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

public class GenericsTest {

    @Test
    public void maxIntegerFromMultipleInputs(){
        Generics<Integer> value = new Generics<>(10,20,30,40,50);
        int result = value.getMax();
        Assert.assertEquals(50, result);
    }

    @Test
    public void maxDoubleFromMultipleInputs(){
        Generics<Double> value = new Generics<>(1.1,2.0,2.2,1.0);
        double result = value.getMax();
        Assert.assertEquals(2.2, result,0.001);
    }

    @Test
    public void maxStringFromMultipleInputs(){
        Generics<String> value = new Generics<>("aa", "aaa", "aaaa");
        String result = value.getMax();
        Assert.assertEquals("aaaa", result);
    }
}
