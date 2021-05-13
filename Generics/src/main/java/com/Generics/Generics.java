package com.Generics;

import java.util.Arrays;

public class Generics {

    public <E extends Comparable<E>> E getMax(E x, E y, E z){
        if(x.compareTo(y) > 0 && x.compareTo(z) > 0)
            return x;
        else if(y.compareTo(x) > 0 && y.compareTo(z) > 0)
            return y;
        else
            return z;
    }

}