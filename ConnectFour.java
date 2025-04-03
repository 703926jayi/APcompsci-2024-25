import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ConnectFour {
    public static ArrayList<C4Result> results = new ArrayList<>();
    private static final int ROWS = 6;
    private static final int COLS = 7;
    private static final char EMPTY = '-';
    private static final char RED = 'R';
    private static final char YELLOW = 'Y';
    private static char[][] board = new char[ROWS][COLS];
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean donePlaying = false;

        while (!donePlaying) {
            System.out.println("Game # " + results.size());
            playGame();
            donePlaying = !playAgain();
        }
        review();
        outputStats();
    }

    public static void playGame() {
        int numChips = 0;
        char player = RED;
        resetBoard();

        while (true) {
            int col = random.nextInt(COLS);
            if (dropChip(player, col)) {
                numChips++;
                printBoard();
                if (checkWin(player)) {
                    String winDirection = getWinDirection(player);
                    results.add(new C4Result(player == RED ? "Red" : "Yellow", winDirection, numChips));
                    return;
                }
                if (isBoardFull()) {
                    results.add(new C4Result("Tie", "none", numChips));
                    return;
                }
                player = (player == RED) ? YELLOW : RED;
            }
        }
    }

    private static void resetBoard() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    private static boolean dropChip(char player, int col) {
        for (int row = ROWS - 1; row >= 0; row--) {
            if (board[row][col] == EMPTY) {
                board[row][col] = player;
                return true;
            }
        }
        return false;
    }

    private static void printBoard() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean checkWin(char player) {
        return checkHorizontalWin(player) || checkVerticalWin(player) || checkDiagonalWin(player);
    }

    private static boolean isBoardFull() {
        for (int col = 0; col < COLS; col++) {
            if (board[0][col] == EMPTY) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkHorizontalWin(char player) {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS - 3; col++) {
                if (board[row][col] == player && board[row][col + 1] == player && board[row][col + 2] == player && board[row][col + 3] == player) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkVerticalWin(char player) {
        for (int col = 0; col < COLS; col++) {
            for (int row = 0; row < ROWS - 3; row++) {
                if (board[row][col] == player && board[row + 1][col] == player && board[row + 2][col] == player && board[row + 3][col] == player) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkDiagonalWin(char player) {
        // Check for diagonals from bottom-left to top-right
        for (int row = 3; row < ROWS; row++) {
            for (int col = 0; col < COLS - 3; col++) {
                if (board[row][col] == player && board[row - 1][col + 1] == player && board[row - 2][col + 2] == player && board[row - 3][col + 3] == player) {
                    return true;
                }
            }
        }
        // Check for diagonals from top-left to bottom-right
        for (int row = 0; row < ROWS - 3; row++) {
            for (int col = 0; col < COLS - 3; col++) {
                if (board[row][col] == player && board[row + 1][col + 1] == player && board[row + 2][col + 2] == player && board[row + 3][col + 3] == player) {
                    return true;
                }
            }
        }
        return false;
    }

    private static String getWinDirection(char player) {
        if (checkHorizontalWin(player)) return "horizontally";
        if (checkVerticalWin(player)) return "vertically";
        if (checkDiagonalWin(player)) return "diagonally";
        return "none";
    }

    private static boolean playAgain() {
        System.out.println("Do you want to play another game? (yes/no)");
        return scanner.next().equalsIgnoreCase("yes");
    }

    private static void review() {
        System.out.println("Do you want to see the results of any games? Enter game number or -1 to finish.");
        while (true) {
            int gameNum = scanner.nextInt();
            if (gameNum == -1) {
                return;
            }
            if (gameNum >= 0 && gameNum < results.size()) {
                System.out.println(results.get(gameNum));
            } else {
                System.out.println("Invalid game number. Try again.");
            }
        }
    }

    private static void outputStats() {
        int gamesPlayed = results.size();
        int redWins = 0;
        int yellowWins = 0;
        int ties = 0;
        int totalChips = 0;

        for (C4Result result : results) {
            switch (result.getWinner()) {
                case "Red":
                    redWins++;
                    break;
                case "Yellow":
                    yellowWins++;
                    break;
                case "Tie":
                    ties++;
                    break;
            }
            totalChips += result.getNumChips();
        }

        double redWinPercentage = (double) redWins / gamesPlayed * 100;
        double yellowWinPercentage = (double) yellowWins / gamesPlayed * 100;
        double tiePercentage = (double) ties / gamesPlayed * 100;
        double averageChips = (double) totalChips / gamesPlayed;

        System.out.printf("Games Played: %d%n", gamesPlayed);
        System.out.printf("Red win percentage: %.2f%%%n", redWinPercentage);
        System.out.printf("Yellow win percentage: %.2f%%%n", yellowWinPercentage);
        System.out.printf("Tie percentage: %.2f%%%n", tiePercentage);
        System.out.printf("Average chips played per game: %.2f%n", averageChips);
    }
}