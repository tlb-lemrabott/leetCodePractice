package org.example.arrays;

import java.util.Arrays;

public class RotateArray {
    public static int[] rotateArray(int[] arr){
        int newArr[] = new int[arr.length];
        newArr[0] = arr[arr.length-1];
        for(int i=0, k=1; i<arr.length-1; i++, k++){
            newArr[k] = arr[i];
        }
        return newArr;
    }

    public static int[] rotateArrayByK(int[] arr, int k){
        int newArr[] = new int[arr.length];
        for(int i=0, j=arr.length-1; i<k; i++, j--){
            newArr[i] = arr[j];
        }
        for(int i=k, j=0; i<arr.length; i++, j++){
            newArr[i] = arr[j];
        }

//        for (int i = k; i < arr.length; i++) {
//            newArr[i] = arr[i - k];
//        }
        return newArr;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5};
        //System.out.print(Arrays.toString(rotateArray(arr)));
        System.out.print(Arrays.toString(rotateArrayByK(arr, 3)));
    }
}
