public class Brute5 {
    public static void main(String[] args) {
        int ta= 100;
        int numberOfChildren = 5;
        
        int ya = 0;


        for (int x = 0; x <= ta; x++) {
            int s = x + (x + 2) + (x + 4) + (x + 6) + (x + 8);
            if (s == ta) {
                ya = x;
            }
        }
        
        System.out.println("The youngest grandchild received: $" + ya);
    }
}
