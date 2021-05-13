package com.Generics;

import java.util.Arrays;

public class Generics <E extends Comparable<E>> {

    E[] values;

    public Generics(E ...values) {
        this.values = values;
    }

    public <E extends Comparable<E>> E getMax(){
        Arrays.sort(values);
        E max = (E) values[values.length -1];
        printMax(max);

        return (E) values[values.length -1];

    }

    public <E> void printMax(E max) {
        System.out.println("The maximum value is :"+ max);
    }

    public static void main(String[] args) {
        Generics G = new Generics(1,2,3,4);
        System.out.println(G.getMax());
    }

}