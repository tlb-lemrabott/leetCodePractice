package org.example.hashMap;

import java.util.HashMap;

public class TowSumArray {

    public static Integer[] twoSum(int arr[], int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int x = target - arr[i];
            if(map.containsKey(x)){
                // Return the indices of the two numbers
                return new Integer[]{arr[map.get(x)], arr[i]};
            }
            map.put(arr[i], i);
        }
        // Return an array with -1 if no solution is found
        return new Integer[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        Integer[] result = twoSum(arr, target);

        // Output the result
        if(result[0] != -1) {
            System.out.println("Indices found: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }


}
