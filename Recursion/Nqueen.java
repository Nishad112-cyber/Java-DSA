public class Nqueen {

    static int N = 4;

    public static boolean isSafe(int board[][], int row, int col) {

        // check column
        for(int i = 0; i < row; i++) {
            if(board[i][col] == 1) {
                return false;
            }
        }

        // check left diagonal
        for(int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--) {
            if(board[i][j] == 1) {
                return false;
            }
        }

        // check right diagonal
        for(int i = row-1, j = col+1; i >= 0 && j < N; i--, j++) {
            if(board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    public static void solveNQueens(int board[][], int row) {

        if(row == N) {
            printBoard(board);
            return;
        }

        for(int col = 0; col < N; col++) {

            if(isSafe(board, row, col)) {

                board[row][col] = 1; // place queen

                solveNQueens(board, row + 1);

                board[row][col] = 0; // backtrack
            }
        }
    }

    public static void printBoard(int board[][]) {
        System.out.println("Solution:");
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int board[][] = new int[N][N];

        solveNQueens(board, 0);
    }
}