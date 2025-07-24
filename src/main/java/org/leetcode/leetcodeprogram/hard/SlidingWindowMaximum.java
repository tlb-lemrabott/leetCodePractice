package org.leetcode.leetcodeprogram.hard;

import java.util.*;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int windowSize) {
        if (nums == null || nums.length == 0 || windowSize <= 0) return new int[0];
        int[] maxInWindows = new int[nums.length - windowSize + 1];
        Deque<Integer> indexDeque = new LinkedList<>();
        for (int currentIndex = 0; currentIndex < nums.length; currentIndex++) {
            while (!indexDeque.isEmpty() && indexDeque.peekFirst() < currentIndex - windowSize + 1) {
                indexDeque.pollFirst();
            }
            while (!indexDeque.isEmpty() && nums[indexDeque.peekLast()] < nums[currentIndex]) {
                indexDeque.pollLast();
            }
            indexDeque.offerLast(currentIndex);
            if (currentIndex >= windowSize - 1) {
                maxInWindows[currentIndex - windowSize + 1] = nums[indexDeque.peekFirst()];
            }
        }
        return maxInWindows;
    }
}

