package org.example.arrays;

import java.util.Arrays;
import java.util.Objects;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static int[] searchRange(int[] nums, int target) {
        int result[] = {-1, -1};
        int left = 0;
        int right = nums.length -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                if(result[0] == -1){
                    result[0] = mid;
                }else {
                    result[1] = mid;
                }
            }
            if(target <= nums[mid]){
                if(nums[right] == target) {
                    if(result[0] == -1){
                        result[0] = right;
                    }else {
                        result[1] = right;
                    }
                }
                right = mid -1;
            }else {
                if(nums[left] == target){
                    if(result[0] == -1){
                        result[0] = left;
                    }else {
                        result[1] = left;
                    }
                }
                left = mid + 1;
            }
        }
        return result;
    }

    public static int[] searchRangeByTwoBinary(int[] nums, int target){
        int result[] = {-1, -1};
        result[0] = findFirstPosition(nums, target);
        if(result[0] != -1){
            result[1] = findLastPosition(nums, target);
        }
        return result;
    }

    private static int findFirstPosition(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int firstPos = -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                firstPos = mid;
                right = mid -1;
            }
            if(target <= nums[mid]){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return firstPos;
    }

    private static int findLastPosition(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int lastPos = -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                lastPos = mid;
                left = mid + 1;
            }
            if(target >= nums[mid]){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return lastPos;
    }

    public static void main(String[] args) {
        int nums[] = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRangeByTwoBinary(nums, 8)));
    }
}
