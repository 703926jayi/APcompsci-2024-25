import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int numer = s.nextInt();
        int denom = s.nextInt();

        int q = numer/denom;

        if (denom != 0){
            System.out.println(q);
        }
         else
        {
            System.out.println("error divide by zero");
        }
    }
}
