package org.example.leetcodeprogram.medium;

public class ReverseInteger {
    public static int reverse(int x) {
        int n = 0;
        while(x != 0){
            int digit = x % 10;
            if(n > Integer.MAX_VALUE/10 || (n == Integer.MAX_VALUE && digit > 7)) return 0;
            if(n < Integer.MIN_VALUE/10 || (n == Integer.MIN_VALUE && digit < -8)) return 0;
            n = (n * 10) + digit;
            x/=10;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
}
