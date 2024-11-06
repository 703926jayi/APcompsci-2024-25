import java.util.Scanner;
public class Bronze{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();
        double v = x;
        int y = 0;
        double z =0;
        if(x%2==0){
        while(x%2==0&&(double)x%2==0){
            x=x/2;
            y++;
            z = z+x;
        }
    if(x==1){
        System.out.println((int)v+" can be divided by two "+ y+ " times.");
    }
    else if(x%2 != 0){
        System.out.println( (int)v+" can only be divided by two "+ y+ " times.");
    }
    } else{
        System.out.println((int)v+" cannot be divided by 2");
    }
    }
}



