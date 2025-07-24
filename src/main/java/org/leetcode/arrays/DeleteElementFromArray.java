package org.leetcode.arrays;

public class DeleteElementFromArray {
    public int[] removeByValue(int arr[], int target){
        int targetIndex=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                targetIndex = i;
                break;
            }
        }
        if(targetIndex != -1){
            int newArray[] = new int[arr.length-1];
            for(int i=0, k=0; i<arr.length; i++){
                if(i == targetIndex){
                    continue;
                }
                newArray[k++] = arr[i];
            }
            return newArray;
        }
        return null;
    }
}
