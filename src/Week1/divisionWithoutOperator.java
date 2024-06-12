package Week1;

public class divisionWithoutOperator {
    public static void main(String[] args) {
        //Write a method that can divide two numbers without using division operator


        System.out.println(divide(13,0));



    }

    private static int divide(int divident, int divider) {

        if(divider==0){
            System.out.print("Math ERROR");
            return Integer.MIN_VALUE;
        }

        int division=0;

        while (divident>=divider){

            divident-=divider;
            division++;

        }


        return division;
    }
}
