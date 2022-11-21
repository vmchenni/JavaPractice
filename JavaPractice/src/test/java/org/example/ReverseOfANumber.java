package org.example;

import org.junit.jupiter.api.Test;

public class ReverseOfANumber {
    @Test
    public void fnReverseOfANumber(){
        int iMyNumber=222;
        int rev=0;
        while(iMyNumber !=0){
            int Number=iMyNumber % 10;
            rev=rev *10 +Number;
            iMyNumber=iMyNumber/10;
        }
        System.out.println("Rveresed Number:-"+rev);
    }
}
