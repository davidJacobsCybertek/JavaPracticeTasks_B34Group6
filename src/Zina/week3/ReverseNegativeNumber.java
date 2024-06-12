package Zina.week3;

public class ReverseNegativeNumber {
    public static void main(String[] args) {

        int num = 123;
        String numStr = "" + num;
        String reversedNum = "";

       if (numStr.contains("-")){
        for (int i = numStr.length()-1; i >=0 ; i--) {
            reversedNum += numStr.charAt(i);
            if (i == 0) {
                System.out.println(reversedNum);
            }
        }


       } else {
           System.out.println("Number is positive");
       }
    }

    }



