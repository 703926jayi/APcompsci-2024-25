import java.util.Scanner;
public class Exercise_24 
{
     public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
     // System.out.println("Enter a number in pounds:");
      double pounds = s.nextDouble();
      double kilograms = (pounds*0.454);
      System.out.println(pounds+ " pounds is " + kilograms + " kilograms");
    }
}
