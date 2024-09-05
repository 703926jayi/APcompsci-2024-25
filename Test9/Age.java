package Test9;
import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        if (age < 18){
            System.out.println("Minor");
        } else if  (age >= 65){
            System.out.println("Senior");
        } else {
            System.out.println("Senior");
        }
    }
}
    
