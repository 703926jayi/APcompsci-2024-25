package Battleship;

import java.util.Scanner;

public class BattleshipRunner {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Board board = new Board();
        board.play();
    }
}