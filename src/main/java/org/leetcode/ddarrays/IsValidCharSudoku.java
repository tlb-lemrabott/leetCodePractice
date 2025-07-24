package org.leetcode.ddarrays;

import java.util.HashSet;
import java.util.Set;

public class IsValidCharSudoku {
    public static boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++){
            if(!isRowValid(board[i])){
                return false;
            }
        }
        for(int j=0; j<9; j++){
            char[] colArr = new char[9];
            for(int i=0; i<9; i++){
                colArr[i] = board[i][j];
            }
            if(!isRowValid(colArr)){
                return false;
            }
        }
        for(int bigRow=0; bigRow<3; bigRow++){
            for(int bigCol=0; bigCol<3; bigCol++){
                char[] squareRow = new char[9];
                int count = 0;
                for(int i=bigRow*3; i<(bigRow*3)+3; i++){
                    for(int j=bigCol*3; j<(bigCol*3)+3; j++){
                        squareRow[count++] = board[i][j];
                    }
                }
                if(!isRowValid(squareRow)) {
                    return false;
                }
            }
        }
        return true;
    }


    private static boolean isRowValid(char arr[]){
        Set<Character> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] != '.' && (!Util.singleDigitCharSet.contains(arr[i]) || !set.add(arr[i]))){
                return false;
            }
        }
        return true;
    }




    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(isValidSudoku(board));
    }
}