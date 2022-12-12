package org.example;

import org.junit.jupiter.api.Test;

public class ArmstrongNumber {
//    A number is said to be armstrong if sum of cube of each number is equal to given number
//    eg: 153 =1*1*1 + 5*5*5 + 3*3*3 =153
//    370 = 3*3*3 + 7 *7*7 + 0* 0 *0
//    371
    @Test
    public void fnTestArmstrong(){
        isArmstrong(407);
    }

    private void isArmstrong(int num) {
        double cube=0;
        int iOriginalNumber=num;
        while(num != 0){
            cube= (cube+(Math.pow(num%10,3)));
            num=num/10;
        }
        if(cube == iOriginalNumber)
            System.out.println("Number "+iOriginalNumber+" is a Armstrong number");
        else
            System.out.println("Number "+iOriginalNumber+" is not a Armstrong number");
    }
}
