import java.util.Scanner;
public class BruteStuff 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
      //  System.out.println("Number of heads counted:    ");
        int heads = s.nextInt();
      //  System.out.println("Number of legs counted:    ");
        int legs = s.nextInt();
        int chickens = 0;
        int horses = 0;
        
        for (chickens = 0; chickens <= heads; chickens++) 
        {
            for ( horses = 0; horses <= heads; horses++) 
            {
                if ((chickens*2) + (horses*4) == legs && (horses + chickens == heads))
                {
                    System.out.println("You have " + chickens + " chickens and " + horses + " horses.");
                } 
            }
        }
        if (heads > legs || legs % 2 != 0) System.out.println("Invalid");
        
    }
}
