package org.example;

import org.junit.jupiter.api.Test;

public class PassNullToAOverloadedMethod {
    @Test
    public void fnPassNullToAOverloadedMethod(){
        String s=null;
        print(s);
    }

    private void print(String s) {
        System.out.println(s);
    }
}
