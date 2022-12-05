package org.example;

import org.junit.jupiter.api.Test;

public class ReverseOfANumber {
    @Test
    public void fnReverseOfANumber(){
        int iMyNumber=1234;
        int rev=0;
        while(iMyNumber!=0){
            rev=rev*10+(iMyNumber %10);
            iMyNumber=iMyNumber/10;
        }
        System.out.println(rev);
    }
}
