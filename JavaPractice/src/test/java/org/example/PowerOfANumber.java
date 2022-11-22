package org.example;

import org.junit.jupiter.api.Test;

public class PowerOfANumber {
    @Test
    public void fnPowerOfANumber(){
        int iBase=2;
        int iExponenent=4;
        long result=1;
        while(iExponenent != 0){
            result=result*iBase;
            iExponenent--;
        }
//        System.out.println("Result is :-"+result);
        System.out.println("Result is :-"+Math.pow(iBase,iExponenent));
    }
}
