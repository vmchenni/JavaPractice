package org.example;

import org.junit.jupiter.api.Test;

import java.util.*;

public class FindOurrenceOfWord {
    @Test
    public void fnCountOccurenceOfString(){
        String str="Welcome to Hong Kong and Hong Kong Welcomes You";
        String[] sArray=str.split(" ");
        Set<String> sUniqueValues = new HashSet<>(Arrays.asList(sArray));
        Iterator<String> iterator=sUniqueValues.iterator();
        while (iterator.hasNext()){
//            System.out.println(iterator.next());
            String sValue= iterator.next();
            int count = 0;
            for (String s : sArray) {
                if (sValue.equals(s)) {
                    count++;
                }
            }
            System.out.println("The Value "+sValue+" occured "+count+" times");
        }
    }

}
