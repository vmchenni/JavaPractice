package org.example;

import org.junit.jupiter.api.Test;

public class SwapTwoNumberWithoutThirdVariable {
    @Test
    public void fnSwapTwoNumberWithoutThirdVariable(){
        int x=10;
        int y=5;
        x=x+y;//15
        y=x-y;
        x=x-y;
        System.out.println("X:-"+x);
        System.out.println("Y:-"+y);
    }
}
