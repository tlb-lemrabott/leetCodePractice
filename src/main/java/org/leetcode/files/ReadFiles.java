package org.leetcode.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiles {
    public void readFile(String fileUrl) throws FileNotFoundException {
        try(BufferedReader br = new BufferedReader(new FileReader(fileUrl))) {
            String line = br.readLine();
            while(line != null){
                System.out.println(br.readLine());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        ReadFiles rf = new ReadFiles();
        rf.readFile("C:\\Users\\tlble\\OneDrive\\Desktop\\leetCodePractice\\src\\main\\java\\org\\example\\files\\news.txt");
    }
}
