package org.leetcode.leetcodeprogram.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        for (int rowIndex = 0; rowIndex < numRows; rowIndex++) {
            List<Integer> currentRow = new ArrayList<>();
            for (int position = 0; position <= rowIndex; position++) {
                if (position == 0 || position == rowIndex) {
                    currentRow.add(1);
                } else {
                    int leftParent = pascalTriangle.get(rowIndex - 1).get(position - 1);
                    int rightParent = pascalTriangle.get(rowIndex - 1).get(position);
                    currentRow.add(leftParent + rightParent);
                }
            }
            pascalTriangle.add(currentRow);
        }
        return pascalTriangle;
    }
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> result = generate(numRows);
        System.out.println(result);
    }
}
