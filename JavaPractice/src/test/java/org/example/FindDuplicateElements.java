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

}
