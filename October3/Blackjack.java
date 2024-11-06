

import java.util.Scanner;


public class Blackjack {
    private static int numAces, numCards;
    private static int gamesPlayed;
    private static int playerWins;
    private static int dealerWins;
    private static int ties;
    private static int blackjacks;
    private static int playerBusts;
    private static int longestWinStreak;
    private static int longestLossStreak;
    private static int currentWinStreak;
    private static int currentLossStreak;
    private static boolean fiveWinAchievement;
    private static boolean fiveLossAchievement;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gamesToPlay = getNumGames(scanner);


        for (int i = 1; i <= gamesToPlay; i++) {
            gamesPlayed++;  
            System.out.println("Game #" + i);
            int playerHand = getHand();


            if (isBlackjack(playerHand)) {
                System.out.println("Blackjack! Player wins!");
                recordWin();
                blackjacks++;
            } else if (isFiveCardWin()) {
                System.out.println("Five card win! Player wins!");
                recordWin();
            } else if (isBust(playerHand)) {
                System.out.println("Player busts with score " + playerHand + ". Dealer wins!");
                recordLoss();
                playerBusts++;
            } else {
                int dealerHand = getHand();


                if (isBlackjack(dealerHand)) {
                    System.out.println("Dealer blackjack! Dealer wins!");
                    recordLoss();
                } else if (isBust(dealerHand)) {
                    System.out.println("Dealer busts with score " + dealerHand + ". Player wins!");
                    recordWin();
                } else if (dealerHand > playerHand) {
                    System.out.println("Dealer wins with score " + dealerHand + " over player's " + playerHand + ".");
                    recordLoss();
                } else if (playerHand > dealerHand) {
                    System.out.println("Player wins with score " + playerHand + " over dealer's " + dealerHand + ".");
                    recordWin();
                } else {
                    System.out.println("It’s a tie.");
                    ties++;
                }
            }


            System.out.println();
        }


        displayFinalResults();
        scanner.close();
    }


    private static int getNumGames(Scanner scanner) {
        System.out.println("Welcome to Blackjack Simulation!");
        System.out.print("How many games would you like to simulate? ");
        return scanner.nextInt();
    }


    private static int getHand() {
        int hand = 0;
        numAces = 0;
        numCards = 0;


        while (hand < 17) {
            int cardValue = getCard();
            hand += cardValue;
            hand = adjustAces(hand);
        }


        return hand;
    }


    private static int getCard() {
        numCards++;
        int card = (int)(Math.random() * 13) + 1;
        outputCard(card);


        if (card == 1) {
            numAces++;
            return 11;
        } else if (card > 10) {
            return 10;
        } else {
            return card;
        }
    }


    private static void outputCard(int card) {
        if (card == 1) System.out.print("Ace ");
        else if (card == 2) System.out.print("Two ");
        else if (card == 3) System.out.print("Three ");
        else if (card == 4) System.out.print("Four ");
        else if (card == 5) System.out.print("Five ");
        else if (card == 6) System.out.print("Six ");
        else if (card == 7) System.out.print("Seven ");
        else if (card == 8) System.out.print("Eight ");
        else if (card == 9) System.out.print("Nine ");
        else if (card == 10) System.out.print("Ten ");
        else if (card == 11) System.out.print("Jack ");
        else if (card == 12) System.out.print("Queen ");
        else if (card == 13) System.out.print("King ");
    }


    private static int adjustAces(int hand) {
        if (hand > 21 && numAces > 0) {
            hand -= 10;
            numAces--;
        }
        return hand;
    }


    private static boolean isBlackjack(int hand) {
        return hand == 21 && numCards == 2;
    }


    private static boolean isFiveCardWin() {
        return numCards == 5;
    }


    private static boolean isBust(int hand) {
        return hand > 21;
    }


    private static void recordWin() {
        playerWins++;
        currentWinStreak++;
        currentLossStreak = 0;
        if (currentWinStreak > longestWinStreak) longestWinStreak = currentWinStreak;
        if (currentWinStreak == 5 && !fiveWinAchievement) {
            System.out.println("Achievement unlocked: 5 consecutive wins!");
            fiveWinAchievement = true;
        }
    }


    private static void recordLoss() {
        dealerWins++;
        currentLossStreak++;
        currentWinStreak = 0;
        if (currentLossStreak > longestLossStreak) longestLossStreak = currentLossStreak;
        if (currentLossStreak == 5 && !fiveLossAchievement) {
            System.out.println("Achievement unlocked: 5 consecutive losses!");
            fiveLossAchievement = true;
        }
    }


    private static void displayFinalResults() {
        int completedGames = gamesPlayed - ties;
        double winPercentage = completedGames > 0 ? (double) playerWins / completedGames * 100 : 0;
        System.out.println("Simulation has Ended.");
        System.out.println("################");
        System.out.println("Final Results");
        System.out.println("################");
        System.out.println("Hands Played: " + gamesPlayed);
        System.out.println("Player Wins: " + playerWins);
        System.out.println("Dealer Wins: " + dealerWins);
        System.out.println("Ties: " + ties);
        System.out.println("Player Blackjacks: " + blackjacks);
        System.out.println("Player Busts: " + playerBusts);
        System.out.println("Longest Win Streak: " + longestWinStreak);
        System.out.println("Longest Loss Streak: " + longestLossStreak);
        System.out.println("5 Win Achievement: " + fiveWinAchievement);
        System.out.println("5 Loss Achievement: " + fiveLossAchievement);
        System.out.println("Winning Percentage: " + (winPercentage) + "%");
    }
}
