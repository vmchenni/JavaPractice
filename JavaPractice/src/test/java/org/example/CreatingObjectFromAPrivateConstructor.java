package org.example;

public class CreatingObjectFromAPrivateConstructor {
    int num=10;
    private CreatingObjectFromAPrivateConstructor(){
        num=20;
    }
//    Create static method to create object and call from another class
    public static int fnCreateObject(){
        CreatingObjectFromAPrivateConstructor Obj=new CreatingObjectFromAPrivateConstructor();
        return Obj.num;
    }

    public static void main(String[] args) {
        CreatingObjectFromAPrivateConstructor Obj=new CreatingObjectFromAPrivateConstructor();
        System.out.println(Obj.num);
    }
}

