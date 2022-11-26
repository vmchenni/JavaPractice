package org.example;

import org.junit.jupiter.api.Test;

public class FactorsOfANumber {
    @Test
    public void fnFactorsOfANumber(){
        int iNum=60;
        for(int i=1;i<= iNum;i++){
            if(iNum %  i == 0){
                System.out.print(" "+i);
            }
        }
    }
}
