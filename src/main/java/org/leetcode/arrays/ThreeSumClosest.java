package org.leetcode.arrays;

import java.util.Arrays;

public class ThreeSumClosest {

//    public static int findThreeSumClosest(int[] nums, int target) {
//        int closestSum = nums[0] + nums[1] + nums[2];
//        for(int i=0; i<nums.length-2; i++){
//            for(int j=i+1; j<nums.length-1; j++){
//                for(int k=j+1; k<nums.length; k++){
//                    int sum = nums[i] + nums[j] + nums[k];
//                    if(sum == target){
//                        return sum;
//                    }
//                    else if(Math.abs(sum - target) < Math.abs(closestSum - target)){
//                        closestSum = sum;
//                    }
//                }
//            }
//        }
//        return closestSum;
//    }
//
    public static int findThreeSumClosestV2(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];
        for(int i=0; i<nums.length-2; i++){
            int left = i+1;
            int right = nums.length-1;
            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == target){
                    return sum;
                }
                if(Math.abs(sum - target) < Math.abs(closestSum - target)){
                    closestSum = sum;
                }
                if(sum < target){
                    left++;
                }else {
                    right--;
                }
            }
        }
        return closestSum;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{-84,92,26,19,-7,9,42,-51,8,30,-100,-13,-38};
        int arr2[] = {-1, 2, 1, -4};
        System.out.println(findThreeSumClosestV2(arr, 78));
    }
}
