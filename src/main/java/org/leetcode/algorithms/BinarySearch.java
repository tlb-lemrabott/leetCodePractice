package org.leetcode.algorithms;

public class BinarySearch {

    public static int binarySearchRecursive(int arr[], int target){
        return binarySearchRecursiveHelper(arr, target, 0, arr.length-1);
    }
    private static int binarySearchRecursiveHelper(int arr[], int target, int left, int right){
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left)/2;
        if(arr[mid] == target){
            return arr[mid];
        }else if(arr[mid] < target){
            return binarySearchRecursiveHelper(arr, target, mid+1, right);
        }else {
            return binarySearchRecursiveHelper(arr, target, left, mid-1);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 4, 5, 7, 3, 0};
        System.out.println(binarySearchRecursive(arr, 4));
    }

}
