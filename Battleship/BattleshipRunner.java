package Battleship;
// Ship Methods
// get and set methods for all data fields.
// public boolean hit() – This method will increase the number of hits on a ship and check to see if the hit sinks the ship. An
// appropriate message should be outputted. (“You sank the battleship”). This method will return true if the ship is sunk,
// otherwise false. This method can be used to update the fleet ArrayList in the event a Ship is sunk.

// Coordinate Class

// Data fields
// row - This character data field holds the row letter for a given coordinate on the board.
// column - This character data field holds the column number for a given coordinate on the board.
// guessed - This boolean data field holds true or false based on whether the player has guessed this coordinate before.
// contents - This character data field holds the contents of the coordinate on the board. There are six possible characters:

// Symbol Situation
// ‘ ‘ (space) This coordinate holds nothing
// C Holds part of Aircraft Carrier
// B Holds part of the Battleship
// D Holds part of the Destroyer
// S Holds part of the Submarine
// P Holds part of the PT Boat

// Constructors
// Coordinate() - (no - arg) - Defaults to 0,0 (will be unused)
// Coordinate(char r, char c) - Fills in the row and column character data fields. contents will be filled later when ships are
// randomly placed.
// Methods
// get and set methods for all data fields.
// public char display (ArrayList<Ship>) - This method receives the ArrayList of Ships currently on the board and will return
// the symbol to be outputted by the game. If the coordinate has not been guessed, a hyphen (-) should be returned. If
// the coordinate has been guessed, it should return "O" if the coordinate holds no ship, "X" if the coordinate holds a ship
// that hasn't been sunk, or the ship's symbol if the ship has been sunk.
// Board Class

// The Board class holds the 2D array of Coordinates as well as the locations of all the ships.
// Data Fields
// board - This is a 2D array of Coordinates. It will use this to output the board and keep track of the game's state.
// fleet - This is an ArrayList of Ships. It will contain all five ships at the start of the game. When a ship is sunk, it is
// removed from the ArrayList.
// guesses – This integer data field will hold the number of guesses it takes the player to find all five ships.
// Constructor
// Board() - (no-arg) - This is the only constructor for the game. This constructor is what triggers the creation of all Ships,
// Coordinates and populates the game board for the player.
// Methods
// public void initializeBoard() - This method will create all Coordinate objects and place them in the board 2D array.
// public void makeShips() - This method will create the five Ship objects and place them in the fleet ArrayList.

// public void placeShips() – This method will randomly place the five ships within the board 2D array. None of the five
// ships can overlap or extend off the board. *You may end up creating other methods to help with the placement of the
// ships, such as isValid (boolean method to see if the random location works)
// public void place(Ship, row, col, vertical) – This method will set the contents of the spots on the board that the ship will
// occupy.
// public void showBoard() – This method will output the board to the console. It should use the Coordinate display
// method to output the appropriate symbol within the board.
// public void check(char r, char c) – This method will take the user’s guess and process it properly. Make sure it will
// handle the following situations:
//  The String will have to be converted into integer values to check the location on the board.
//  It will alert the user if this coordinate has already been guessed.
//  It will alert the user of a hit on a ship and if a ship is sunk.
//  It will alert the user of a miss.
// public void showShips() – This will show which ships remain on the board
// public void showSolution – This will simply show the contents of all Coordinate objects on the board.
// public void play() – This will begin the gameplay phase. Here, you should create a while loop that will continue until the
// fleet ArrayList is empty. At that point the game is over and the number of guesses used by the player is displayed.
//  Each iteration of the while loop should request a coordinate from the player. Be sure to check for invalid input
// and provide an appropriate message when this happens.
//  Each guess should update the game board and redisplay the state of the game in the console.
//  An input of ?? will reveal the solution of the board, without disrupting or changing play of the board.
//  An input of SS will output the names of the ships remaining on the board.
public class BattleshipRunner {
    
    public static void main(String[] args) {
        Board board = new Board();
        board.play();
    }


}
