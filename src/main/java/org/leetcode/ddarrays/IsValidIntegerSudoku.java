package org.leetcode.ddarrays;

import java.util.HashSet;
import java.util.Set;

public class IsValidIntegerSudoku {
    public static boolean isValidSudoku(int[][] board) {
        for(int row=0; row<9; row++){
            if(!isRowValid(board[row])){
                return false;
            }
        }
        for(int col=0; col<9; col++){
            int colArr[] = new int[9];
            for(int row=0; row<9; row++){
                colArr[row] = board[row][col];
            }
            if(!isRowValid(colArr)){
                return false;
            }
        }
        for(int i = 0; i<3; i++){
            for(int j=0; j<3; j++){
                int[] squareArr = new int[9];
                int count = 0;
                for(int row=i*3; row < (i*3)+3; row++){
                    for(int col=j*3; col < (j*3)+3; col++){
                        squareArr[count++] = board[row][col];
                    }
                }
                if(!isRowValid(squareArr)){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isRowValid(int arr[]){
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0 && (!isSingleDigit(arr[i]) || !set.add(arr[i]))){
                return false;
            }
        }
        return true;
    }
    private static boolean isSingleDigit(int n){
        return n >= 1 && n <= 9;
    }

    public static void main(String[] args) {
        int[][] boardInt = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        System.out.println(isValidSudoku(boardInt));
    }
}
