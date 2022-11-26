package org.example;

import java.util.Scanner;

public class CalculatorUsingSwitchCase {
    public static void main(String[] args){
        System.out.println("Enter first number");
        int iFirstNumber= new Scanner(System.in).nextInt();

        System.out.println("Enter operator");
        char chOperator=new Scanner(System.in).next().charAt(0);

        System.out.println("Enter second number");
        int iSecondNumber=new Scanner(System.in).nextInt();

        switch (chOperator) {
            case '+' -> System.out.println(iFirstNumber + iSecondNumber);
            case '-' -> System.out.println(iFirstNumber - iSecondNumber);
            case '*' -> System.out.println(iFirstNumber * iSecondNumber);
            case '%' -> System.out.println(iFirstNumber / iSecondNumber);
        }
    }
}
