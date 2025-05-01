package Battleship;

public class Ship {
    private String name;
    private int size;
    private int hits;
    private boolean vertical;
    private char symbol;

    public Ship() {
        this("Battleship", 4, 'B');
    }

    public Ship(String name, int size, char symbol) {
        this.name = name;
        this.size = size;
        this.symbol = symbol;
        this.hits = 0;
        this.vertical = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public boolean isVertical() {
        return vertical;
    }

    public void setVertical(boolean vertical) {
        this.vertical = vertical;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public boolean hit() {
        hits++;
        if (hits == size) {
            System.out.println("You sank the " + name + "!");
            return true;
        }
        return false;
    }
}