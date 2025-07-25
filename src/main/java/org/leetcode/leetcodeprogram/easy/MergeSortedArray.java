package org.leetcode.leetcodeprogram.easy;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int mergedIndex = m + n - 1;
        int index1 = m - 1;
        int index2 = n - 1;
        while (index1 >= 0 && index2 >= 0) {
            if (nums1[index1] > nums2[index2]) {
                nums1[mergedIndex] = nums1[index1];
                index1--;
            } else {
                nums1[mergedIndex] = nums2[index2];
                index2--;
            }
            mergedIndex--;
        }
        while (index2 >= 0) {
            nums1[mergedIndex] = nums2[index2];
            index2--;
            mergedIndex--;
        }
    }
    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);
        printArray(nums1);

        int[] nums3 = {0};
        int[] nums4 = {1};
        merge(nums3, 0, nums4, 1);
        printArray(nums3);
    }
}
