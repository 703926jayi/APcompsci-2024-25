import java.util.Scanner;
public class CC {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y=0;
        while(x!=1){
            if(x%2 != 1){
                x=x/2;
            } else{
                x=x*3+1;
            }
            y++;
        }
        System.out.println("It took " +y+" loops");
    }
}
