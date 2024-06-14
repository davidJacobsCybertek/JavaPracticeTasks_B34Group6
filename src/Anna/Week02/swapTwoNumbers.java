package Anna.Week02;

public class swapTwoNumbers {
    public static void main(String[] args) {
        //Swap two variable values without using a third variable

        int a = 10;
        int b = 5;

        int temp = a;
        a = b;
        b = temp;

//        a = b + a; //15
//        b = a - b; //15-5 = 10;
//        a = a - b; //15-10 = 5;


        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}

