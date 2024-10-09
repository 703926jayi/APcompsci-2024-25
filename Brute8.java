public class Brute8 {
    public static void main(String[] args) {
        int totalAnimals = 100;
        double totalMoney = 100.0;
        for (int cows = 1; cows <= totalAnimals / 10; cows++) {
            for (int pigs = 1; pigs <= totalAnimals / 3; pigs++) {
                int chickens = totalAnimals - cows - pigs;
                if (chickens > 0 && (cows * 10 + pigs * 3 + chickens * 0.5) == totalMoney) {
                    System.out.println("Solution found:");
                    System.out.println("Cows: " + cows);
                    System.out.println("Pigs: " + pigs);
                    System.out.println("Chickens: " + chickens);
                }
            }
        }
    }
}


