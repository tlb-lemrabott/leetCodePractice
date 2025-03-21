package org.example.codereport.hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumSolution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = new int[2];
        for(int i=0; i<nums.length; i++){
            int x = target - nums[i];
            if(map.containsKey(i)){
                arr[0] = nums[i];
                arr[1] = x;
            }
            map.put(nums[i], i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr1 [] = new int[]{21, 2, 7, 9, 11, 4, 6};
        System.out.println(Arrays.toString(twoSum(arr1, 9)));
    }


}
