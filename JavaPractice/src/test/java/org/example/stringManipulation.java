package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class stringManipulation {
    @Test
    public void fnStringManipulation(){
        String mystr="The rains have started here";
        System.out.println("Length of a string :-"+mystr.length());

        System.out.println("The value available at 5 location:-"+mystr.charAt(5));
        System.out.println("Index of :-"+mystr.indexOf('e'));
        System.out.println("Get index from a position:-"+mystr.indexOf('e',mystr.indexOf('e')+1));
        System.out.println("Index of a string:-"+mystr.indexOf("have"));
//        If the string is not available , it will return -1

//        Get Substring
        System.out.println("Sub String is :-"+mystr.substring(0,10));
        String test="The_rains_have_started_here";
        String[] strArray=test.split("_");
        System.out.println(Arrays.toString(strArray));
    }
}
