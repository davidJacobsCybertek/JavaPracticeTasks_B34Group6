package Aysegul.week1;

public class divisionWithoutOperator {
    public static void main(String[] args) {
        //Write a method that can divide two numbers without using division operator


        int num1 = 100;
        int num2 = 15;
        int count = 0;


        while (num1>num2){
            num1=num1-num2;
            count++;
        }
        System.out.println(count);


    }




}
