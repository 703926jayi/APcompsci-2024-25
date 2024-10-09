public class Brute6 {
    public static void main(String[] args) {
        int product = 36;

        for (int age1 = 1; age1 < product; age1++) {
            for (int age2 = age1 + 1; age2 < product; age2++) { 
                for (int age3 = age2 + 1; age3 < product; age3++) { 
                    if (age1 * age2 * age3 == product) {
                        if (age3 - age1 >= 2 && age3 - age1 <= 8) {
                            System.out.println("The ages of the three sons are: " + age1 + ", " + age2 + ", " + age3);
                            return; 
                        }
                    }
                }
            }
        }
    }
}




