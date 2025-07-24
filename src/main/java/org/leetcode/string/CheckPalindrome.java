package org.leetcode.string;

public class CheckPalindrome {

    public static void main(String[] args) {
        String str = "madam";
        System.out.println(checkPalindrome(str));
    }

    public static String checkPalindrome(String str){
        StringBuilder strBuilder = new StringBuilder(str);
        if(strBuilder.reverse() == strBuilder){
            return "YES";
        }else {
            return "NO";
        }
    }


}
