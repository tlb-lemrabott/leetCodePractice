package org.example.ddarrays;

import java.util.HashSet;
import java.util.Set;

public class IsValidCharSudokuOptimized {
    public static boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] squares = new HashSet[9];
        for(int i=0; i<9; i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            squares[i] = new HashSet<>();
        }
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char val = board[i][j];
                if(val == '.') continue;
                if(!rows[i].add(val)) return false;
                if(!cols[j].add(val)) return false;
                int squareIndex = (i/3) * 3 + (j/3);
                if(!squares[squareIndex].add(val)) return false;
            }
        }

        //[[012] [3]]
        // [0]
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
