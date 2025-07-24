package org.leetcode.leetcodeprogram.easy;

public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>>= 1;
        }
        return count;
    }
    public static void main(String[] args) {
        NumberOf1Bits solution = new NumberOf1Bits();
        System.out.println(solution.hammingWeight(11));
        System.out.println(solution.hammingWeight(128));
        System.out.println(solution.hammingWeight(2147483645));
    }
}

