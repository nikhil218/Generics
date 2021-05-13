package com.Generics;

import java.util.Arrays;

public class Generics <E extends Comparable<E>> {

    E[] values;

    public Generics(E ...values) {
        this.values = values;
    }

    public <E extends Comparable<E>> E getMax(){
        Arrays.sort(values);
        return (E) values[values.length -1];

    }

}