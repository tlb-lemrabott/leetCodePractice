package org.leetcode.string;

public class ReverseString {

    public String reverseBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        String reversedString = sb.reverse().toString();
        return reversedString;
    }
}
