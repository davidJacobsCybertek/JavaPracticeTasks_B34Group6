package week6;

import java.util.Arrays;

public class SumOfDigits {
    /*Write a method that can return the sum of the digits in a string
        Ex:  "12 java 5 apple 3"  ==>  20 */
    public static void main(String[] args) {
        System.out.println(sumOfDigits("12 java 5 apple 3"));
        System.out.println(getSumOfNumbers("12 java 5 apple 3"));
    }
    public  static int  sumOfDigits(String str) {
        int total = 0;
        char[] ch =  str.toCharArray();
        for(char each: ch) {
            if(Character.isDigit(each)) {
                total += Integer.valueOf(""+each);
            }
        }
        return total;
    }
    public static int getSumOfNumbers(String str) {
        /*
            Please implement this method to
            return the sum of all integers found in the parameter String.
            You can assume that integers are separated from other parts with one or more spaces (' ' symbol).

            For example, s="12 some text 3 7", result: 22 (12+3+7=22)
        */

        int sum = 0;

        String[] numbers = str.replaceAll("[\\D]+"," ").split(" ");
        System.out.println(Arrays.toString(numbers));
        for(String each : numbers){
            sum+=Integer.parseInt(each);
        }
        return sum;
    }

}
