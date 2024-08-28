import java.util.Scanner;
public class Exercise_26
{
  public static void main(String[] args)
  {
      Scanner s = new Scanner(System.in);
      //System.out.println("Enter a number between 0 and 100: ");
      int n = s.nextInt();
      int d = (n / 100) + ((n / 10) % 10) + (n % 10);
      System.out.println("The sum of the digits is " + d);
   }

}
