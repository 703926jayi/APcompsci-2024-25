import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int a = 0;
        int b = 0;
        while(x != 0){
            a = x%10;
            x = x/10;
            b = b+a;
        }
        System.out.println(b);
    }
}
