package org.leetcode.leetcodeprogram.easy;

public class FindFirstOccurrence {
    public static int findFirstOccurrence(String haystack, String needle) {
        int haystackLength = haystack.length();
        int needleLength = needle.length();
        for (int i = 0; i <= haystackLength - needleLength; i++) {
            String currentSubstring = haystack.substring(i, i + needleLength);
            if (currentSubstring.equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findFirstOccurrence("sadbutsad", "sad"));
        System.out.println(findFirstOccurrence("leetcode", "leeto"));
    }
}
