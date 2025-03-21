package org.example.leetcodeprogram.medium;

import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int actualK = k % nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, actualK-1);
        reverse(nums, actualK, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    private static void reverse(int nums[], int left, int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 0};
        int arr2[] = {1, 2, 3, 4, 5, 6, 7};
        int k =3;
        rotate(arr2, k);
    }

    // 1, 2, 3, 5, 0
    // 1, 2, 3, 0, 5
    // 1, 2, 0, 3, 5
    // 1, 0, 2, 3, 5
    // 0, 1, 2, 3, 5

}
