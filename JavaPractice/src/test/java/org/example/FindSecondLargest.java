package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
    @Test
    public void fnSecondLargest(){
        int[] arr={3,6,78,99,10,9,1};

        List<Integer> arrayList=new ArrayList<>();
        for (int j : arr) {
            arrayList.add(j);
        }
        Collections.sort(arrayList);
        System.out.println(arrayList.get(arrayList.size()-2));
    }
}
