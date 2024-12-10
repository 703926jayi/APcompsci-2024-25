public class TicTacToeAI {
    static int move = 0; 

    public static void main(String[] args) {
        char[][] ttt = new char[3][3];
        int wins = 0;
        int losses = 0;
        int ties = 0;
        int gameCount = 0;

        while (gameCount < 1000) { 
            gameCount++;
            System.out.println("##### Game " + gameCount + " #####");
            move = 0;
            initializeBoard(ttt);

            while (true) {
                playerMove(ttt);
                outputBoard(ttt);
                if (checkPlayerWin(ttt)) {
                    System.out.println("Player wins!");
                    wins++;
                    break;
                }
                if (checkCatsGame(ttt)) {
                    System.out.println("Cat's game. It's a tie.");
                    ties++;
                    break;
                }
                computerMove(ttt);
                outputBoard(ttt);
                if (checkComputerWin(ttt)) {
                    System.out.println("Computer wins!");
                    losses++;
                    break;
                }
            }
        }
        outputResults(wins, losses, ties);
    }

    public static boolean checkPlayerWin(char[][] board) {
        return checkWin(board, 'O');
    }

    public static boolean checkComputerWin(char[][] board) {
        return checkWin(board, 'O');
    }

    public static boolean checkWin(char[][] board, char player) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) || 
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) || 
            (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }
        return false;
    }

    public static void initializeBoard(char[][] board) {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                board[x][y] = ' ';
            }
        }
    }

    public static void playerMove(char[][] board) {
        int x = (int) (Math.random() * 3);
        int y = (int) (Math.random() * 3);
        while (board[x][y] != ' ') {
            x = (int) (Math.random() * 3);
            y = (int) (Math.random() * 3);
        }
        board[x][y] = 'X';
        System.out.println("Player moved.");
    }

    public static void computerMove(char[][] board) {
        if (tryToWinOrBlock(board, 'O')) {
            System.out.println("Computer made a winning move.");
            return; 
        }
        if (tryToWinOrBlock(board, 'X')) {
            System.out.println("Computer blocked player's win.");
            return; 
        }
        strategicMove(board); 
        System.out.println("Computer made a strategic move.");
    }

    public static boolean tryToWinOrBlock(char[][] board, char player) {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                if (board[x][y] == ' ') {
                    board[x][y] = player;
                    if (checkWin(board, player)) {
                        board[x][y] = 'O'; 
                        return true;
                    }
                    board[x][y] = ' '; 
                }
            }
        }
        return false;
    }

    public static void strategicMove(char[][] board) {
        if (board[1][1] == ' ') {
            board[1][1] = 'O';
            return;
        }
        int[][] corners = {{0, 0}, {0, 2}, {2, 0}, {2, 2}};
        for (int[] corner : corners) {
            if (board[corner[0]][corner[1]] == ' ') {
                board[corner[0]][corner[1]] = 'O';
                return;
            }
        }
        int[][] edges = {{0, 1}, {1, 0}, {1, 2}, {2, 1}};
        for (int[] edge : edges) {
            if (board[edge[0]][edge[1]] == ' ') {
                board[edge[0]][edge[1]] = 'O';
                return;
            }
        }
    }

    public static void outputBoard(char[][] board) {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                if (x != 1) System.out.print("  " + board[x][y] + "  ");
                else System.out.print("|  " + board[x][y] + "  |");
            }
            if (y != 2) System.out.println("\n-----------------");
        }
        System.out.println();
    }

    public static boolean checkCatsGame(char[][] board) {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                if (board[x][y] == ' ') return false; 
            }
        }
        return true;
    }

    public static void outputResults(int wins, int losses, int ties) {
        double winPercent = (double) wins / (wins + losses + ties) * 100;
        System.out.println();
        System.out.println("Results so far....");
        System.out.println("Games played = " + (wins + losses + ties));
        System.out.println("Player wins = " + wins);
        System.out.println("Computer wins = " + losses);
        System.out.println("Cat's Games (Ties) = " + ties);
        System.out.printf("Player win percentage = %.2f%%\n", winPercent);
    }
}
