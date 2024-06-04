package Arlen.week2;

public class Divisibleby3_5_15 {

    public static void main(String[] args) {
        // Numbers - Swap Numbers

        String divideBy3 = "";
        String divideBy5 = "";
        String divideBy15 = "";

        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0){
                divideBy3 = divideBy3 + i;
            }else if (i % 5 == 0){
                divideBy5 = divideBy5 + i;
            } else {
                divideBy15 = divideBy15 + i;
            }
        }

        System.out.println(divideBy3);
        System.out.println();
        System.out.println(divideBy5);
        System.out.println();
        System.out.println(divideBy15);

    }

}
