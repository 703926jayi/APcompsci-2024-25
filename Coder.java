// This is a cryptography assignment.
// The user will enter an integer in the range from -25 to 25. The alphabet will be shifted that many characters. For
// example, if the user entered -1, the alphabet will be shifted one to the left, meaning the new alphabet is:
// BCDEFGHIJKLMNOPQRSTUVWXYZA
// Make sure your new alphabet “wraps” around, either on the left or right side.
// The user will then provide a String that will be converted to its cryptographical equivalent, using your new alphabet.
// Make sure the user’s input in converted to upper case.
// For example, if the user entered “APPLE”, the program will output BQQMF.
// Your program should leave spacing, numbers and punctuation alone, only changing the letters.
// Here’s your test cases:
// -1 10 -15
// Kelvin licks walls &quot;Hold the door!&quot;, said Hodor. Pizza and 20 points of extra credit!
// JDKUHM KHBJR VZKKR &quot;RYVN DRO NYYB!&quot;, CKSN RYNYB. ATKKL LYO 20 AZTYED ZQ PIECL NCPOTE!

// Depending on how you code this, you might need to user 2 different Scanners for each input .
//do without apend call
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