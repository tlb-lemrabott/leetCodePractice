package org.example.arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, arr, 0, nums1.length);
        System.arraycopy(nums2, 0, arr, nums1.length, nums2.length);
        Arrays.sort(arr);
        if(arr.length%2 == 0){
            return (double)(arr[arr.length/2] + arr[(arr.length/2)-1])/2;
        }
        return arr[arr.length/2];
    }

    public static void main(String[] args) {
        int nums1[] = new int[]{1, 2};
        int nums2[] = new int[]{3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
