import java.util.Scanner;
public class Exercise_21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a degree in Celsius");
        int c = s.nextInt();
        double f = (9.0 / 5.0) * c + 32;
        System.out.println(c + " Celsius is "+ f +" Fahrenheit");
    }
}
