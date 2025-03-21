package org.example.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static int[] removeDuplicate(int []arr){
        Set<Integer> set = new HashSet<>();
        for(int item : arr){
            set.add(item);
        }
        int result[] = new int[set.size()];
        int i = 0;
        for(int item : set){
            result[i++] = item;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 2, 4, 5, 1, 6, 5};
        System.out.println(Arrays.toString(removeDuplicate(inputArray)));
    }
}
