package Hokim.Week3;

public class ReverseNegativeNumber {
    public static void main(String[] args) {

        int num = -123;

        String numStr = "" + num;
        String reversedNumStr = "";
        //if we return negative number we >=0 by using below "if" condition;
        for (int i = numStr.length()-1; i > 0 ; i--) {
//            if(numStr.charAt(i)=='-'){
//                reversedNumStr = "-" + reversedNumStr;
//                continue;
//            }
            reversedNumStr += numStr.charAt(i);
        }
        int reversedNum = Integer.parseInt(reversedNumStr);
        System.out.println(reversedNum);
    }
}
/*
Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int
 */