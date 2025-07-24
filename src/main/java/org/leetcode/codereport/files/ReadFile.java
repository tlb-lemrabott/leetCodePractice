package org.leetcode.codereport.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void readFile(String filePath){
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        String filePath = "C:\\Users\\tlble\\OneDrive\\Documents\\FPP Retake code\\CODE2.txt";
        readFile(filePath);
    }
}
