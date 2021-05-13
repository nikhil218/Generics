package com.Generics;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

public class GenericsTest {

Generics max;
    @Before public void set(){max = new Generics();}

    @Test
    public void maxStringAtFirstPositionTestReturnsTrue() {
        String result = max.maxString("Peach", "Banana", "Apple");
        Assert.assertEquals("Peach", result);
    }

    @Test
    public void maxStringAtSecondPositionTestReturnsTrue(){
        String result = max.maxString("Apple","Peach","Banana");
        Assert.assertEquals("Peach", result);
    }

    @Test
    public void maxStringAtThirdPositionTestReturnsTrue(){
        String result = max.maxString("Apple", "Peach", "Banana");
        Assert.assertEquals("Peach", result);
    }

}
