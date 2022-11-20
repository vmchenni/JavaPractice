package org.example;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String args[]){
        System.out.println("Enter a number");
        Scanner scanner=new Scanner(System.in);
        int iNaturalNumber=scanner.nextInt();
        int sum=0;
        for (int i=0;i<=iNaturalNumber;i++){
           sum=sum+i;
        }
        System.out.println("Sum of natural number  "+iNaturalNumber+" is :-"+sum);
    }
}
