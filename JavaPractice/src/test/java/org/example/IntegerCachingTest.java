package org.example;

import org.junit.jupiter.api.Test;

public class IntegerCachingTest {
    @Test
    public void fnIntegerCachingTest(){
//        Integer Caching Range is -128 to 127
       Integer num1=100;
       Integer num2=100;
       if(num1 == num2){
           System.out.println("Numbers are equal");
       }else {
           System.out.println("Numbers are not equal");
       }
    }
}
