package org.example;

import org.junit.jupiter.api.Test;

public class WillStaticBlockExecutedWithFinalVariable {
//    @Test
//    public void fnWillStaticBlockExecutedWithFinalVariable(){
//        System.out.println(Sample.x);
//    }
    public static void main(String[] args){
        System.out.println(Main.x); //Output: 100
//        "static final" variable doesn't load static block
//            if you use only    "static  int"  will load the static block and out will be as follows
//        Sample-----class block...
//        100
    }
}
  class Main{
    public static final int x=100;
    static {
        System.out.println("Sample-----class block...");
    }
}