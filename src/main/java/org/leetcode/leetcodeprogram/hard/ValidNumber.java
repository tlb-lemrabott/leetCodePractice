package org.leetcode.leetcodeprogram.hard;

public class ValidNumber {
    public boolean isNumber(String input) {
        if (input == null || input.isEmpty()) return false;
        input = input.trim();
        boolean hasDigit = false;
        boolean hasDot = false;
        boolean hasExponent = false;
        for (int index = 0; index < input.length(); index++) {
            char currentChar = input.charAt(index);
            if (Character.isDigit(currentChar)) {
                hasDigit = true;
            } else if (currentChar == '+' || currentChar == '-') {
                if (index != 0 && input.charAt(index - 1) != 'e' && input.charAt(index - 1) != 'E') {
                    return false;
                }
            } else if (currentChar == '.') {
                if (hasDot || hasExponent) return false;
                hasDot = true;
            } else if (currentChar == 'e' || currentChar == 'E') {
                if (hasExponent || !hasDigit) return false;
                hasExponent = true;
                hasDigit = false;
            } else {
                return false;
            }
        }
        return hasDigit;
    }

}