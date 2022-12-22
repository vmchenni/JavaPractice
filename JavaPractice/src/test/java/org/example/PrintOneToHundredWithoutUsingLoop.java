package org.example;

import org.junit.jupiter.api.Test;

public class PrintOneToHundredWithoutUsingLoop {
    @Test
    public void fnPrintOneToHundred(){
        fnPrint(1);
    }

    private void fnPrint(int i) {
        if(i <= 100){
            System.out.println(i);
            fnPrint(i+1);
        }

    }
}
