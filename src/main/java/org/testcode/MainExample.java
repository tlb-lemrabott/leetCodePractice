package org.testcode;

import java.util.*;

public class MainExample {

    public static boolean isAnagram(String s1, String s2){
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s1.length()-1; i++){
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }
        for(int i=0; i<s2.length()-1; i++){
            if(!map.containsKey(s2.charAt(i))) return false;
            map.put(s2.charAt(i), map.get(s2.charAt(i)) -1);
            if(map.get(s2.charAt(i)) == 0) map.remove(s2.charAt(i));
        }
        return map.isEmpty();
    }

    public static void BubbleSort(int []arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length- i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        String s1 = "lemtrabto";
        String s2 = "lrtabemot";
        System.out.println(isAnagram(s1, s2));
    }
}
