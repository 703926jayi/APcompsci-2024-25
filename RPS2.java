import java.util.Scanner;


	public class RPS2 {


		public static void main(String[] args)
		{

			int computerThrow = 0;  // Uses integer values 1 to 3 to hold Rock Paper or Scissors for Computer
			int playerThrow = 0;	 // Uses integer values 1 to 3 to hold Rock Paper or Scissors for Computer
			int computerWins = 0;	//Holds the number of times computer wins
			int playerWins = 0;	//Holds the number of times playter wins
			String pChoice = "";	// Holds the String equivalent of the player's Throw for output purposes
			String cChoice = "";	// Holds the String equivalent of the computer's Throw for output purposes

			Scanner s = new Scanner(System.in);
			System.out.println("Welcome to Rock, Paper, Scissors vs the computer.  First to win 3 games win the match.");
			
			while( computerWins <3 && playerWins < 3)
			{
				playerThrow = 0;  //Reset Throw before each throw
				while(playerThrow > 3 || playerThrow <= 0)
				{
					System.out.println("Enter your choice:  (1) Rock  (2) Paper  (3) Scissors");
					playerThrow = s.nextInt();
				}
				computerThrow = (int) (Math.random()*3)+1;  //Random number generated for the computer.

				//Converts the player and computer throws to a String equivalent
				if(playerThrow ==1) pChoice = "Rock";
				else if(playerThrow ==2) pChoice = "Paper";
				else if(playerThrow ==3) pChoice = "Scissors";
				
				if(computerThrow ==1) cChoice = "Rock";
				else if(computerThrow ==2) cChoice = "Paper";
				else if(computerThrow ==3) cChoice = "Scissors";
				
				System.out.println("You throw " + pChoice + " and the computer throws " + cChoice + ".");  //outputs the throw for user
			
				if((playerThrow==1 && computerThrow==3 || playerThrow==2 && computerThrow==1 || playerThrow==3 && computerThrow==2))
				{
					System.out.println("Player wins.");
					playerWins++;
				}
				else if(playerThrow==computerThrow)
				{
					System.out.println("It's a tie.");
					
				}
				else  //only other option is that the computer wins.  Saves us writing another compound condition.
				{
					System.out.println("Computer wins.");
					computerWins++;
				}
			}
			//Having exited the while loop, we can now output the winner, based on who has 3 wins.

			if (playerWins==3) System.out.println("Player wins the match." + playerWins + " to " + computerWins);
			else System.out.println("Computer wins the match."+ playerWins + " to " + computerWins);
				
		}

	}