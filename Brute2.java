public class Brute2 {
    public static void main(String[] args) {
        int Patty = 0;
        int Terry = 0;

     
        for (int T = 1; T < 100; T++) {
            int P = 3 * T; 

            
            if ((P + 10) + (T + 10) == 36) {
                Patty = P;
                Terry = T;
            }
        }

        System.out.println("Patty's current age is: " + Patty);
        System.out.println("Terry's current age is: " + Terry);
    }
}
