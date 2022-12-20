package org.example;

import org.junit.jupiter.api.Test;

public class PrintOneToHundredWithoutUsingNumbers {
    @Test
    public void fnPrintOneToHundredWithoutUsingNumbers(){
        int one='X'/'X';
        String s="..........";
        for(int i= one;i<(s.length()*s.length());i++){
            System.out.print(" "+i);
        }

//        Second Method Using the Asci values, Asci value of 'd ' is 100
        System.out.println("");
        for(int i=one;i< 'd';i++){
            System.out.print(" "+i);
        }
    }
}
