package org.leetcode.arrays;

public class NthPrimeNumber {

    public static int findNthPrimeNumber(int n){
        if (n < 1) {
            throw new IllegalArgumentException("n must be a positive integer.");
        }
        int number = 2;
        int primeCounter = 0;
        while (true){
            if(isPrime(number)){
                primeCounter++;
                if(primeCounter == n){
                    return number;
                }
            }
            number++;
        }
    }
    private static boolean isPrime(int num) {
        if (num == 2)
            return true;
        if (num < 2 || num % 2 == 0)
            return false;
        for (int i = 3; i * i <= num; i += 2){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //System.out.println(isPrime(6));
        int n = 5;  // Example input
        System.out.println("The " + n + "th prime number is: " + findNthPrimeNumber(n));

    }
}
