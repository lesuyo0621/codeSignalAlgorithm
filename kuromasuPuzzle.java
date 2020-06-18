import java.util.Arrays;

public class kuromasuPuzzle {

    int[][] kuromasuPuzzle(char[][] board) {
        int[][] answer = new int[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '#') {
                    left(board, answer, i, j, i, j);
                    right(board, answer, i, j, i, j);
                    up(board, answer, i, j, i, j);
                    down(board, answer, i, j, i, j);
                    answer[i][j] -= 3;
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (answer[i][j] == 0) {
                    answer[i][j] = -1;
                }
            }
        }

        return answer;
    }

    void left(char[][] board, int[][] answer, int index1, int index2, int target1, int target2) {
        if (index2 < 0) {
            return;
        } else if (board[index1][index2] == '*') {
            return;
        }

        answer[target1][target2]++;
        left(board, answer, index1, index2 - 1, target1, target2);
    }

    void right(char[][] board, int[][] answer, int index1, int index2, int target1, int target2) {
        if (index2 == board[0].length) {
            return;
        } else if (board[index1][index2] == '*') {
            return;
        }

        answer[target1][target2]++;
        right(board, answer, index1, index2 + 1, target1, target2);
    }

    void up(char[][] board, int[][] answer, int index1, int index2, int target1, int target2) {
        if (index1 < 0) {
            return;
        } else if (board[index1][index2] == '*') {
            return;
        }

        answer[target1][target2]++;
        up(board, answer, index1 - 1, index2, target1, target2);
    }

    void down(char[][] board, int[][] answer, int index1, int index2, int target1, int target2) {
        if (index1 == board.length) {
            return;
        } else if (board[index1][index2] == '*') {
            return;
        }

        answer[target1][target2]++;
        down(board, answer, index1 + 1, index2, target1, target2);
    }

    public static void main(String[] args) {
        kuromasuPuzzle kp = new kuromasuPuzzle();
        char[][] board = { { '*', '.', '#', '.', '.', '*', '.', '.', '#', '.', '.' },
                { '.', '*', '.', '.', '*', '.', '*', '.', '#', '.', '.' },
                { '.', '.', '.', '.', '#', '.', '.', '.', '.', '.', '#' },
                { '#', '.', '.', '.', '.', '.', '.', '*', '.', '*', '.' },
                { '*', '#', '.', '.', '*', '.', '.', '.', '*', '.', '.' },
                { '.', '.', '#', '.', '#', '.', '#', '*', '#', '.', '.' },
                { '.', '.', '*', '.', '.', '.', '.', '.', '*', '#', '*' },
                { '.', '.', '.', '.', '*', '.', '*', '.', '.', '*', '#' },
                { '#', '.', '*', '.', '.', '*', '#', '.', '*', '.', '.' },
                { '.', '.', '#', '.', '.', '.', '*', '.', '.', '.', '.' },
                { '.', '*', '#', '*', '.', '*', '.', '.', '#', '.', '*' } };

        int[][] answer = kp.kuromasuPuzzle(board);
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[0].length; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }
    }
}