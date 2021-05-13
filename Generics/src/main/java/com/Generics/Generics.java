package com.Generics;

import java.util.Arrays;

public class Generics {

    public double maxDouble(Double number1, Double number2, Double number3){
        if(number1.compareTo(number2) > 0 && number1.compareTo(number3) > 0)
            return number1;
        else if(number2.compareTo(number1) > 0 && number2.compareTo(number3) > 0)
            return number2;
        else
            return number3;
    }

}