package Hokim.Week1;

public class divisionWithoutOperator {
    public static void main(String[] args) {
        //Write a method that can divide two numbers without using division operator
        division(-100, -10);
    }

//Calculator method;
    public static void division(int num1, int num2) {
        int count = 0;
        if (num1 >= 0 && num2 >= 0) {
            while (num1 >= num2) {
                num1 = num1 - num2;
                count += 1;
            }

            System.out.println(count);

        } else if (num1 >= 0 && num2 < 0 || num1 < 0 && num2 >= 0) {
            while (Math.abs(num1) >= Math.abs(num2)) {
                num1 = Math.abs(num1) - Math.abs(num2);
                count += 1;
            }

            System.out.println("-" + count);

        } else if (num1 < 0 && num2 < 0) {
            while (Math.abs(num1) >= Math.abs(num2)) {
                num1 = Math.abs(num1) - Math.abs(num2);
                count += 1;
            }

            System.out.println(count);
        }
    }
}
