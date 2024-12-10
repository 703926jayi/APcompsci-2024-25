public class EightQueens {
    public static void main(String[] args) {
        char[][] board = new char[8][8];
        initializeBoard(board); // Set to all hyphens (-)
        placeQueens(board);
        outputBoard(board);
    }
 
    public static void initializeBoard(char[][] board) {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                board[r][c] = '-';
            }
        }
    }

    public static void placeQueens(char[][] board) {
        boolean solutionFound = false;

        while (!solutionFound) {
            initializeBoard(board); 
            boolean[] picked = new boolean[8];























            
            for (int r = 0; r < 8; r++) {
                int ranCol = (int) (Math.random() * 8);
                while (picked[ranCol]) {
                    ranCol = (int) (Math.random() * 8);
                }
                picked[ranCol] = true;
                board[r][ranCol] = 'Q';
            }

            if (isSolution(board)) {
                solutionFound = true;
            }
        }
    }

    public static boolean isSolution(char[][] board) {
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                if (board[r][c] == 'Q') {
                    if (!isValid(board, r, c)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean isValid(char[][] board, int row, int col) {
        // Check the column for another queen
        for (int r = 0; r < 8; r++) {
            if (r != row && board[r][col] == 'Q') {
                return false;
            }
        }

        for (int i = 1; i < 8; i++) {
            if (row - i >= 0 && col - i >= 0 && board[row - i][col - i] == 'Q') {
                return false;
            }
            if (row - i >= 0 && col + i < 8 && board[row - i][col + i] == 'Q') {
                return false;
            }
            if (row + i < 8 && col - i >= 0 && board[row + i][col - i] == 'Q') {
                return false;
            }
            if (row + i < 8 && col + i < 8 && board[row + i][col + i] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void outputBoard(char[][] board) {
        System.out.println("  0 1 2 3 4 5 6 7");
        for (int r = 0; r < board.length; r++) {
            System.out.print(r + " ");
            for (int c = 0; c < board[0].length; c++) {
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }
    }
}
