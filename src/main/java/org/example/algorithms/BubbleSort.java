package org.example.algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static int[] sort(int arr[]){
        for(int i=0; i<arr.length - 1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{2, 5, 9, 4, 3, 0};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
