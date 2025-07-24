package org.leetcode.hashMap;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // Retrieve value by key
        String value = map.get(2); // Returns "Two"
        System.out.println("Value for key 2: " + value);
    }
}
