package Hokim.Week1;

public class oddOrEven {
    public static void main(String[] args) {
        //Write  a method which can identifies given number is even or odd

        oddOrEven(101);

    }
//OddOrEven method;
    public static void oddOrEven (int num){
        if(num % 2 ==0){
            System.out.println("Number is EVEN!");
        }else {
            System.out.println("Number is ODD!");
        }
    }
 }
