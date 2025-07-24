package org.leetcode.codereport.files;

import java.io.*;

public class WriteFile {
    public static void writeFile(String content, String filePath){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))){
            //BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true));
            bw.write(content);
            bw.newLine();
            bw.write("Appending another line of text.");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String filePath = "C:\\Users\\tlble\\OneDrive\\Documents\\FPP Retake code\\test.txt";
        String content = "This is the content to write into the file.\nHere is another line of text.";
        writeFile(content, filePath);
    }
}
