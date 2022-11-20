package org.example;

public class Fibboaci {
    public static void main(String args[]){
        int iNum1=0;
        int iNum2=1;
        int iSum=0;
        for (int i=1;i<=10;i++){
            System.out.println(iNum1);
            int sum=iNum1+iNum2;
            iNum1=iNum2;
            iNum2=sum;
        }
    }
}
