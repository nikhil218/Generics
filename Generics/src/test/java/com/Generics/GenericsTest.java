package com.Generics;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

public class GenericsTest {

Generics max;
    @Before public void set(){max = new Generics();}

    @Test
    public void maxDoubleAtFirstPositionTestReturnsTrue() {
        double result = max.maxDouble(3.5,1.3,2.4);
        Assert.assertEquals(3.5, result, 0.001);
    }

    @Test
    public void maxDoubleAtSecondPositionTestReturnsTrue(){
        double result = max.maxDouble(1.3,3.5,2.4);
        Assert.assertEquals(3.5, result, 0.001);
    }

    @Test
    public void maxDoubleAtThirdPositionTestReturnsTrue(){
        double result = max.maxDouble(1.3,2.4,3.5);
        Assert.assertEquals(3.5, result, 0.001);
    }

}
