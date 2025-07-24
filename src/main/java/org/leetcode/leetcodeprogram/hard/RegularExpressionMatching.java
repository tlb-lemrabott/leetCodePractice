package org.leetcode.leetcodeprogram.hard;

public class RegularExpressionMatching {
    public static boolean isMatch(String s, String p) {
        int inputLength = s.length();
        int patternLength = p.length();
        boolean[][] matchTable = new boolean[inputLength + 1][patternLength + 1];
        matchTable[0][0] = true;
        for (int patternIndex = 2; patternIndex <= patternLength; patternIndex++) {
            if (p.charAt(patternIndex - 1) == '*') {
                matchTable[0][patternIndex] = matchTable[0][patternIndex - 2];
            }
        }
        for (int inputIndex = 1; inputIndex <= inputLength; inputIndex++) {
            for (int patternIndex = 1; patternIndex <= patternLength; patternIndex++) {
                char currentInputChar = s.charAt(inputIndex - 1);
                char currentPatternChar = p.charAt(patternIndex - 1);

                if (currentPatternChar == '.' || currentPatternChar == currentInputChar) {
                    matchTable[inputIndex][patternIndex] = matchTable[inputIndex - 1][patternIndex - 1];
                } else if (currentPatternChar == '*') {
                    char precedingPatternChar = p.charAt(patternIndex - 2);

                    matchTable[inputIndex][patternIndex] = matchTable[inputIndex][patternIndex - 2];
                    if (precedingPatternChar == '.' || precedingPatternChar == currentInputChar) {
                        matchTable[inputIndex][patternIndex] = matchTable[inputIndex][patternIndex] || matchTable[inputIndex - 1][patternIndex];
                    }
                }
            }
        }
        return matchTable[inputLength][patternLength];
    }

    public static void main(String[] args) {
        System.out.println(isMatch("aa", "a"));
        System.out.println(isMatch("aa", "a*"));
        System.out.println(isMatch("ab", ".*"));
    }

}
