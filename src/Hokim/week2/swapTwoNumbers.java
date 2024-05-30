package Hokim.week2;

public class swapTwoNumbers {
    public static void main(String[] args) {

        int a = 5;
        int b = 7;

        a = b + a; //12;
        b = a - b; //12-7 = 5;
        a = a - b; //12-5 = 7;

        // int temp;
        // temp = a;
        // a = b;
        // b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
//Swap two variable' values without using a third variable