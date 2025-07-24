package org.leetcode.leetcodeprogram.easy;

public class Sqrt_X {
    public static int mySqrt(int number) {
        if (number == 0 || number == 1) {
            return number;
        }
        int start = 1;
        int end = number;
        int result = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid <= number / mid) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(8));
        System.out.println(mySqrt(0));
        System.out.println(mySqrt(1));
        System.out.println(mySqrt(15));
    }
}
