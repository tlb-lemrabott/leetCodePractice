package org.leetcode.leetcodeprogram.hard;

public class WildcardMatching {
    public boolean isMatch(String input, String pattern) {
        int inputLength = input.length();
        int patternLength = pattern.length();
        boolean[][] matchTable = new boolean[inputLength + 1][patternLength + 1];
        matchTable[0][0] = true;
        for (int patternIndex = 1; patternIndex <= patternLength; patternIndex++) {
            if (pattern.charAt(patternIndex - 1) == '*') {
                matchTable[0][patternIndex] = matchTable[0][patternIndex - 1];
            }
        }
        for (int inputIndex = 1; inputIndex <= inputLength; inputIndex++) {
            for (int patternIndex = 1; patternIndex <= patternLength; patternIndex++) {
                char currentInputChar = input.charAt(inputIndex - 1);
                char currentPatternChar = pattern.charAt(patternIndex - 1);

                if (currentPatternChar == '?' || currentPatternChar == currentInputChar) {
                    matchTable[inputIndex][patternIndex] = matchTable[inputIndex - 1][patternIndex - 1];
                } else if (currentPatternChar == '*') {
                    matchTable[inputIndex][patternIndex] = matchTable[inputIndex][patternIndex - 1] || matchTable[inputIndex - 1][patternIndex];
                }
            }
        }
        return matchTable[inputLength][patternLength];
    }
}

