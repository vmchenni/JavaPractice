package org.example;

import org.junit.jupiter.api.Test;

public class SwapTwoVariablesWithoutThirdVariable {
    @Test
    public void fnSwapTwoVariablesWithoutThirdVariable(){
        int a=10;
        int b=20;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("A:"+a+" and B are"+b);
    }

}
