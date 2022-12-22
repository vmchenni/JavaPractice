package org.example;

import org.junit.jupiter.api.Test;

public class PrintingLongNumber {
    @Test
    public void fnPrintingLongNumber(){
        long longNumberWithoutL=1000*60*60*24*365;
        long longNumberWithL=1000*60*60*24*365L;
        System.out.println(longNumberWithL); //31536000000 correct output
        System.out.println(longNumberWithoutL); //1471228928 wrong output
//        Reason : int has only 32 bit.
//        So initial 4 bits are removed to accomodate a 32 bit number
//        To Make it compulsory to print full number, append last number with 'L' or 'l'
    }
}
