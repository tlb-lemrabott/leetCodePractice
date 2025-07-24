package org.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j=i+1; j<nums.length; j++){
                if (j > i+1 && nums[j] == nums[j - 1]) continue;
                for (int k=j+1; k<nums.length; k++){
                    if (k > j+1 && nums[k] == nums[k - 1]) continue;
                    if(i != j && i != k && j != k && (nums[i] + nums[j] + nums[k] == 0)){
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }
        return result;
    }

    public static List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int arr[] = new int[]{-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum2(arr));
    }
}
