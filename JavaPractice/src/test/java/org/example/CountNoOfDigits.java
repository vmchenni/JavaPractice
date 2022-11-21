package org.example;

import org.junit.jupiter.api.Test;

public class CountNoOfDigits {
    @Test
    public void fnCountNoOfDigits(){
        int iMyNum=1234567;
        int iCount=0;
        while(iMyNum !=0){
            iMyNum=iMyNum/10;
            iCount++;
        }
        System.out.println("No of digits are :-"+iCount);
    }
}
