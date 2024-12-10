public class MagicSquare {
    public static void main(String[] args) {
        int[][] magic = new int[3][3];
        int count = 0;
        while (!isMagic(magic)) {
            count++;
            initializeBoard(magic);
            populatemagic(magic);
        }
        output(magic);
        System.out.println("It took " + count + " attempts to build a magic square.");
    }

    public static void initializeBoard(int[][] magic) {
        for (int row = 0; row < magic.length; row++) {
            for (int col = 0; col < magic[0].length; col++) {


                
                magic[row][col] = 0;
            }
        }
    }

    public static void populatemagic(int[][] magic) {
        boolean[] picked = new boolean[10];
        for (int row = 0; row < magic.length; row++) {
            for (int col = 0; col < magic[0].length; col++) {
                int number;
                do {
                    number = (int) (Math.random() * 9) + 1;
                } while (picked[number]);
                picked[number] = true;
                magic[row][col] = number;
            }
        }
    }

    public static void output(int[][] board) {
        System.out.println();
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (col != 2)
                    System.out.print(board[row][col] + " ");
                else
                    System.out.print(board[row][col]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isMagic(int[][] magic) {
        int targetSum = 15;

        for (int i = 0; i < 3; i++) {
            if (magic[i][0] + magic[i][1] + magic[i][2] != targetSum) return false;
            if (magic[0][i] + magic[1][i] + magic[2][i] != targetSum) return false;
        }

        if (magic[0][0] + magic[1][1] + magic[2][2] != targetSum) return false;
        if (magic[0][2] + magic[1][1] + magic[2][0] != targetSum) return false;

        return true;
    }
}













