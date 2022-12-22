package org.example;

import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.stream.IntStream;

public class PrintOneToHundredWithoutUsingLoop {
    @Test
    public void fnPrintOneToHundred(){
        fnPrint(1);
//        Second Option
        fnPrintUsingJavaStream();
    }

    private void fnPrintUsingJavaStream() {
        System.out.println("Using IntStream");
        System.out.println();
        IntStream.range(1,101).forEach(e-> System.out.print(" "+e));
    }

    private void fnPrint(int i) {
        if(i <= 100){
            System.out.print(" "+i);
            fnPrint(i+1);
        }

    }
}
