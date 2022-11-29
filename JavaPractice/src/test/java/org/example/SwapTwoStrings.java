package org.example;

import org.junit.jupiter.api.Test;

public class SwapTwoStrings {
    @Test
    public void fnSwapTwoStrings(){
        String a="Hello";
        String b="World;";

        a=a+b;// HelloWorld
        b=a.substring(0,a.length()-b.length());//b=Hello;
        a=a.substring(b.length());
        System.out.println("String A is "+a+" and B is "+b+" ");
    }
}
