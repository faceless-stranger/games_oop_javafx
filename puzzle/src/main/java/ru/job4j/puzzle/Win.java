package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = monoVertical(board) || monoHorizontal(board);
        return rsl;
    }

    public static boolean monoVertical(int[][] board) {
        boolean vertical = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1) {
                for (int j = 0; j < board.length; j++) {
                   if (board[j][i] != 1) {
                   return false;
                   }
                }
            }
        }
        return vertical;
    }

    public static boolean monoHorizontal(int[][] board) {
        boolean horizontal = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1) {
                for (int j = 0; j < board.length; j++) {
                    if (board[i][j] != 1) {
                        return false;
                    }
                }
            }
        }
        return horizontal;
    }
}
