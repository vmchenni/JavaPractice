package org.example;

import org.junit.jupiter.api.Test;

public class CheckIfStringContainsNumeric {
    @Test
    public void fnCheckIfStringContainsNumeric(){
        String str="12HelloWorld";
        System.out.println(isContainsNumeric(str));
    }

    private boolean isContainsNumeric(String str) {
        boolean isContainNumber=false;
        if(str.trim().length() > 0){
            for(int i=0;i< str.length();i++){
                if(Character.isDigit(str.charAt(i))){
                    isContainNumber=true;
                    break;
                }
            }
            return isContainNumber;
        }else{
            return isContainNumber;
        }
    }
}
