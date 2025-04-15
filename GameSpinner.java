// This question involves the creation and use of a spinner to generate random numbers in a game. A GameSpinner object represents a spinner with a given number of sectors, all equal in size. The GameSpinner class supports the following behaviors.

// Creating a new spinner with a specified number of sectors
// Spinning a spinner and reporting the result
// Reporting the length of the current run, the number of consecutive spins that are the same as the most recent spin
// The following table contains a sample code execution sequence and the corresponding results.

// Statements	Value Returned
// (blank if no value
// returned)	Comment
// GameSpinner g = new
//  GameSpinner(4);	 	Creates a new spinner with four sectors
// g.currentRun();	0	Returns the length of the current run. The length of the current run is initially 0 because no spins have occurred.
// g.spin();	3	Returns a random integer between 1 and 4, inclusive. In this case, 3 is returned.
// g.currentRun();	1	The length of the current run is 1 because
public class GameSpinner {
    public GameSpinner(int i) {
        this.sectors = i;
        this.currentRunLength = 0;
        this.lastSpin = -1; 
    }

    private int sectors; // Number of sectors in the spinner
    private int currentRunLength; // Length of the current run
    private int lastSpin; // Last spun sector
    
    public int spin() {
       
        int spinResult = (int) (Math.random() * sectors) + 1; 
        if (spinResult == lastSpin) {
            currentRunLength++; 
        } else {
            currentRunLength = 1; 
        }
        lastSpin = spinResult;
        return spinResult;
    }
    public int currentRun() {
        return currentRunLength;
    }
    
   
    public static void main(String[] args) {
        GameSpinner g = new GameSpinner(4); // Creates a new spinner with four sectors
        g.currentRun(); // Returns the length of the current run. The length of the current run is initially 0 because no spins have occurred.
        g.spin(); 
        g.currentRun();
        g.spin();
        g.currentRun();
    }
}
