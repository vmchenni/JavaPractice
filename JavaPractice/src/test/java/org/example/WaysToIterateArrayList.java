package org.example;

import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Iterator;

public class WaysToIterateArrayList {
    @Test
    public void fnInterateArrayList(){
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("Game Of Thrones");
        arrayList.add("Breaking Bad");
        arrayList.add("Walking Dead");
        arrayList.add("Prison Break ");

//        Using JDK 1.8 for each and Lambda
        arrayList.forEach(System.out::println);

        System.out.println("*********Iterator************");
        Iterator<String> iterator=arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("*********Using enhanced for loop************");
        for (String s:arrayList){
            System.out.println(s);
        }
        System.out.println("*********Using Index************");
        for (int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }


}
