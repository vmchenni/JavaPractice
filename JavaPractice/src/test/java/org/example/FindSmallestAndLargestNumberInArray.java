package org.example;

import org.junit.jupiter.api.Test;

public class FindSmallestAndLargestNumberInArray {
    @Test
    public void fnFindSmallestAndLargestNumberInArray(){
        int[] arr={10,24,50,-125,987};
        int iSmall=arr[0];
        int iBig=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>iBig){
                iBig=arr[i];
            }
            if(arr[i]<iSmall){
                iSmall=arr[i];
            }
        }
        System.out.println("Largest number is :- "+iBig+" and Smallest number is :- "+iSmall+"");
    }
}
