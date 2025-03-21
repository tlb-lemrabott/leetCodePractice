package org.example.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;
        int k = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[k-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 3, 1};
        int nums2[] = {1, 1, 2};
        int nums3[] = {4, 5, 5, 5, 7, 8};
        System.out.println("result is: " + removeDuplicates(nums3));
    }
}
