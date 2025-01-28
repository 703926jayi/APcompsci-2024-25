import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {
        String[] dictionary = buildDictionary();
        Scanner scanner = new Scanner(System.in);
        int totalWins = 0, totalLosses = 0;

        while (true) {
            String randomWord = dictionary[(int) (Math.random() * dictionary.length)];
            char[] guessedWord = new char[randomWord.length()];
            for (int i = 0; i < guessedWord.length; i++) {
                guessedWord[i] = '_';
            }

            int misses = 0;
            boolean gameWon = false;
            String guessedLetters = "";

            while (misses < 7 && !gameWon) {
                System.out.println("Current Word: " + displayWord(guessedWord));
                System.out.print("Enter a letter ($ to show remaining letters, * for stats, & to guess the solution): ");
                String input = scanner.nextLine().toUpperCase();

                if (input.equals("$")) {
                    displayRemainingAlphabet(guessedLetters);
                    continue;
                } else if (input.equals("*")) {
                    displayStats(totalWins, totalLosses);
                    continue;
                } else if (input.equals("&")) {
                    System.out.print("Enter your solution guess: ");
                    String solutionGuess = scanner.nextLine().toUpperCase();
                    if (solutionGuess.equals(randomWord)) {
                        System.out.println("Correct! You win!");
                        totalWins++;
                        gameWon = true;
                    } else {
                        System.out.println("Incorrect solution. It counts as a miss.");
                        misses++;
                    }
                    continue;
                }

                if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                    System.out.println("Invalid input. Please enter a valid letter.");
                    continue;
                }

                char guess = input.charAt(0);

                if (guessedLetters.indexOf(guess) != -1) {
                    System.out.println("You already guessed that letter.");
                    continue;
                }

                guessedLetters += guess;

                if (randomWord.indexOf(guess) != -1) {
                    for (int i = 0; i < randomWord.length(); i++) {
                        if (randomWord.charAt(i) == guess) {
                            guessedWord[i] = guess;
                        }
                    }
                    System.out.println("Correct guess!");
                } else {
                    misses++;
                    System.out.println("Wrong guess! Total misses: " + misses);
                }

                if (new String(guessedWord).equals(randomWord)) {
                    System.out.println("Congratulations! You've guessed the word: " + randomWord);
                    totalWins++;
                    gameWon = true;
                }
            }

            if (!gameWon) {
                System.out.println("Game over! The word was: " + randomWord);
                totalLosses++;
            }

            System.out.print("Do you want to play again? (y/n): ");
            String playAgain = scanner.nextLine().toLowerCase();
            if (!playAgain.equals("y")) {
                break;
            }
        }

        scanner.close();
    }

    public static String displayWord(char[] guessedWord) {
        String display = "";
        for (int i = 0; i < guessedWord.length; i++) {
            display += guessedWord[i] + " ";
        }
        return display.trim();
    }

    public static void displayRemainingAlphabet(String guessedLetters) {
        System.out.print("Remaining letters: ");
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            if (guessedLetters.indexOf(letter) == -1) {
                System.out.print(letter + " ");
            }
        }
        System.out.println();
    }

    public static void displayStats(int wins, int losses) {
        int totalGames = wins + losses;
        double winPercentage = totalGames > 0 ? (wins * 100.0) / totalGames : 0.0;
		System.out.println("Total Wins: " + wins + " | Total Losses: " + losses + " | Win Percentage: " + (int)(winPercentage) + "%");
    }

    public static String[] buildDictionary() {
        String[] wordList = new String[45402];
        File f = new File("dictionary.txt");
        Scanner input = null;
        int x = 0;
        try {
            input = new Scanner(f);
        } catch (FileNotFoundException e) {
            System.out.println("dictionary.txt file not found");
            e.printStackTrace();
        }
        while (input.hasNext()) {
            String word = input.nextLine().toUpperCase();
            wordList[x] = word;
            x++;
        }
        input.close();
        System.out.println(wordList.length + " words loaded.");
        return wordList;
    }
}
