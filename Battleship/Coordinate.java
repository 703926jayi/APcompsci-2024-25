package Battleship;

import java.util.ArrayList;

public class Coordinate {
    private boolean guessed;
    private char contents;
    public Coordinate(char c, char d){
    guessed = false;
    contents = ' ';
    }
    public char display(){
        if(!guessed){
            return '-';
        }else{
            // nothing there return O
            //ship symbol there retun X
            //if there is a ship, send back the ccontents
            if(contents == ' '){
                return 'O';
            } else if(contents != 'X' || contents != 'O'){
                return 'X'; 
            } else{
                return contents;
            }
        }
    }
    public void setContents(char c){
        contents = c;
    }
    public char getContents(){
        return contents;
    }
    public String display(ArrayList<Ship> fleet) {
        if (!guessed) {
            return "-";
        } else {
            for (Ship ship : fleet) {
                if (ship.getSymbol() == contents) {
                    return String.valueOf(contents); // Return the ship's symbol
                }
            }
            return "O"; // No ship, return 'O'
        }
    }
   
}
