import java.util.Random;
import java.util.Scanner;


public class Blackjack {
    private static Random random = new Random();
    private static int gamesPlayed, playerWins, dealerWins, ties, blackjacks, playerBusts;
    private static int longestWinStreak, longestLossStreak;
    private static int currentWinStreak, currentLossStreak;
    private static boolean fiveWinAchievement, fiveLossAchievement;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Blackjack Simulation!");
        System.out.print("How many games would you like to simulate? ");
        int numberOfGames = scanner.nextInt();


        for (int i = 1; i <= numberOfGames; i++) {
            System.out.println("Game #" + i);
            playGame();
            System.out.println();
        }


        displayFinalResults();
        scanner.close();
    }


    private static void playGame() {
        gamesPlayed++;
        int[] playerHand = generateHand(true);
        int playerScore = calculateScore(playerHand);
        boolean playerBlackjack = isBlackjack(playerHand);
        boolean fiveCardWin = (playerHand.length == 5 && playerScore <= 21);


        // Determine player outcomes
        if (playerScore > 21) {
            System.out.println("Player busts with score " + playerScore + ". Dealer wins!");
            recordLoss();
            playerBusts++;
            return;
        } else if (playerBlackjack) {
            System.out.println("Blackjack! Player wins!");
            recordWin();
            blackjacks++;
            return;
        } else if (fiveCardWin) {
            System.out.println("Five card win! Player wins!");
            recordWin();
            return;
        }


        // Dealer plays
        int[] dealerHand = generateHand(false);
        int dealerScore = calculateScore(dealerHand);
        boolean dealerBlackjack = isBlackjack(dealerHand);


        // Check results
        if (dealerScore > 21) {
            System.out.println("Dealer busts with score " + dealerScore + ". Player wins!");
            recordWin();
        } else if (dealerBlackjack) {
            System.out.println("Dealer blackjack! Dealer wins!");
            recordLoss();
        } else if (playerScore == dealerScore) {
            System.out.println("It’s a tie.");
            ties++;
        } else if (playerScore > dealerScore) {
            System.out.println("Player wins with score " + playerScore + " over dealer's " + dealerScore + ".");
            recordWin();
        } else {
            System.out.println("Dealer wins with score " + dealerScore + " over player's " + playerScore + ".");
            recordLoss();
        }
    }


    private static int[] generateHand(boolean isPlayer) {
        int[] hand = new int[5];
        int cardCount = 0;
        int score = 0;


        while (score < 17 && cardCount < 5) {
            int card = getCard();
            hand[cardCount++] = card;
            score = calculateScore(hand);
            if (score >= 17) break;
        }


        int[] finalHand = new int[cardCount];
        System.arraycopy(hand, 0, finalHand, 0, cardCount);
        printHand(finalHand, isPlayer ? "Player" : "Dealer");
        return finalHand;
    }


    private static int getCard() {
        return random.nextInt(13) + 1;
    }


    private static void printHand(int[] hand, String owner) {
        System.out.print(owner + " hand: ");
        for (int card : hand) {
            System.out.print(outputCard(card) + " ");
        }
        System.out.println();
    }


    private static String outputCard(int card) {
        switch (card) {
            case 1: return "Ace";
            case 11: return "Jack";
            case 12: return "Queen";
            case 13: return "King";
            default: return String.valueOf(card);
        }
    }


    private static int calculateScore(int[] hand) {
        int score = 0;
        int aces = 0;
        for (int card : hand) {
            if (card == 1) {
                aces++;
                score += 11;
            } else if (card >= 10) {
                score += 10;
            } else {
                score += card;
            }
        }
        while (score > 21 && aces > 0) {
            score -= 10;
            aces--;
        }
        return score;
    }


    private static boolean isBlackjack(int[] hand) {
        return hand.length == 2 && calculateScore(hand) == 21;
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
        double winPercentage = (double) playerWins / (gamesPlayed - ties) * 100;
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
        System.out.printf("Winning Percentage: %.3f%%\n", winPercentage);
    }
}
