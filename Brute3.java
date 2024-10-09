public class Brute3 {
    public static void main(String[] args) {
        for (int number = 100; number <= 999; number++) {
            int hundreds = number / 100;
            int tens = (number / 10) % 10;
            int ones = number % 10;
            if (tens == ones + 5 && hundreds == tens - 8) {
                System.out.println("The number is: " + number);
                   }
        }
    }
}


