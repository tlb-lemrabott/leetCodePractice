package org.example.codereport.numbers;

public class PrimeProduct {

    public static int isPrimeProduct(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                if(isPrime(i) && isPrime(j) && n == i * j){
                    System.out.println(i + ", " + j);
                    return 1;
                }
            }
        }
        return 0;
    }

    public static boolean isPrime(int n){
        if(n==0) return false;
        for (int i=2; i<n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int n = 22;
        System.out.println(isPrimeProduct(n));
    }


}
