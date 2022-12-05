package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortAnArray {
    @Test
    public void fnSortArray(){
        int[]  a={2,4,6,3,8,9,1};
        List<Integer> arrayList=new ArrayList<Integer>();
        for(int i : a){
            arrayList.add(i);
        }
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
