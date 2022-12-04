package org.example;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesNumbers {
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
}
