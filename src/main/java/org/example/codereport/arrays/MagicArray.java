package org.example.codereport.arrays;

public class MagicArray {

    public static int isMagicArray(int arr[]){
        if(arr.length == 1 && arr[0] == 0){
            return 0;
        }
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            if(isPrimeNumber(arr[i])){
                sum += arr[i];
            }
        }
        if(sum == arr[0]){
            return 1;
        }
        return 0;
    }

    public static boolean isPrimeNumber(int n){
        if(n==0) return false;
        for(int i=2; i<n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr1 [] = new int[]{21, 3, 7, 9, 11, 4, 6};
        System.out.println(isMagicArray(arr1));
    }
}
