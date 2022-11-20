package org.example;

public class Factorial {
    static public void main(String args[]){
        int iNumber=0;
        int iFactorial=1;
        for(int i=1;i<=iNumber;i++){
            iFactorial=iFactorial * i;
        }
        System.out.println("Factorial of given number is :-"+iFactorial);
    }
}
