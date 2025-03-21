package org.example.leetcodeprogram.easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    private static int[] findTwoSum(int []nums, int target){
        int twoSumArr[] = new int[]{-1, -1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int x = target - nums[i];
            if(map.containsKey(x)){
                twoSumArr[0] = map.get(x);
                twoSumArr[1] = i;
                return twoSumArr;
            }
            map.put(nums[i], i);
        }
        return twoSumArr;
    }

    public static void main(String[] args) {
        int[] nums = {11, 7, 2, 15};
        int target = 9;
        System.out.println(Arrays.toString(findTwoSum(nums, target)));
    }
}
