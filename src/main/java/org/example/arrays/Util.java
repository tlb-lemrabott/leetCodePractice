package org.example.arrays;

public class Util {
    public static int findMax(int arr[]){
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int arr[] = new int[]{5, 4, 6, 1, 3, 7, 0, 10};
        System.out.println(findMax(arr));
    }
}
