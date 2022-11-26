package org.example;

public class FactorialUsingRecurssion {

    public static void main(String[] args){
       int iNum=3;
        System.out.println(factorial(iNum));
    }
    private static int factorial(int iNum) {
        if(iNum >= 1){
           return (iNum * factorial((iNum-1)));
        }else{
           return  1;
        }
    }

}
