package org.example;

import org.junit.jupiter.api.Test;

public class RemoveJunkChar {
    @Test
    public void fnRemoveJunkChar(){
       String sMyStr="!@#$Testing World()&*";
       sMyStr=sMyStr.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(sMyStr);
    }
    @Test
    public void fnReverseInteger(){
        int iMyNumber=12347;
        int rev=0;
       while (iMyNumber!=0){
           rev=rev*10+iMyNumber%10;
           iMyNumber=iMyNumber/10;
       }
        System.out.println(rev);


    }
}