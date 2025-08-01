package org.leetcode.arrays;

public class SearchInRotatedSortedArray {

    public static int search(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }

    private static int logNSearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[left] <= nums[mid]){
                if(nums[left] <= target && target < nums[mid]){
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }else {
                if(nums[mid] <= target && target < nums[right]){
                    left = mid + 1;
                }else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(logNSearch(nums, 0));
    }
}
