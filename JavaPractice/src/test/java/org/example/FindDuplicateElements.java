package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FindDuplicateElements {
    @Test
    public void fnDuplicateElements(){
        String[] languages={"Java","C","Python","VB","Java","C"};
//      Set<String> set=new HashSet<>();
//      for(String name:languages){
//        if(!set.add(name)){
//            System.out.println("Duplicate element is :-"+name);
//        }
//      }

        Set<String> set=new HashSet<>();
        for(String names:languages){
            if(!set.add(names)){
                System.out.println(names +" is Duplicate");
            }
        }
    }
    @Test
    public void fnDuplicateNumber(){
        int[] iArray={1,2,3,4,5,6,7,7,8,9,0,0};
        Set<Integer> set1= new HashSet<>();
        for(int i:iArray){
            if(!set1.add(i)){
                System.out.println("Duplicate number is :-"+i);
            }
        }
    }
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
