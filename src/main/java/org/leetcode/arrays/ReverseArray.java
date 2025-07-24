package org.leetcode.arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void reverseArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int first = 0; int last = arr.length - 1;
        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9};
        reverseArray(arr);
    }
}
