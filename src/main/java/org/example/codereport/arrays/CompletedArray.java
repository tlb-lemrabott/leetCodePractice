package org.example.codereport.arrays;

public class CompletedArray {

    public static int isComplete(int arr[]){



        return 0;
    }
    public static int findMinFromEvens(int arr[]){
        int min = arr[0];
        for (int i=0; i<arr.length; i++){
            if(arr[i] %2 == 0){
                if(arr[i] < min){
                    min = arr[i];
                }
            }
        }
        return min;
    }
    public static int findMaxFromEvens(int arr[]){
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                if(arr[i] > max){
                    max = arr[i];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr1 [] = new int[]{21, 3, 2, 7, 9, 11, 4, 6};
        System.out.println(findMaxFromEvens(arr1));
    }
}
