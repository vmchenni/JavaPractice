package org.example;

import org.junit.jupiter.api.Test;

public class FindMissingNumber {
    @Test
    public void fnFindMissingNumber(){
        int[] a={1,2,3,4,5,7};
        int sum1=0;
        for(int i: a){
            sum1=sum1+i;
        }
        System.out.println(sum1);
        int sum2=0;
        for(int i=a[0];i<=a[(a.length-1)];i++){
            sum2=sum2+i;
        }
        System.out.println(sum2);
        System.out.println(sum2-sum1);
    }
}
