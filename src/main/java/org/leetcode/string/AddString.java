package org.leetcode.string;

public class AddString {
    public static void main(String[] args) {
        String num1 = "9133";
        String num2 = "0";
        System.out.println(addStrings(num1, num2));
        String[] arr = {"You", "Are", "How"};
        System.out.println(buildStringFromArray(arr));
        System.out.println(leftPad("0", 4));
    }

    public static String addStrings2(String num1, String num2) {
        if(num1.length() > num2.length()){
            num2 = leftPad(num2, num1.length());
        }else if(num1.length() < num2.length()){
            num1 = leftPad(num1, num2.length());
        }
        String sum = "";
        Cured cured = new Cured();
        for(int i = num1.length()-1; i>=0; i--){
            int addDigit = cured.add(charToInt(num1.charAt(i)), charToInt(num2.charAt(i)));
            sum = addDigit + sum;
        }
        if(cured.getVal() != 0){
            sum = cured.getVal() + sum;
        }
        return sum;
    }
    public static String addStrings(String num1, String num2) {
        String shortStr = num1.length() < num2.length() ? num1 : num2;
        String longStr = shortStr == num1 ? num2 : num1;
        String sum = "";
        Cured cured = new Cured();

        for(int i = 0; i < shortStr.length(); i++){
            int addDigit = cured.add(charToInt(longStr.charAt(longStr.length() - 1 - i)),
                    charToInt(shortStr.charAt(shortStr.length() - 1 - i)));
            sum = intToChar(addDigit).concat(sum);
        }

        for(int i = shortStr.length(); i < longStr.length(); i++){
            int addDigit = cured.add(charToInt(longStr.charAt(longStr.length() - 1 - i)),
                    0);
            sum = intToChar(addDigit).concat(sum);
        }

        if(cured.getVal() != 0){
            sum = ZERO.concat(sum);
        }
        return sum;
    }
    public static String leftPad(String number, int len){
        int diff =  len - number.length();
        for (int i = 0; i <= diff; i++) {
            number = "0" + number;
            System.out.println(number);
        }
        return number;
    }
    public static String buildStringFromArray(String arr[]){
        String s = "";
        for(int i=0; i<arr.length; i++){
            s = arr[i] + " " + s;
        }
        return s;
    }
    public static int charToInt(char c){
        int number = 0;
        switch (c){
            case '0' : number = 0; break;
            case '1' : number = 1; break;
            case '2' : number = 2; break;
            case '3' : number = 3; break;
            case '4' : number = 4; break;
            case '5' : number = 5; break;
            case '6' : number = 6; break;
            case '7' : number = 7; break;
            case '8' : number = 8; break;
            case '9' : number = 9; break;
        }
        return number;
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

    public static String intToChar(int c){
        switch (c){
            case 0 : return ZERO;
            case 1 : return ONE;
            case 2 : return TWO;
            case 3 : return THREE;
            case 4 : return FOUR;
            case 5 : return FIVE;
            case 6 : return SIX;
            case 7 : return SEVEN;
            case 8 : return EIGHT;
            case 9 : return NINE;
        }
        return "";
    }
    static class Cured {
        private int val=0;
        public int add(int d1, int d2){
            System.out.println("d1:" + d1 + ", d2:" + d2 + ", val:"+ val);
            int total = val + d1 + d2;
            val = total / 10;
            return total % 10;
        }
        public int getVal() {
            return val;
        }
    }

    }
