package org.leetcode.codereport.recursion;

public class Fibonacci {

    public static int fibonacci(int n){
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }


    public static void main(String[] args) {
        int n = 2;
        System.out.println(fibonacci(n));
    }

}
