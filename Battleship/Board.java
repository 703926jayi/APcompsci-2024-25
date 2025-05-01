package Battleship;

import java.util.ArrayList;
import java.util.Scanner;

public class Board {
    private Coordinate[][] board;
    private ArrayList<Ship> fleet;
    private int guesses;

    public Board() {
        board = new Coordinate[10][10];
        fleet = new ArrayList<>();
        guesses = 0;
        initializeBoard();
        makeShips();
        placeShips();
    }

    public void initializeBoard() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                board[i][j] = new Coordinate((char) ('A' + i), (char) ('0' + j));
            }
        }
    }

    public void makeShips() {
        fleet.add(new Ship("Aircraft Carrier", 5, 'C'));
        fleet.add(new Ship("Battleship", 4, 'B'));
        fleet.add(new Ship("Destroyer", 3, 'D'));
        fleet.add(new Ship("Submarine", 3, 'S'));
        fleet.add(new Ship("PT Boat", 2, 'P'));
    }

    public void placeShips() {
        for (Ship ship : fleet) {
            boolean placed = false;
            while (!placed) {
                int row = (int) (Math.random() * 10);
                int col = (int) (Math.random() * 10);
                boolean vertical = Math.random() < 0.5;
                ship.setVertical(vertical);
                if (isValid(ship, row, col)) {
                    place(ship, row, col, vertical);
                    placed = true;
                }
            }
        }
    }

    private boolean isValid(Ship ship, int row, int col) {
        if (ship.isVertical()) {
            if (row + ship.getSize() > 10) return false;
            for (int i = 0; i < ship.getSize(); i++) {
                if (board[row + i][col].getContents() != ' ') {
                    return false;
                }
            }
        } else {
            if (col + ship.getSize() > 10){
                return false;
            } 
            for (int i = 0; i < ship.getSize(); i++) {
                if (board[row][col + i].getContents() != ' '){
                    return false;
                }
            }
        }
        return true;
    }

    private void place(Ship ship, int row, int col, boolean vertical) {
        for (int i = 0; i < ship.getSize(); i++) {
            if (vertical) {
                board[row + i][col].setContents(ship.getSymbol());
            } else {
                board[row][col + i].setContents(ship.getSymbol());
            }
        }
    }

    public void showBoard() {
        System.out.print("  ");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print((char) ('A' + i) + " ");
            for (int j = 0; j < 10; j++) {
                System.out.print(board[i][j].display(fleet) + " ");
            }
            System.out.println();
        }
    }

    public void check(char r, char c) {
        int row = r - 'A';
        int col = c - '0';
        if (board[row][col].isGuessed()) {
            System.out.println("You already guessed that coordinate!");
            return;
        }
        board[row][col].setGuessed(true);
        guesses++;
        if (board[row][col].getContents() == ' ') {
            System.out.println("Miss!");
        } else {
            System.out.println("Hit!");
            for (Ship ship : fleet) {
                if (ship.getSymbol() == board[row][col].getContents()) {
                    if (ship.hit()) {
                        fleet.remove(ship);
                    }
                    break;
                }
            }
        }
    }

    public void showShips() {
        System.out.println("Remaining ships:");
        for (Ship ship : fleet) {
            System.out.println(ship.getName());
        }
    }

    public void showSolution() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(board[i][j].getContents() + " ");
            }
            System.out.println();
        }
    }

    public void play() {
        while (!fleet.isEmpty()) {
            showBoard();
            System.out.println("Enter a coordinate or ?? to show the solution or SS to show ships:");
            String input = BattleshipRunner.scanner.next().toUpperCase();
            if (input.equals("??")) {
                showSolution();
            } else if (input.equals("SS")) {
                showShips();
            } else if (input.length() == 2 && input.charAt(0) >= 'A' && input.charAt(0) <= 'J' && input.charAt(1) >= '0' && input.charAt(1) <= '9') {
                check(input.charAt(0), input.charAt(1));
            } else {
                System.out.println("Invalid input. Try again.");
            }
        }
        System.out.println("You sank all the ships in " + guesses + " guesses! You win!");
    }
}