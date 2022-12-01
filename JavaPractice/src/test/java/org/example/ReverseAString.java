package org.example;

import org.junit.jupiter.api.Test;

public class ReverseAString {
    @Test
    public void fnReverseAString(){
        String sMyString="Selenium";
        StringBuilder sBlank=new StringBuilder();
        for(int i=sMyString.length()-1;i>=0;i--){
            sBlank.append(sMyString.charAt(i));
        }
        System.out.println(sBlank);
    }
    @Test
    public void fnUsingStringBuffer(){
        String myStr="Testing";
        StringBuffer stringBuffer=new StringBuffer(myStr);
        System.out.println(stringBuffer.reverse());
    }
}
