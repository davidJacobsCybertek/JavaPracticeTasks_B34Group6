package Arlen.Week1;

public class Task2 {

    public static void main(String[] args) {

      division(100,10);

    }

    public static void division(int num1, int num2) {
        int count = 0;
        if (num1 >= 0 && num2 >= 0) {
            while (num1 >= num2){
                num1 = num1 - num2;
                count += 1;
            }

            System.out.println(count);

        }else if (num1 >= 0 && num2 < 0 || num1 < 0 && num2 >= 0) {
            while (Math.abs(num1) >= Math.abs(num2)){
                num1 = Math.abs(num1) - Math.abs(num2);
                count += 1;
            }

            System.out.println("-" + count);

        }

        }
    }


