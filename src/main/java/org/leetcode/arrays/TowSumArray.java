package org.leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

public class TowSumArray {
    public static int[] twoSumArrayWithHashSet(int[] nums, int target) {
        int[] result = new int[2];
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            int x = target - nums[i];
            if(set.contains(x)){
                result[0] = i;
                result[1] = Arrays.stream(nums).boxed().collect(Collectors.toList()).indexOf(x);
            }
            set.add(nums[i]);
        }
        return result;
    }

    public static int[] twoSumArrayWithHashMap(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int x = target - nums[i];
            if(map.containsKey(x)){
                result[0] = i;
                result[1] = map.get(x);
            }
            map.put(nums[i], i);
        }
        return result;
    }

    private static int findIndiceByValue(int arr[], int value){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == value){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(Arrays.toString(twoSumArrayWithHashSet(arr, 9)));
        System.out.println(Arrays.toString(twoSumArrayWithHashMap(arr, 9)));
    }
}
