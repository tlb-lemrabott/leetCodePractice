package org.leetcode.leetcodeprogram.easy;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digitArray) {
        int arrayLength = digitArray.length;
        for (int index = arrayLength - 1; index >= 0; index--) {
            if (digitArray[index] < 9) {
                digitArray[index]++;
                return digitArray;
            }
            digitArray[index] = 0;
        }
        int[] incrementedArray = new int[arrayLength + 1];
        incrementedArray[0] = 1;
        return incrementedArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(plusOne(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(plusOne(new int[]{9})));
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9, 9})));
    }
}
