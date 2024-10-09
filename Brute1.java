public class Brute1 {
    public static void main(String[] args) {
        int number = 0;

        for (int a = 1; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                int td = 10 * a + b;
                int s =  a + b;

                if (td == 9 * s) {
                    number = td;
                }
            }
        }

        System.out.println("The number is: " + number);
    }
}
