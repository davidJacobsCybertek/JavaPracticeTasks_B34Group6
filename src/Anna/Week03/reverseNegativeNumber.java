package Anna.Week03;

public class reverseNegativeNumber {
    public static void main(String[] args) {

        System.out.println(reverseNegative(-35));
    }

    public static int reverseNegative(int num){

        num = -num; // Convert to positive for easier manipulation
        int reversed = 0;

        while (num != 0) { //35, 3
            int digit = num % 10;// 5 is remainder; 3 is remainder(digit)
            num /= 10; //num = 3; num = 0

            reversed = reversed * 10 + digit;
        }

        return -reversed; // Convert back to negative



    }
    //Write a return method that can reverse digits of a negative number and return it as int
    //input: -35  output: -53


}

