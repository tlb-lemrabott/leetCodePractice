package org.leetcode.arrays;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        return -1;
    }

    public static int findRightPositionToInsert(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }
            if(nums[i] < target && target < nums[i+1]){
                return i+1;
            }
        }
        return -1;
    }

    public static int findRightPositionToInsertUsingBinarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(target <= nums[mid]){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int nums[] = {1,3,5,6,9};
        System.out.println(findRightPositionToInsertUsingBinarySearch(nums, 7));
    }
}
