package org.leetcode.leetcodeprogram.hard;

public class DungeonGame {
    public int calculateMinimumHP(int[][] dungeonGrid) {
        int rows = dungeonGrid.length;
        int cols = dungeonGrid[0].length;
        int[][] minHealthRequired = new int[rows + 1][cols + 1];
        for (int row = 0; row <= rows; row++) {
            for (int col = 0; col <= cols; col++) {
                minHealthRequired[row][col] = Integer.MAX_VALUE;
            }
        }
        minHealthRequired[rows][cols - 1] = 1;
        minHealthRequired[rows - 1][cols] = 1;

        for (int row = rows - 1; row >= 0; row--) {
            for (int col = cols - 1; col >= 0; col--) {
                int requiredHealth = Math.min(minHealthRequired[row + 1][col], minHealthRequired[row][col + 1]) - dungeonGrid[row][col];
                minHealthRequired[row][col] = Math.max(1, requiredHealth);
            }
        }
        return minHealthRequired[0][0];
    }
}

