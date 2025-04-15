import java.util.Scanner;

public class Coder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter shift value (-25 to 25): ");
        int shift = scanner.nextInt();
        int z = shift;
        scanner.nextLine(); 
        shift = (shift % 26 + 26) % 26; 
        //System.out.print("Enter the string to encode: ");
        String input = scanner.nextLine().toUpperCase();
        String encodedString = ""; 

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                int oP = c - 'A'; 
                int nP = (oP + shift) % 26; 
                if (nP < 0) {
                    nP += 26; 
                }
                char nC = (char) (nP + 'A'); 
                encodedString += nC;
            } else {
                encodedString += c;
            }
        }
        if(z>25|| z<-25){
            System.out.println("invalid shift");
        }else{
            System.out.println(encodedString);

        }
    }
}