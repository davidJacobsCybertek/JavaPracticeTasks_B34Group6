package Aysegul.week2;

import java.util.Arrays;

public class swapTwoNumbers {
    public static void main(String[] args) {
        //Swap two variables values without using a third variable

        int a = 10;
        int b = 5;

        System.out.println("Original value of A is, " + a + " original value of B is, " + b);

        a= b-a;
        b= b-a;
        a= a+b;


        System.out.println("After swap A is now, " + a + " After swap B is now, " + b);


        // ...






    }
}
