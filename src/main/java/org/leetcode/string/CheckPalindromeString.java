package org.leetcode.string;

public class CheckPalindromeString {
    public static boolean checkPalindromeString(String s) {
        int first = 0, last = s.length() - 1;
        while (first < last) {
            if (Character.toLowerCase(s.charAt(first)) != Character.toLowerCase(s.charAt(last))) {
                return false;
            }
            first++;
            last--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "Lemrabott";
        System.out.println(checkPalindromeString(str));
    }
}
