package org.example.other;

import java.util.*;

public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 5, 7, 9, 8, 6};
        int[] arr2 = {1, 2, 4, 5, 6, 7, 8, 9};
        int[] arr3 = {1, 2, 0, 3, 0, 4, 5};
        int[] arr4 = {0, 4, 1, 0, 0, 8, 0, 0, 3};
        int[] arr5 = {1, 0, 2, 3, 0, 4, 5, 0};
        int[] arr6 = {0, 0, 0, 0, 0, 0, 0};
        int[] arr7 = {1, 2, 3};
        int[] arr8 = {1, 0, 2, 3, 0, 4, 5, 0};
        int[] arr9 = {1, 0, 2, 3, 0, 4};
        System.out.println(Arrays.toString(arr8));
        System.out.println(Arrays.toString(duplicateZerosUsingArray2(arr8)));
    }
    public static int[] duplicateZerosUsingDelegation(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i+1]!=0) {
                insertInplace(arr, i + 1, 0);
                i++;
            }
        }
        return arr;
    }
    public static int[] duplicateZerosWithQueue(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(arr[0]);
        for (int i = 0; i < arr.length - 1; i++) {
            int value = queue.remove();
            if (value == 0) {
                queue.add(arr[i+1]);
                arr[i + 1] = value;
                arr[i] = value;
                i++;
                if(i+1 < arr.length) {
                    queue.add(arr[i+1]);
                }
            } else {
                queue.add(arr[i+1]);
                arr[i] = value;
            }
        }
        return arr;
    }

    public static int[] duplicateZerosUsingArray2(int[] arr) {
        int arr2[] = new int[arr.length];
        arr2[0] = arr[0];
        int i, j;
        for (i = 0, j = 0; j < arr2.length - 2; i++, j++) {
            if (arr2[i] == 0) {
                arr[j] = 0;
                arr2[j + 1] = arr[j + 1];
                arr[j + 1] = 0;
                j++;
                arr2[j+1] = arr[j+1];
            } else {
                arr2[j + 1] = arr[j + 1];
                arr[j] = arr2[i];
            }
        }
        arr[j] = arr2[i];
        if (j == arr2.length - 2) {
            if(arr2[i] == 0){
                arr[j+1] = 0;
            } else if(i != j){
                arr[j+1] = arr2[i+1];
            }
        }
        return arr;
    }
    public static int[] duplicateZerosWithArrayInversed(int arr[]){
        int arr2[] = new int[arr.length];
        int i, j;
        for(i=0; i<arr.length; i++){
            arr2[i] = arr[i];
        }
        for(i=0, j=0; i<arr2.length-1 && j<arr2.length; i++, j++){
            if(arr2[i]==0){
                arr[j] = 0;
                if(j<arr2.length-1){
                    arr[j+1] = 0;
                    j++;
                }
            }else {
                arr[j] = arr2[i];
            }
        }
        if(i == j){
            arr2[arr.length-1] = arr[arr.length-1];
        }
        return arr;
    }
    public static int[] duplicateZerosWithArray(int arr[]){
        int arr2[] = new int[arr.length];
        int i, j;
        for(i=0, j=0; i<(arr.length-1) && j<arr.length; i++, j++){
            if(arr[i]==0){
                arr2[j] = 0;
                if(j<arr.length-1){
                    arr2[j+1] = 0;
                    j++;
                }
            }else {
                arr2[j] = arr[i];
            }
        }
        if(i == j){
            arr2[arr.length-1] = arr[arr.length-1];
        }
        for(i=0; i<arr.length; i++){
            arr[i] = arr2[i];
        }
        return arr;
    }
    public static int[] duplicateZerosWithList(int arr[]){
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<arr.length-1; i++){
            list.add(arr[i]);
            if(arr[i]==0){
                list.add(0);
            }
        }
        return list.stream().limit(arr.length).mapToInt(x->x).toArray();
    }
    public static int[] insertWithCopy(int[] arr, int insertIndex, int insertValue) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr2.length; i++) {
            if (i == insertIndex) {
                arr2[i] = insertValue;
            } else if (i > insertIndex) {
                arr2[i] = arr[i - 1];
            } else {
                arr2[i] = arr[i];
            }
        }
        return arr2;
    }
    public static int[] insertInplaceWithTemp(int[] arr, int insertIndex, int insertValue) {
        int previousValue = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == insertIndex) {
                previousValue = arr[i];
                arr[i] = insertValue;
            } else if (i > insertIndex) {
                int temp = arr[i];
                arr[i] = previousValue;
                previousValue = temp;
            }
        }
        return arr;
    }
    public static int[] insertInplace(int[] arr, int insertIndex, int insertValue) {
        for (int i = arr.length - 1; i > insertIndex; i--) {
            arr[i] = arr[i - 1];
        }
        arr[insertIndex] = insertValue;
        return arr;
    }
    public static int[] insertInplace2(int arr[], int insertIndex, int insertValue) {
        for (int i = arr.length - 1; i >= insertIndex; i--) {
            if (i > insertIndex) {
                arr[i] = arr[i - 1];
            } else if (i == insertIndex) {
                arr[i] = insertValue;
            }
        }
        return arr;
    }


}
