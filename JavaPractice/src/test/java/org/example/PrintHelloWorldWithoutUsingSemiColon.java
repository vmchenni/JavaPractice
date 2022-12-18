package org.example;

import org.junit.jupiter.api.Test;

public class PrintHelloWorldWithoutUsingSemiColon {
    @Test
    public void fnPrintHelloWorldWithoutUsingSemiColon(){

//        First Method
        if(System.out.printf("Hello World" + "\n") == null ){

        }
//        Second Method
        if(System.out.append("Hello World"+"\n")==null){

        }
        //        Third Method
        if(System.out.append("Hello World").equals(null)){

        }
    }

}
