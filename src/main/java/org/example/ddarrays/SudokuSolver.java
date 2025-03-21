package org.example.ddarrays;

import java.util.Arrays;

public class SudokuSolver {
    public static void solveSudoku(char[][] board) {
        solve(board, 0, 0);
        for (char[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }
    private static boolean solve(char[][] board, int r, int c) {
        if(r == 9) {
            return true;
        }
        int nextRow = (c<8)? r : r+1;
        int nextCol = (c<8)? c+1 : 0;
        if(board[r][c] != '.'){
            return solve(board, nextRow, nextCol);
        }
        for(char possible: getPossibles(board, r, c)){
            if(possible != 'x'){
                board[r][c] = possible;
                if(solve(board, nextRow, nextCol)){
                    return true;
                }
            }
        }
        board[r][c] = '.';
        return false;
    }

    private static char[] getPossibles(char[][] board, int r, int c) {
        char[] possible = "123456789".toCharArray();
        for(int i=0; i<possible.length; i++){
            disable(possible, board, r, i);
            disable(possible, board, i, c);
        }
        int row3 = 3*(r/3);
        int col3 = 3*(c/3);

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                disable(possible, board, row3+i, col3+j);
            }
        }
        return possible;
    }
    private static void disable(char[] possible, char[][] board, int r, int c){
        if(board[r][c] >= '1' && board[r][c] <= '9'){
            possible[board[r][c] - '1'] = 'x';
        }
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
        solveSudoku(board);
    }
}

/*
Output should be:
{
{'6', '7', '2', '1', '9', '5', '3', '4', '8'},
{'5', '3', '4', '6', '7', '8', '9', '1', '2'},
{'1', '9', '8', '3', '4', '2', '5', '6', '7'},
{'8', '5', '9', '7', '6', '1', '4', '2', '3'},
{'4', '2', '6', '8', '5', '3', '7', '9', '1'},
{'7', '1', '3', '9', '2', '4', '8', '5', '6'},
{'9', '6', '1', '5', '3', '7', '2', '8', '4'},
{'2', '8', '7', '4', '1', '9', '6', '3', '5'},
{'3', '4', '5', '2', '8', '6', '1', '7', '9'}
};
 */
