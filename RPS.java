
import java.util.Scanner;

public class RPS {
	public static void main(String[] args)
	{
		int computerThrow = 0;  //Holds a value 1 to 3
		int playerThrow = 0;
		String pChoice = "";
		String cChoice = "";
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to Rock, Paper, Scissors vs the computer. ");
		System.out.println("Enter your choice:  (1) Rock  (2) Paper  (3) Scissors");
		playerThrow = s.nextInt();
		computerThrow = (int) (Math.random()*3)+1;
		
		if(playerThrow ==1) pChoice = "Rock";
		if(playerThrow ==2) pChoice = "Paper";
		if(playerThrow ==3) pChoice = "Scissors";
			
		if(computerThrow ==1) cChoice = "Rock";
		if(computerThrow ==2) cChoice = "Paper";
		if(computerThrow ==3) cChoice = "Scissors";
			
		System.out.println("You throw " + pChoice + " and the computer throws " + 		cChoice + ".");	
		
	//You write if statements to declare either player or computer the winner
	if(playerThrow == 1 && computerThrow == 3) {
	    System.out.println("Player wins");
	}
	if(playerThrow == 2 && computerThrow == 3) {
	    System.out.println("Computer wins");
	}	
	if(playerThrow == 3 && computerThrow == 3) {
	    System.out.println("Tie");
	}
		if(playerThrow == 1 && computerThrow == 2) {
	    System.out.println("Computer wins");
	}
	if(playerThrow == 2 && computerThrow == 2) {
	    System.out.println("Tie");
	}	
	if(playerThrow == 3 && computerThrow == 2) {
	    System.out.println("Player wins");
	}
		if(playerThrow == 1 && computerThrow == 1) {
	    System.out.println("Tie");
	}
	if(playerThrow == 2 && computerThrow == 1) {
	    System.out.println("Player wins");
	}	
	if(playerThrow == 3 && computerThrow == 1) {
	    System.out.println("Computer wins");
	}
			
	}

}


