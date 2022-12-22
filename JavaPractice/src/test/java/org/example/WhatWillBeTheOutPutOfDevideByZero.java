package org.example;

import org.junit.jupiter.api.Test;

public class WhatWillBeTheOutPutOfDevideByZero {
    @Test
    public void fnWhatWillBeTheOutPutOfDevideByZero(){
//        Arithmetic exception only comes for integer number
//        System.out.println(9/0); //Output: java.lang.ArithmeticException: / by zero
        System.out.println(9.0/0);          //Output: Infinity
        System.out.println(12.33f/0);       //Output: Infinity
        System.out.println(10/0.0);         //Output: Infinity
        System.out.println(19.999999d/0.0); //Output: Infinity
        System.out.println(0.0/0);          //Output: NaN
        System.out.println(0.0/0.0);        //Output: NaN
        System.out.println(0.0/0.);         //Output: NaN
        System.out.println(12.33/0.0);      //Output: Infinity

    }
}
