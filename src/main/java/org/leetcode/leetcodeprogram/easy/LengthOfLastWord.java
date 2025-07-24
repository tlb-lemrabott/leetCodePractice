package org.leetcode.leetcodeprogram.easy;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String inputString) {
        inputString = inputString.trim();
        int lastSpaceIndex = inputString.lastIndexOf(' ');
        return inputString.length() - lastSpaceIndex - 1;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }
}
