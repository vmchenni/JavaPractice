package org.example;

public class ConvertBinaryToDecimal {
    public static void main(String[] args){
        long lBinaryNumber=10011011;
        double decimal=0;
        int i=0;
        while(lBinaryNumber !=0){
            long remainder=lBinaryNumber % 10;
            lBinaryNumber=lBinaryNumber/10;
            decimal=decimal+remainder*Math.pow(2,i);
            i++;
        }

        System.out.println(decimal);
    }

}
