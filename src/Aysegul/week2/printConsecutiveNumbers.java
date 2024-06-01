package Aysegul.week2;

public class printConsecutiveNumbers {
    public static void main(String[] args) {
      /*  Write a function: that, given a positive integer N, prints the consecutive numbers from 1 to N,
      each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility,
      Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5,
      it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.
      For example, numbers divisible by both 2 and 3 should be replacée by CodilityTest and numbers divisible
      by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.

        For example, here is the output for N = 24:
        1
        Codility
       Test
        Codility
        Coders
        CodilityTest
        7
        Codility
        Test
        Codi1ityCoders
        11
        CodilityTest
        13
        Codility
        TestCoders
        Codility
        17
*/
        codility(10);
     

    }


    public static void codility(int num){
        for (int i = 1; i <= num ; i++) {
            if (i%2==0 || i%3==0 || i%5==0){
                if(i%2==0 && i%3!=0 && i%5!=0){
                    //Codility
                    System.out.println("Codility "+ i);
                }else if(i%2!=0 && i%3==0 && i%5!=0){
                    //Test
                    System.out.println("Test "+i);
                }else if(i%2!=0 && i%3!=0 && i%5==0){
                    //Coders
                    System.out.println("Coders "+ i);
                } else if (i%2==0 && i%3==0 && i%5!=0) {
                    //CodilityTest
                    System.out.println("CodilityTest "+i);
                } else if (i%2==0 && i%3!=0 && i%5==0) {
                    //CodilityCoders
                    System.out.println("CodilityCoders "+i);
                } else if (i%2!=0 && i%3==0 && i%5==0) {
                    //TestCoders
                    System.out.println("TestCoders "+i);
                } else if (i%2==0 && i%3==0 && i%5==0) {
                    System.out.println("CodilityTestCoders "+i);
                }
            }else {
                System.out.println(i);
            }
        }
    }

   
}
