package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = vWIn(board) || horizontalWIn(board);
        return rsl;
    }

    public static boolean vWIn(int[][] board) {
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

    public static boolean horizontalWIn(int[][] board) {
        boolean h = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1) {
                for (int j = 0; j < board.length; j++) {
                    if (board[i][j] != 1) {
                        return false;
                    }
                }
            }
        }
        return h;
    }
    public static void main(String[] args) {
        int[][] board = {
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
        };
    }
}
