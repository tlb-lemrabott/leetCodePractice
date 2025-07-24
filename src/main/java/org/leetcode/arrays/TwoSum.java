package org.leetcode.arrays;

import java.util.HashMap;

public class TwoSum {

    public int twoSum(int arr[], int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int x = target - arr[i];
            if(map.containsKey(x)){
                return x;
            }
            map.put(arr[i], i);
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
