package org.leetcode.leetcodeprogram.easy;

public class ClimbingStairs {
    public static int climbStairs(int totalSteps) {
        if (totalSteps == 1) return 1;
        if (totalSteps == 2) return 2;
        int oneStepBefore = 2;
        int twoStepsBefore = 1;
        int currentWays = 0;
        for (int step = 3; step <= totalSteps; step++) {
            currentWays = oneStepBefore + twoStepsBefore;
            twoStepsBefore = oneStepBefore;
            oneStepBefore = currentWays;
        }

        return currentWays;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
        System.out.println(climbStairs(5));
    }
}
