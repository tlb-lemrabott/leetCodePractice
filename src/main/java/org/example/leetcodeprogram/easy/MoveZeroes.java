package org.example.leetcodeprogram.easy;

import java.util.Arrays;

public class MoveZeroes {
    private static int[] doMoveZeroesNSquare(int []nums){
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length-1; j++){
                if(nums[j] == 0 && nums[j+1] != 0){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }

    private static int[] doMoveZeroesN(int []nums){
        for(int i=0; i<nums.length-1; i++){
            int nextNonZeroIndex = i + 1;
            while(nextNonZeroIndex < nums.length && nums[nextNonZeroIndex] == 0 ){
                nextNonZeroIndex++;
            }
            if(nextNonZeroIndex < nums.length && nums[i] == 0 && nums[nextNonZeroIndex]!=0){
                int temp = nums[i];
                nums[i] = nums[nextNonZeroIndex];
                nums[nextNonZeroIndex] = temp;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int nums[] = {0,1,0,0,3,0,4,5};
        int nums2[] = {0,1};
        //System.out.println(Arrays.toString(doMoveZeroesNSquare(nums)));
        System.out.println("input array is:" + Arrays.toString(nums));
        System.out.println(Arrays.toString(doMoveZeroesN(nums)));
        //output [1,3,12,0,0]

    }
}
