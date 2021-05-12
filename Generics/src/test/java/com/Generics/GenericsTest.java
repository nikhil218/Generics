package com.Generics;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

public class GenericsTest {

Generics max;
    @Before public void set(){max = new Generics();}

    @Test
    public void maxNumberAtFirstPositionTestReturnsTrue(){
        int result = max.maxInteger(30, 20, 10);
        Assert.assertEquals(30, result);
    }

    @Test
    public void maxNumberAtSecondPositionTestReturnsTrue(){
        int result = max.maxInteger(20, 30, 10);
        Assert.assertEquals(30, result);
    }

    @Test
    public void maxNumberAtThirdPositionTestReturnsTrue(){
        int result = max.maxInteger(10, 20, 30);
        Assert.assertEquals(30, result);
    }
}
