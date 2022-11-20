package org.example;

import org.junit.jupiter.api.Test;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class OddNumberAndEvenNumber {
    @Test
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int inputNumber=scanner.nextInt();
        if(inputNumber % 2 == 0){
            System.out.println("Its a even number");
        }else{
            System.out.println("Its a odd number");
        }
    }
}
