package org.example;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String args[]){
        System.out.println("Enter a number to check");
        Scanner scanner=new Scanner(System.in);
        double dMyNumber=scanner.nextDouble();
        if(dMyNumber > 0){
            System.out.println("Number is +ve");
        }else{
            System.out.println("Number is -ve");
        }
    }
}
