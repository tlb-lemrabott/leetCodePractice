package org.example.other;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3 , 4, 6, 7, 9, 4, 5};
        int [] arr2 = {2,7,11,15};
        int [] arr3 = {3,2,4};
        //System.out.println(Arrays.toString(twoSum2(arr, 9)));
        //System.out.println(Arrays.toString(twoSum2(arr2, 9)));
        System.out.println(Arrays.toString(twoSum2(arr, 6)));
    }
    public static int[] twoSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            for (int j=0; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    list.add(Arrays.asList(nums[i], nums[j]));
                    //list.add(nums[j]);
                    //System.out.println(nums[i] + "," + nums[j]);
                    System.out.println(list);
                    //return list.stream().mapToInt(Integer::intValue).toArray();
                }
            }
        }
        //System.out.println(Arrays.asList(list));
        return null;
    }

    public static int[] twoSum2(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            for (int j=0; j<nums.length; j++){
                if(nums[i] + nums[j] == target && i != j){
                    list.add(i);
                    list.add(j);
                    System.out.println(nums[i] + "," + nums[j]);
                    return list.stream().mapToInt(Integer::intValue).toArray();
                }
            }
        }
        return null;
    }

    public static int[] twoSum3(int[] nums, int target) {
        int arr[] = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int x = target - nums[i];
            if(map.containsKey(x)){
                arr[0] = i;
                arr[1] = map.get(x);
                System.out.println(nums[i] + "," + x);
            }
            map.put(nums[i], i);
        }
        return arr;
    }
}