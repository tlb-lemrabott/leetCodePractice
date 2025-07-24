package org.leetcode.string;

public class AddStringSubmitted {
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "19";
        long startTime = System.currentTimeMillis();
        System.out.println(addStrings(num1, num2));
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Execution time in milliseconds: " + executionTime);
    }

    public static String addStrings(String num1, String num2) {
        String shortStr = num1.length() < num2.length() ? num1 : num2;
        String longStr = shortStr == num1 ? num2 : num1;
        StringBuilder sum = new StringBuilder("");
        Cured cured = new Cured();
        for(int i = 0; i < shortStr.length(); i++){
            int addDigit = cured.add(charToInt(longStr.charAt(longStr.length() - 1 - i)),
                    charToInt(shortStr.charAt(shortStr.length() - 1 - i)));
            sum.append(intToChar(addDigit));
        }
        for(int i = shortStr.length(); i < longStr.length(); i++){
            int addDigit = cured.add(charToInt(longStr.charAt(longStr.length() - 1 - i)),
                    0);
            sum.append(intToChar(addDigit));
        }
        if(cured.getVal() != 0){
            sum.append("1");
        }
        return sum.reverse().toString();
    }
    public static int charToInt(char c){
        return c - '0';
    }
    public static String intToChar(int c){
        return switch (c) {
            case 0 -> "0";
            case 1 -> "1";
            case 2 -> "2";
            case 3 -> "3";
            case 4 -> "4";
            case 5 -> "5";
            case 6 -> "6";
            case 7 -> "7";
            case 8 -> "8";
            case 9 -> "9";
            default -> "";
        };
    }
    static class Cured {
        private int val=0;
        public int add(int d1, int d2){
            int total = val + d1 + d2;
            val = total / 10;
            return total % 10;
        }
        public int getVal() {
            return val;
        }
    }



    static final String ZERO = "0";
    static final String ONE = "1";
    static final String TWO = "2";
    static final String THREE = "3";
    static final String FOUR = "4";
    static final String FIVE = "5";
    static final String SIX = "6";
    static final String SEVEN = "7";
    static final String EIGHT = "8";
    static final String NINE = "9";
}
