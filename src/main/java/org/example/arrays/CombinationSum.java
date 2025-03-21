package org.example.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        verifyCombinations(result, new ArrayList<>(), candidates, target, 0);
        //verifyCombinations(candidates, target, 0, new ArrayList<>(), result);
        return result;
//        Arrays.sort(candidates);
//        List<List<Integer>> result = new ArrayList<>();
//        for(int i=0; i<candidates.length; i++){
//            List<Integer> temp = new ArrayList<>();
//            int sum = 0;
//            int j = i;
//            while (sum <= target){
//                if(sum == target){
//                    result.add(new ArrayList<>(temp));
//                    break;
//                }
//                if(sum + candidates[j] <= target){
//                    sum += candidates[j];
//                    temp.add(candidates[j]);
//                }else {
//                    j++;
//                    if(j >= candidates.length){
//                        break;
//                    }
//                }
//            }
//        }
//        return result;
    }

    static void verifyCombinations(List<List<Integer>> results, List<Integer> current, int[] candidates, int remain, int startPosition) {
//        int currentSum = current.stream().reduce(0, (sum, item) -> item + sum);
//        if(currentSum == target) {
//            results.add(current);
//        } else if (currentSum < target) {
//            for (int index = startPosition; index < candidates.length; index++) {
//                // Copy current to a new list to avoid mutating current
//                List<Integer> newCombination = new ArrayList<>();
//                for (int element : current) {
//                    newCombination.add(element);
//                }
//                // Create a new combination by adding item to current
//                newCombination.add(candidates[index]);
//                verifyCombinations(candidates, target, index, newCombination, results);
//            }
//        }


        if (remain < 0) {
        } else if (remain == 0) {
            results.add(new ArrayList<>(current));
        } else {
            for (int i = startPosition; i < candidates.length; i++) {
                current.add(candidates[i]);
                verifyCombinations(results, current, candidates, (remain - candidates[i]), i);
                current.remove(current.size() - 1);
            }
        }

    }

    public static void main(String[] args) {
        int candidates[] = {2,3,5};
        System.out.println(combinationSum(candidates, 8));
    }
}
