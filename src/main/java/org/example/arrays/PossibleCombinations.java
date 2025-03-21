package org.example.arrays;

import java.util.ArrayList;
import java.util.List;

//Given an array of numbers, find all the possible combinations of numbers that add up to a given number.
public class PossibleCombinations {
    public static List<List<Integer>> findPossibleCombinations(int nums[], int target){
        List<List<Integer>> results = new ArrayList<>();
        backtrackPossibleCombinations(nums, target, new ArrayList<>(), results, 0);
        return results;
    }

    public static void backtrackPossibleCombinations(int nums[], int target, List<Integer> tempList, List<List<Integer>> results, int start){
        if(target == 0){
            results.add(new ArrayList<>(tempList));
            return;
        }
        for(int i=start; i<nums.length; i++){
            //if (i > start && nums[i] == nums[i - 1]) continue;
            if(nums[i] <= target){
                tempList.add(nums[i]);
                backtrackPossibleCombinations(nums, (target - nums[i]), tempList, results, i);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {4, 2, 1, 4};
        int target = 4;
        System.out.println(findPossibleCombinations(nums, target));
    }
}



//[[2, 1, 1] [3,1] [3, 1]]

