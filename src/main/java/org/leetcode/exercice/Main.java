package org.leetcode.exercice;

import java.util.Arrays;

public class Main {

    /*
    Program to cyclically rotate an array by one
Input - 1, 2, 3, 4, 5
Output - 5, 1, 2, 3, 4

Input - 2, 3, 4, 5, 1
Output - 1, 2, 3, 4, 5
     */








    public static int[] cyclicallyRotate(int arr[]){
        //arr.length -1 = arr[0]
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        return arr;
    }

    //1 2 3 4 5 6 7
    //6 7 1 2 3 4 5

    public static int[] cyclicallyRotate3(int arr[], int k){
        int previous = arr[arr.length-1];
        for (int i = 0; i < arr.length * k; i++) {
            int current = arr[i % arr.length];
            arr[i % arr.length] = previous;
            previous = current;
        }
        //arr[0] = temp;
        return arr;
    }

    public static int[] cyclicallyRotate2(int arr[], int k){
        int n = 0;
        while (n < k){
            int previous = arr[arr.length-1];
            for (int i = 0; i < arr.length; i++) {
                int current = arr[i];
                arr[i] = previous;
                previous = current;
            }
            n++;
        }

        //arr[0] = temp;
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5};
        //int rotateArray[] = cyclicallyRotate(arr);
        int rotateArray2[] = cyclicallyRotate2(arr, 3);
        System.out.print(Arrays.toString(rotateArray2));
    }
}
