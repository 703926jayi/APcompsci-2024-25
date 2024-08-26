import java.util.Scanner;
public class Exercise_212 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter speed and acceleration:");
        double v = s.nextDouble();
        double a = s.nextDouble();
        double l = (Math.pow(v, 2))/(2*a);
        System.out.println("The minimum runway length for this airplane is " + l);
    }
}
