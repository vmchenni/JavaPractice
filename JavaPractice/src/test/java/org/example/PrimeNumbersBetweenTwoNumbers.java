package org.example;

import org.junit.jupiter.api.Test;

public class PrimeNumbersBetweenTwoNumbers {
    @Test
    public void fnPrimeNumbersBetweenTwoNumbers(){
        int iLow=10;
        int iHigh=20;
        while(iLow < iHigh){
           boolean flag=false;
           for(int i=2;i<iLow/2;i++){
               if(iLow % i == 0){
                   flag=true;
                   break;
               }
           }
           if(!flag){
               System.out.println(iLow+" ");
           }
            iLow++;
        }
    }
}
