import java.util.Scanner;
public class Stuff {
    public static void main(String[] args) {
        int num = -1;
        int i = 0;
        Scanner s = new Scanner(System.in);
        while(num != 0){
            i++;
            num = (int)(Math.random()*101);
            System.out.println("num= "+num);
            System.out.println(i);
        }
    }
}
