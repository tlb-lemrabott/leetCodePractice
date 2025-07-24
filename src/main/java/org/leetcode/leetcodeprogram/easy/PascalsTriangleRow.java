package org.leetcode.leetcodeprogram.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleRow {

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> currentRow = new ArrayList<>();
        currentRow.add(1);
        for (int row = 1; row <= rowIndex; row++) {
            for (int i = currentRow.size() - 1; i >= 1; i--) {
                int updatedValue = currentRow.get(i) + currentRow.get(i - 1);
                currentRow.set(i, updatedValue);
            }
            currentRow.add(1);
        }
        return currentRow;
    }

    public static void main(String[] args) {
        int rowIndex = 3;
        List<Integer> result = getRow(rowIndex);
        System.out.println(result);
    }
}
