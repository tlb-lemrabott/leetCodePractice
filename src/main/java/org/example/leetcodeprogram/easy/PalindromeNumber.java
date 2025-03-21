package org.example.leetcodeprogram.easy;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int oldvalue = x;
        int reverse = 0;
        while(x > 0){
            reverse = (reverse * 10) + (x % 10);
            x = x/10;
        }
        return oldvalue == reverse;
    }

    public static void main(String[] args) {
        System.out.println(1%100);
        System.out.println(isPalindrome(121));
    }
}
