package org.leetcode.leetcodeprogram.easy;

import java.util.Arrays;
import java.util.Stack;

public class HasTripletSum {
    static int [] hasTripletSum(int[] arr, int target) {
        int []result = new int[3];
        for (int i = 0; i < arr.length-2; i++) {
            Stack<Integer> stack = new Stack<>();
            for (int j=i+1; j<arr.length; j++) {
                int x = target - arr[i] - arr[j];
                if (stack.contains(x)){
                   result[0] = x;
                   result[1] = arr[i];
                   result[2] = arr[j];
                   return result;
                }
                stack.push(arr[j]);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int [] arr = {1, 3, 3, 5, 4, 0};
        int target = 9;
        System.out.println(Arrays.toString(hasTripletSum(arr, target)));
    }
}