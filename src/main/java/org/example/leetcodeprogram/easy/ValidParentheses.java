package org.example.leetcodeprogram.easy;

import java.util.*;

public class ValidParentheses {

    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '('){
                stack.push(s.charAt(i));
            }else if(s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')'){
                if(stack.isEmpty() || !isMatched(stack.pop(), s.charAt(i))){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    private static boolean isMatched(char open, char close){
        return(open == '{' && close == '}') ||
                (open == '[' && close == ']') ||
                (open == '(' && close == ')');
    }


    public static boolean isValid2(String s){
        Stack<Character> stack = new Stack<>();
        Set<Character> openingBraces = new HashSet<>(Arrays.asList('(', '[', '{'));
        Map<Character, Character> map = Map.of('{', '}', '(', ')', '[', ']');
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(openingBraces.contains(c)){
                stack.push(c);
            }else {
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if(map.get(top) != c){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    //([])
































//    static final Set<Character> openingBraces = new HashSet<>(Arrays.asList('{', '(', '['));
//    static final Set<Character> closingBraces = new HashSet<>(Arrays.asList('}', ')', ']'));
//    static final Map<Character, Character> matcher = Map.of('(', ')', '{', '}', '[', ']');
//    public static boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//        for(int i=0; i<s.length(); i++){
//            if(matcher.containsKey(s.charAt(i))){
//                stack.push(s.charAt(i));
//            }else if(closingBraces.contains(s.charAt(i))){
//                if(stack.isEmpty() || matcher.get(stack.pop()) != s.charAt(i)){
//                    return false;
//                }
//            }
//        }
//        return stack.isEmpty();
//    }


    public static void main(String[] args) {
        String str = "{([(])}";
        String str2 = "[()]{}";
        System.out.println(isValid2(str2));
    }
}