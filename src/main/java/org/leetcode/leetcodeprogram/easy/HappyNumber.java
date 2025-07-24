package org.leetcode.leetcodeprogram.easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int number) {
        Set<Integer> seenNumbers = new HashSet<>();
        while (number != 1 && !seenNumbers.contains(number)) {
            seenNumbers.add(number);
            number = getSumOfSquaresOfDigits(number);
        }
        return number == 1;
    }
    private static int getSumOfSquaresOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit * lastDigit;
            number = number / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        HappyNumber checker = new HappyNumber();
        int input1 = 19;
        System.out.println(input1 + " is happy: " + checker.isHappy(input1));
        int input2 = 2;
        System.out.println(input2 + " is happy: " + checker.isHappy(input2));
    }
}

