package org.leetcode.arrays;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max_area = 0;
        while (left < right){
            int width = right - left;

            int current_area = Integer.min(height[left], height[right]) * width;

            max_area = Integer.max(max_area, current_area);

            if(height[left] < height[right]){
                left += 1;
            }else {
                right -= 1;
            }
        }
        return max_area;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(arr));
    }
}
