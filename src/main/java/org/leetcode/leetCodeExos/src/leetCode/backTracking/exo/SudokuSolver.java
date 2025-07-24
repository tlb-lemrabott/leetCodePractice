package leetCode.backTracking.exo;

import java.util.*;

public class SudokuSolver {
    public void solveSudoku(char[][] board) {
        if (board == null || board.length == 0)
            return;
        solve(board);
    }

    private boolean solve(char[][] board) {
        int N = 9;

        // Find the first empty cell (cell with '.')
        int[] emptyCell = findEmptyCell(board);
        if (emptyCell == null) {
            // No empty cells left, the puzzle is solved.
            return true;
        }

        int row = emptyCell[0];
        int col = emptyCell[1];

        // Try placing digits 1 to 9 at this cell
        for (char num = '1'; num <= '9'; num++) {
            if (isValidMove(board, row, col, num)) {
                board[row][col] = num;

                // Recur to the next empty cell
                if (solve(board)) {
                    return true; // Found a valid solution
                }

                // If the current placement doesn't lead to a solution, backtrack
                board[row][col] = '.'; // Undo the current placement
            }
        }

        return false; // No valid solution found for this configuration
    }

    private boolean isValidMove(char[][] board, int row, int col, char num) {
        for (int i = 0; i < 9; i++) {
            // Check the row and column for the same number
            if (board[row][i] == num || board[i][col] == num)
                return false;

            // Check the 3x3 sub-box for the same number
            int boxRowStart = (row / 3) * 3;
            int boxColStart = (col / 3) * 3;
            if (board[boxRowStart + i / 3][boxColStart + i % 3] == num)
                return false;
        }
        return true;
    }

    private int[] findEmptyCell(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') {
                    return new int[]{row, col};
                }
            }
        }
        return null; // No empty cell found
    }

    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        SudokuSolver solver = new SudokuSolver();
        solver.solveSudoku(board);

        // Print the solved Sudoku board
        for (char[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }
}
