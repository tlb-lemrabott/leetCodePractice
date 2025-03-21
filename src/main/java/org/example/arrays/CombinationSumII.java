package org.example.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, new ArrayList<>(), results, 0);
        return results;
    }
    public static void backtrack(int[] candidates, int target, List<Integer> tempList, List<List<Integer>> results, int start){
        if(target == 0){
            results.add(new ArrayList<>(tempList));
            return;
        }
        for(int i=start; i<candidates.length; i++){
            if(i > start && candidates[i] == candidates[i-1]) continue;
            if(candidates[i] <= target){
                tempList.add(candidates[i]);
                int newStart = i+1;
                backtrack(candidates, (target - candidates[i]), tempList, results, newStart);
                tempList.remove(tempList.size() - 1);
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] candidates = {10,1,2,8,6,1,5};
        int target = 7;
        System.out.println(combinationSum2(candidates, target));
    }
}
