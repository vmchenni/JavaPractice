package org.example;

import org.junit.jupiter.api.Test;

public class RemoveJunkChar {
    @Test
    public void fnRemoveJunkChar(){
       String sMyStr="!@#$Testing World()&*";
       sMyStr=sMyStr.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(sMyStr);
    }
}