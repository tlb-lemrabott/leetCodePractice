package org.leetcode.other;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3 , 4, 5, 7, 9, 8, 6};
        System.out.println(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }else {
                set.add(nums[i]);
            }
        }
        return false;
    }
}
