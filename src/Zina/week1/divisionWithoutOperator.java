package Zina.week1;

public class divisionWithoutOperator {
    public static void main(String[] args) {
        //Write a method that can divide two numbers without using division operator

 int num1 = 20;
 int num2 = 4;
int result = 0;
        while (num1 >= num2){
            num1 -= num2;
            result++;
        }
        System.out.println(result);
}




}
