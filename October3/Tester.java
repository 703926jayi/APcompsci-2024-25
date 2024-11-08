import java.util.Scanner;

public class Tester {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to find and print primes where the sequence index is also prime
    public static void printPrimesWithPrimeIndices(int n) {
        int sequenceIndex = 1; // To keep track of the index (1-based)
        
        System.out.println("Primes between 2 and " + n + " with prime sequence indices:");
        
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                // Check if the current sequence index is prime
                if (isPrime(sequenceIndex)) {
                    System.out.println("Index: " + sequenceIndex + ", Prime: " + i);
                }
                sequenceIndex++;
            }
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer greater than 2: ");
        int n = scanner.nextInt();
        
        if (n >= 2) {
            printPrimesWithPrimeIndices(n);
        } else {
            System.out.println("Please enter an integer greater than 2.");
        }

        scanner.close();
    }
}
