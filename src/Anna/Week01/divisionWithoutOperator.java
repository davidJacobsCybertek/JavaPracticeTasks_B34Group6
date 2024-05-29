package Anna.Week01;

public class divisionWithoutOperator {
    public static void main(String[] args) {
        //Write a method that can divide two numbers without using division operator

        divideWithoutOperator(10, 2);
    }

    public static void divideWithoutOperator (int num1, int num2){

        int result = 0;

        while (num1 >= num2){
            num1 -= num2;
            result ++;
        }
        System.out.println(result);
    }


}
