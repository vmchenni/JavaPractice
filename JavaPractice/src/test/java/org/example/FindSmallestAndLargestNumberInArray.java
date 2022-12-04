package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSmallestAndLargestNumberInArray {
    @Test
    public void fnFindSmallestAndLargestNumberInArray(){
        int[] arr={10,-20,-30,50,999};
        int iSmall=arr[0];
        int iBig=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]< iSmall){
                iSmall=arr[i];
            } else if (arr[i]> iBig) {
                iBig=arr[i];
            }
        }
        System.out.println("Array is :-"+Arrays.toString(arr));
        System.out.println("The small number is "+iSmall+" and Bing number is "+iBig+"");
    }

}
