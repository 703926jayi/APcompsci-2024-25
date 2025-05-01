package Battleship;

import java.util.ArrayList;

public class Coordinate {
    private char row;
    private char column;
    private boolean guessed;
    private char contents;

    public Coordinate() {
        this.row = 'A';
        this.column = '0';
        this.guessed = false;
        this.contents = ' ';
    }

    public Coordinate(char row, char column) {
        this.row = row;
        this.column = column;
        this.guessed = false;
        this.contents = ' ';
    }

    public char getRow() {
        return row;
    }

    public void setRow(char row) {
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public void setColumn(char column) {
        this.column = column;
    }

    public boolean isGuessed() {
        return guessed;
    }

    public void setGuessed(boolean guessed) {
        this.guessed = guessed;
    }

    public char getContents() {
        return contents;
    }

    public void setContents(char contents) {
        this.contents = contents;
    }

    public char display(ArrayList<Ship> fleet) {
        if (!guessed) {
            return '-';
        }
        if (contents == ' ') {
            return 'O';
        }
        for (Ship ship : fleet) {
            if (ship.getSymbol() == contents && ship.getHits() == ship.getSize()) {
                return contents;
            }
        }
        return 'X';
    }
}