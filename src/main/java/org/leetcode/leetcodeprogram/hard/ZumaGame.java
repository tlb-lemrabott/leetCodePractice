package org.leetcode.leetcodeprogram.hard;

import java.util.*;

public class ZumaGame {
    public int findMinStep(String board, String hand) {
        Map<Character, Integer> handCount = new HashMap<>();
        for (char ball : hand.toCharArray()) {
            handCount.put(ball, handCount.getOrDefault(ball, 0) + 1);
        }
        int result = dfs(board, handCount);
        return result == Integer.MAX_VALUE ? -1 : result;
    }

    private int dfs(String currentBoard, Map<Character, Integer> handCount) {
        currentBoard = reduceBoard(currentBoard);
        if (currentBoard.isEmpty()) return 0;

        int minSteps = Integer.MAX_VALUE;

        for (int i = 0; i < currentBoard.length(); i++) {
            char currentChar = currentBoard.charAt(i);
            int j = i;
            while (j < currentBoard.length() && currentBoard.charAt(j) == currentChar) {
                j++;
            }
            int consecutiveCount = j - i;
            int ballsNeeded = 3 - consecutiveCount;

            if (handCount.getOrDefault(currentChar, 0) >= ballsNeeded) {
                handCount.put(currentChar, handCount.get(currentChar) - ballsNeeded);
                String nextBoard = currentBoard.substring(0, i) + currentBoard.substring(j);
                int nextSteps = dfs(nextBoard, handCount);
                if (nextSteps != Integer.MAX_VALUE) {
                    minSteps = Math.min(minSteps, nextSteps + ballsNeeded);
                }
                handCount.put(currentChar, handCount.get(currentChar) + ballsNeeded);
            }
        }

        return minSteps;
    }

    private String reduceBoard(String board) {
        int i = 0;
        while (i < board.length()) {
            int j = i;
            while (j < board.length() && board.charAt(j) == board.charAt(i)) {
                j++;
            }
            if (j - i >= 3) {
                board = board.substring(0, i) + board.substring(j);
                i = 0;
            } else {
                i++;
            }
        }
        return board;
    }
}
