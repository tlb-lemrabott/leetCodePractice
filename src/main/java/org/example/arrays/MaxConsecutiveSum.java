package org.example.arrays;

public class MaxConsecutiveSum {
    public static int findMaxConsecutiveSum(int arr[]){
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length - 1; i++){
            int currentSum = arr[i] + arr[i+1];
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        //int[] arr = {10, -2, 5, 6, -5};
        //int[] arr2 = {10};
        int[] arr1 = {10, -2, 5, 6, -5};
        int[] arr2 = {};
        int[] arr3 = {1}; // Single element
        int[] arr4 = {2, 3}; // Two elements
        int[] arr5 = {-1, -2, -3, -4}; // All negative numbers
        int[] arr6 = {7, 7, 7, 7}; // Identical elements

        int maxSum = findMaxConsecutiveSum(arr6);
        System.out.println("The maximum consecutive sum is: " + maxSum);
    }
}
