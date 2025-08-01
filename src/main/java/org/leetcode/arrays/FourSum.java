package org.leetcode.arrays;

import java.util.*;

public class FourSum {
    public static List<List<Integer>> findFourSum(int[] nums, int target) {
        List<List<Integer>> resultList = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return resultList;
        }
        Arrays.sort(nums);
        for(int i=0; i<nums.length-3; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            for(int j=i+1; j<nums.length-2; j++){
                if(j>i+1 && nums[j] == nums[j-1]) continue;
                int left = j+1;
                int right = nums.length-1;
                while(left < right){
                    long sum = (long)nums[i] + (long)nums[j] + (long)nums[left] + (long)nums[right];
                    if( sum == target){
                        resultList.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (left<right && nums[left] == nums[left+1]) left++;
                        while (left<right && nums[left] == nums[right-1]) right--;
                        left++;
                        right--;
                    }else if(sum<target){
                        left++;
                    }else {
                        right--;
                    }
                }
            }
        }
        return resultList;
    }

    public static void main(String[] args) {
        int nums4[] = {1000000000, 1000000000, 1000000000, 1000000000};
        System.out.println(findFourSum(nums4, -294967296));
    }
}
