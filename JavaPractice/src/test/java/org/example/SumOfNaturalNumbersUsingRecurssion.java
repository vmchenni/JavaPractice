package org.example;

public class SumOfNaturalNumbersUsingRecurssion {
    public static void main(String[] args){
        System.out.println("Hello");
        int num=3;
        System.out.println(sumOfTwoNumber(num));
    }
    public static int sumOfTwoNumber(int num){
        if(num !=0){
            return num+sumOfTwoNumber(num-1);
        }else{
            return num;
        }

    }
}
