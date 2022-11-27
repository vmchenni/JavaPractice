package org.example;
import java.util.*;
public class ConvertDecimalToBinary {
    public static void main(String[] args){
//        System.out.println(fnConvertDecimalToBinary(156));
       fnConvertDecimalToBinary(150);

    }
    public static void fnConvertDecimalToBinary(int n){
        List list=new ArrayList() ;
          while(n!=0){
            list.add(n%2);
            n=n/2;
          }
        Collections.reverse(list);
        System.out.println(list);
    }

}
