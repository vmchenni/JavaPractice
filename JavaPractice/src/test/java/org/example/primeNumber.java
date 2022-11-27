package org.example;

import org.junit.jupiter.api.Test;

public class primeNumber {
    @Test
    public void fnPrimeNumber(){
        int iNumber=13;
        boolean iReponse=false;
        for(int i=2;i<iNumber/2;i++){
                if((iNumber % i)==0){
                    iReponse=true;
                    break;
                }
        }
        if(iReponse){
            System.out.println("The number "+iNumber+" is not a prime number");
        }else{
            System.out.println("The number "+iNumber+" is a prime number");
        }

    }
}