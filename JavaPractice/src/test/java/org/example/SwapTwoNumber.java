package org.example;

import org.junit.jupiter.api.Test;

public class SwapTwoNumber {
    @Test
    public  void fnSwapTwoNumber(){
        int a=10;
        int b=20;
        int temp=0;
        System.out.println("Value of A is "+a+" and Value of B is :-"+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("Value of A is :-"+a+" and Value of B is :-"+b);

    }
}
