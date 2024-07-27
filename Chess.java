import java.util.*;
public class Chess {
    private int[][] board;
    private int size;

    public Chess(int n) {
        board = new int[n][n];
        size = n;
    }

    public void solveNQueens() {
        if (placeQueens(0)) {
            printBoard();
        } else {
            System.out.println("No solution found.");
        }
    }

    private boolean placeQueens(int col) {
        if (col >= size) {
            return true;
        }

        for (int row = 0; row < size; row++) {
            if (isSafe(row, col)) {
                board[row][col] = 1;

                if (placeQueens(col + 1)) {
                    return true;
                }

                board[row][col] = 0;
            }
        }

        return false;
    }

    private boolean isSafe(int row, int col) {
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i < size && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    private void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the chessboard: ");
        int size = scanner.nextInt();
        
        Chess chess = new Chess(size);
        chess.solveNQueens();
        
        scanner.close();
    }
}
