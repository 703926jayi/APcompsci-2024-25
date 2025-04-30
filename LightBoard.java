// SHOW ALL YOUR WORK. REMEMBER THAT PROGRAM SEGMENTS ARE TO BE WRITTEN IN JAVA.

// Assume that the classes listed in the Java Quick Reference have been imported where appropriate.
// Unless otherwise noted in the question, assume that parameters in method calls are not null and that methods are called only when their preconditions are satisfied.
// In writing solutions for each question, you may use any of the accessible methods that are listed in classes defined in that question. Writing significant amounts of code that can be replaced by a call to one of these methods will not receive full credit.
 
// The LightBoard class models a two-dimensional display of lights, where each light is either on or off, as represented by a Boolean value. You will implement a constructor to initialize the display and a method to evaluate a light.

// public class LightBoard

// {

// /** The lights on the board, where true represents on and false represents off.

// */

// private boolean[][] lights;

 

// /** 
public class LightBoard {
    
    /** The lights on the board, where true represents on and false represents off. */
    private boolean[][] lights;

    /** 
     * Constructs a LightBoard with the specified number of rows and columns.
     * @param rows the number of rows in the light board
     * @param cols the number of columns in the light board
     */
    public LightBoard(int rows, int cols) {
        lights = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                lights[i][j] = false; // Initialize all lights to off
            }
        }
    }

    /** 
     * Evaluates a light at the specified row and column.
     * @param row the row of the light to evaluate
     * @param col the column of the light to evaluate
     * @return true if the light is on, false otherwise
     */
    public boolean evaluateLight(int row, int col) {
        return lights[row][col];
    }
}
