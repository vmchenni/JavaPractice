package org.example;

import org.junit.jupiter.api.Test;

public class Pallindrom {
    @Test
    public void fnPallindrom(){

        int iMynumber=121;
        int rev=0;
        int iActualNumber=iMynumber;
        while(iMynumber!=0){
            int iReminder=iMynumber%10;
            rev=rev*10+iReminder;
            iMynumber=iMynumber/10;

        }
        if(iActualNumber == rev){
            System.out.println("Number is Palli");
        }
    }
}
