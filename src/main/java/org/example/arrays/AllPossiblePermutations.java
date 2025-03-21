package org.example.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllPossiblePermutations {

    public static List<List<Integer>> findAllPossiblePermutations(int nums[]){
        List<List<Integer>> permutations = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        backtrack(nums, tempList, permutations);
        return permutations;
    }

    private static void backtrack(int nums[], List<Integer> tempList, List<List<Integer>> permutations){
        if(tempList.size() == nums.length){
            permutations.add(new ArrayList<>(tempList));
        }else {
            for(int i=0; i<nums.length; i++) {
                if(tempList.contains(nums[i])) {
                    continue;
                }
                else {
                    tempList.add(nums[i]);
                    backtrack(nums, tempList, permutations);
                    tempList.remove(tempList.size() - 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2};
        System.out.println(findAllPossiblePermutations(arr));
    }
}
