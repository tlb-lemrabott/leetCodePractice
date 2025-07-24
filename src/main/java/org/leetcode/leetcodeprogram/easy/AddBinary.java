package org.leetcode.leetcodeprogram.easy;

public class AddBinary {
    public static String addBinary(String binaryA, String binaryB) {
        StringBuilder resultBuilder = new StringBuilder();
        int indexA = binaryA.length() - 1;
        int indexB = binaryB.length() - 1;
        int carry = 0;
        while (indexA >= 0 || indexB >= 0 || carry != 0) {
            int digitA = (indexA >= 0) ? binaryA.charAt(indexA) - '0' : 0;
            int digitB = (indexB >= 0) ? binaryB.charAt(indexB) - '0' : 0;
            int sum = digitA + digitB + carry;
            resultBuilder.append(sum % 2);
            carry = sum / 2;
            indexA--;
            indexB--;
        }
        return resultBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
        System.out.println(addBinary("1010", "1011"));
        System.out.println(addBinary("0", "0"));
    }
}
