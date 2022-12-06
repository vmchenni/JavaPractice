package org.example;

import org.junit.jupiter.api.Test;

public class Singleton {
//    Process
//    Create a private constructor;
//    Create a GetInstance Method;
//    Create new Object only if earlier object in not initialized
    private static Singleton singleton=null;
    String str="";
    Singleton(){
        str="Hello";
    }
    public static Singleton getInstance(){
        if(singleton== null){
            singleton=new Singleton();
        }
        return singleton;
    }
    @Test
    public void fnTest(){
        Singleton x=getInstance();
        x.str=x.str.toUpperCase();
        System.out.println(x.str);

        Singleton y=getInstance();
        System.out.println(y.str);
    }
}
