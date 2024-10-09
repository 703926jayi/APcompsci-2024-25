public class Brute4 {
    public static void main(String[] args) {
        int p = 1;
        
        for (int i = 1; i <= 12; i++) {
            p *= i;
        }
        
        System.out.println("The product of all positive integers less than or equal to 12 is: " + p);
    }
}