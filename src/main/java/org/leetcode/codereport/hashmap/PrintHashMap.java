package org.leetcode.codereport.hashmap;

import java.util.HashMap;

public class PrintHashMap {
    public static void printHashMap(HashMap<String, String> hashMap){
        System.out.print(hashMap);
    }
    public static void printHashMapKeys(HashMap<String, String> hashtable){
        for(String keys: hashtable.keySet()) {
            System.out.print(keys + ", ");
        }
    }
    public static void printHashMapValues(HashMap<String, String> hashMap){
        for(String values: hashMap.values()) {
            System.out.print(values + ", ");
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        printHashMap(capitalCities);
        System.out.println();
        printHashMapKeys(capitalCities);
        System.out.println();
        printHashMapValues(capitalCities);
    }
}
