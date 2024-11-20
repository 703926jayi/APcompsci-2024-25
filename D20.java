import java.util.Scanner;


public class D20 {
    static int[] rolls;
    static boolean showRolls = true;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean hasRolled = false;
        boolean keepGoing = true;


        while (keepGoing) {
            printMenu(hasRolled);


            int choice = scanner.nextInt();
            if (choice == 1) {
                if (!hasRolled) {
                    rollDice(scanner);
                    hasRolled = true;
                } else {
                    System.out.println("You already rolled the dice!");
                }
            } else if (choice == 2) {
                showRollRange(scanner);
            } else if (choice == 3) {
                showSpecificRoll(scanner);
            } else if (choice == 4) {
                showStatistics();
            } else if (choice == 5) {
                toggleShowRolls();
            } else if (choice == 0) {
                System.out.println("Goodbye!");
                keepGoing = false;
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }
    }


    static void printMenu(boolean hasRolled) {
        System.out.println("=== D20 Dice Menu ===");
        if (!hasRolled) {
            System.out.println("1 - Roll Dice");
        } else {
            System.out.println("1 - Roll Dice (Already Rolled)");
        }
        System.out.println("2 - Show Range of Rolls");
        System.out.println("3 - Show a Specific Roll");
        System.out.println("4 - Show Dice Statistics");
        System.out.println("5 - Toggle Show Rolls (" + (showRolls ? "ON" : "OFF") + ")");
        System.out.println("0 - Quit");
        System.out.print("Enter your choice: ");
    }


    static void rollDice(Scanner scanner) {
        System.out.print("How many times would you like to roll the dice? ");
        int numRolls = scanner.nextInt();
        rolls = new int[numRolls];


        for (int i = 0; i < numRolls; i++) {
            rolls[i] = (int) (Math.random() * 20) + 1;
        }


        if (showRolls) {
            for (int i = 0; i < rolls.length; i++) {
                System.out.println("Roll #" + (i + 1) + ": " + rolls[i]);
            }
        } else {
            System.out.println("Rolls are hidden.");
        }
    }


    static void showRollRange(Scanner scanner) {
        if (rolls == null) {
            System.out.println("You need to roll the dice first!");
            return;
        }


        System.out.print("Enter the starting roll number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending roll number: ");
        int end = scanner.nextInt();


        if (start < 1 || end > rolls.length || start > end) {
            System.out.println("Invalid range. Try again.");
        } else {
            for (int i = start - 1; i < end; i++) {
                System.out.println("Roll #" + (i + 1) + ": " + rolls[i]);
            }
        }
    }


    static void showSpecificRoll(Scanner scanner) {
        if (rolls == null) {
            System.out.println("You need to roll the dice first!");
            return;
        }


        System.out.print("Which roll number do you want to see? ");
        int rollNumber = scanner.nextInt();


        if (rollNumber < 1 || rollNumber > rolls.length) {
            System.out.println("Invalid roll number.");
        } else {
            System.out.println("Roll #" + rollNumber + ": " + rolls[rollNumber - 1]);
        }
    }


    static void showStatistics() {
        if (rolls == null) {
            System.out.println("You need to roll the dice first!");
            return;
        }


        int sum = 0;
        int[] counts = new int[20];
        int rollsUntil20 = -1;


        for (int i = 0; i < rolls.length; i++) {
            sum += rolls[i];
            counts[rolls[i] - 1]++;
            if (rolls[i] == 20 && rollsUntil20 == -1) {
                rollsUntil20 = i + 1;
            }
        }


        double average = (double) sum / rolls.length;
        System.out.println("Average Roll: " + average);
        System.out.println("First roll that got a 20: " + (rollsUntil20 == -1 ? "None" : rollsUntil20));
        System.out.println("Roll Frequencies:");
        for (int i = 0; i < counts.length; i++) {
            System.out.println((i + 1) + ": " + counts[i]);
        }
    }


    static void toggleShowRolls() {
        showRolls = !showRolls;
        System.out.println("Show rolls is now " + (showRolls ? "ON" : "OFF"));
    }
}


