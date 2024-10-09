public class Brute7 {
    public static void main(String[] args) {
        int totalAmount = 60;
        for (int teacher1 = 0; teacher1 <= totalAmount; teacher1++) {
            for (int teacher2 = 0; teacher2 <= totalAmount; teacher2++) {
                for (int teacher3 = 0; teacher3 <= totalAmount; teacher3++) {
                     int teacher4 = totalAmount - (teacher1 + teacher2 + teacher3);  
                        if (teacher4 >= 0) {
                        if (teacher1 == (teacher2 + teacher3 + teacher4) / 2) {
                        if (teacher2 == (teacher1 + teacher3 + teacher4) / 3) {
                        if (teacher3 == (teacher1 + teacher2 + teacher4) / 4) {
                        System.out.println("Teacher 1 paid: $" + teacher1);
                        System.out.println("Teacher 2 paid: $" + teacher2);
                        System.out.println("Teacher 3 paid: $" + teacher3);
                        System.out.println("Teacher 4 paid: $" + teacher4);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
