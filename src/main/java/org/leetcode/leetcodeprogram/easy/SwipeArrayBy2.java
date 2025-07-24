package org.leetcode.leetcodeprogram.easy;

import java.util.Arrays;

public class SwipeArrayBy2 {
    private static int[] swipeArrayBy2(int []nums){
        for(int i=0; i<nums.length; i = i+2){
            int temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        int nums[] = {1,2, 3,4, 5,6};
        System.out.println(Arrays.toString(swipeArrayBy2(nums)));
        //output {2,1, 4,3, 6,5}
    }
}
