
import java.util.Scanner;
public class Bronze 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        String email = s.next();

        int b = email.indexOf('@');

        String username = email.substring(0,b);
        String domain = email.substring(b+1,email.length());

        String CHARS = domain.substring(domain.length()-3,domain.length());
        System.out.println(username);
        System.out.println(domain);

        if (CHARS.equals("edu")){
            System.out.println("educational");
        } else if (CHARS.equals("org")){
            System.out.println("non-profit");
        } else if (CHARS.equals("gov")){
            System.out.println("government");
        } else{
            System.out.println("commercial");
        }
    }
}