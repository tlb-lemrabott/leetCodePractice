package org.leetcode.leetcodeprogram.easy;

import java.util.Arrays;

public class HasTripletSum2 {
    static int [] hasTripletSum(int[] arr, int target) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            int x = target - arr[i];
            int left = i + 1;
            int right = arr.length-1;
            while (left < right) {
                if (x == arr[left] + arr[right]){
                    return new int[]{arr[i], arr[left], arr[right]};
                }else if (x > arr[left] + arr[right]){
                    left++;
                }else {
                    right--;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int [] arr = {1, 3, 3, 5, 4, 0};
        int target = 4;
        System.out.println(Arrays.toString(hasTripletSum(arr, target)));
    }
}
