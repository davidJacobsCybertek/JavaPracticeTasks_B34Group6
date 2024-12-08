package Anna.Week03;

public class primeNumber {
       // Write a method that can check if a number is prime or not
       public static void main(String[] args) {

           int number = 29;
           if (isPrime(number)) {
               System.out.println(number + " is a prime number");
           } else {
               System.out.println(number + " is not a prime number");
           }

       }

    public static boolean isPrime(int number){

        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;


    }

}
