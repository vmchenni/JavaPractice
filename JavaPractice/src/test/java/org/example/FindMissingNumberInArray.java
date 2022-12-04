package org.example;

import org.junit.jupiter.api.Test;

public class FindMissingNumberInArray {
    @Test
    public void fnFindMissingNumberInArray(){
        int[] arr={1,2,4,5};
        int sum1=0;
        for(int i=0;i<arr.length;i++){
            sum1=sum1+arr[i];
        }
        System.out.println(sum1);
        int lastNumber=arr[arr.length-1];
        int sum2=0;
        for(int i=0;i<lastNumber;i++){
            sum2=sum2+i;
        }
        System.out.println(sum2-sum1);
    }
}
