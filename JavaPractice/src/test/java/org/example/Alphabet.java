package org.example;

import java.util.Scanner;

public class Alphabet {
    public static void main(String args[]){
        System.out.println("Enter a char");
        Scanner scanner=new Scanner(System.in);
        char ch=scanner.next().charAt(0);
        if(ch >= 'a' && ch <='z' || ch >= 'A' && ch <='Z' ){
            System.out.println("Entered number is Char");
        }else{
            System.out.println("Entered number is not Char");
        }
    }
}
