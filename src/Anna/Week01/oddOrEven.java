package Anna.Week01;

public class oddOrEven {
    public static void main(String[] args) {
        //Write  a method which can identifies given number is even or odd

        oddOrEven(10);
        oddOrEven(37);

    }

    public static void oddOrEven(int number) {

        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }
    }
}

