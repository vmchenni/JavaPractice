package org.example;

import java.util.Scanner;

public class OvalOrConsonant {
  public static void main(String args[]){
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter a Char");
      char ch=scanner.next().charAt(0);
      if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'  ){
          System.out.println("Its a Oval");
      }else{
          System.out.println("Its a Consonant");
      }
  }
}
