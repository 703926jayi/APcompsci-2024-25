import java.util.Scanner;
public class Life {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int xlength = s.nextInt();
        int ylength = s.nextInt();
        char[][] ttt = new char[xlength][ylength];
        initializeBoard(ttt, xlength, ylength);
        outBoard(ttt, xlength, ylength);
    }
    public static boolean Alive(){

        return  true;
    }
    public static void outBoard(char[][] board, int a, int b){
        for (int y = 0; y < b; y++) {
            for (int x = 0; x < a; x++) {
                if (x != 1) System.out.print("  " + board[x][y] + "  ");
                else System.out.print("|  " + board[x][y] + "  |");
            }


            if (y != b-1) System.out.println("\n-----------------");
        }
    }
    public static void initializeBoard(char[][] board, int a , int b) {
        for (int y = 0; y < b; y++) {
            for (int x = 0; x < a; x++) {
                board[x][y] = ' ';
            }
        }
    }

}
