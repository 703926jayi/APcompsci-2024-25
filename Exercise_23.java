import java.util.Scanner;  //This allows Java to recognize the Scanner command

public class Exercise_23
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter lenght in Feet");
        double feet = s.nextDouble();
        double meters = 0.305*feet;
        System.out.println(feet + " feet is " + meters + " meters");
        

    }
}