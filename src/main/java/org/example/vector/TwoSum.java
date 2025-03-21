package org.example.vector;

import java.util.Arrays;
import java.util.Collection;
import java.util.Vector;

public class TwoSum {
    static Vector<Integer> twoSum(Vector nums, Integer target) {
        Vector<Integer> result = new Vector<>();
        for(int i=0; i<nums.size(); i++){
           Integer x = target - (Integer) nums.get(i);
           if(nums.contains(x)){
               result.add(((Integer) nums.get(i)).intValue());
               result.add(x);
               return result;
           }
        }
        return null;
    }

    public static void main(String[] args) {
        Vector<Integer> nums = new Vector<>();
        nums.add(2);
        nums.add(7);
        nums.add(11);
        nums.add(15);
        Integer target = 9;
        Vector<Integer> result = twoSum(nums, target);
        System.out.println(result);
        System.out.println();
    }


}
