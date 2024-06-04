package Arlen.week2;

public class SwapNumbers {

    public static void main(String[] args) {

        int a = 25;
        int b = 150;

        System.out.println("The original value of a is " + a + " and the original value of b is " + b);

        a = b-a;
        b = b-a;
        a = a+b;
        System.out.println("The new value of a is " + a + " and the new value of b is " + b);

    }

}
