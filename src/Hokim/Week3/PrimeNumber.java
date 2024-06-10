package Hokim.Week3;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(2));
    }
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

/*
Numbers -- Prime Number
Write a method that can check if a number is
prime or not
 */