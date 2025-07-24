package org.leetcode.codereport.hashtable;

import java.util.Hashtable;

public class PrintHashTable {
    public static void printHashTable(Hashtable<Integer, String> hashtable){
        System.out.print(hashtable);
    }
    public static void printHashTableKeys(Hashtable<Integer, String> hashtable){
        for(Integer keys: hashtable.keySet()) {
            System.out.print(keys + " ");
        }
    }
    public static void printHashTableValues(Hashtable<Integer, String> hashtable){
        for(String str: hashtable.values()){
            System.out.print(str + " ");
        }
    }

    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "A");
        hashtable.put(2, "B");
        hashtable.put(3, "C");
        hashtable.put(4, "D");
        //printHashTableKeys(hashtable);
        //System.out.println();
        //printHashTableValues(hashtable);
        //printHashTable(hashtable);
    }

}
