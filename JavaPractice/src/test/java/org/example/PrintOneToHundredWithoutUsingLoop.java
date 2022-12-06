package org.example;

import org.junit.jupiter.api.Test;

public class PrintOneToHundredWithoutUsingLoop {
    @Test
    public void callingFunction(){
        sPrint(10);
    }
    public void sPrint(int  i){
        if(i >=0 ){
            System.out.print(" "+i);
            sPrint(i-1);
        }

    }
}
