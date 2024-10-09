import java.util.Scanner;
public class Bronze{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = 0;
        while(x%2==0){
            x=x/2;
            y++;
        }
    }
}