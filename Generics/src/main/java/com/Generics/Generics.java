package com.Generics;

import java.util.Arrays;

public class Generics <E extends Comparable<E>> {

    E x, y, z;

    public Generics() {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public E getMax(E x, E y, E z){
        return (E) Generics.getMaximum(x,y,z);
    }

    public static <E extends Comparable<E>> E getMaximum(E x, E y, E z){
        if(x.compareTo(y) > 0 && x.compareTo(z) > 0)
            return x;
        else if(y.compareTo(x) > 0 && y.compareTo(z) > 0)
            return y;
        else
            return z;
    }

}