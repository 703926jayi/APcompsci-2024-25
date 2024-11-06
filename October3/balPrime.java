import java.util.Scanner;
public class balPrime
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        int n1 =s.nextInt();
        int n2 = s.nextInt();

    }
    public static boolean sWap(int a, int b){
        if (a<b){
            return true;
        } else{
         return false;
        }
    }
    public static int bP(int a, int b){
        int x = a;
        int y =b;
        int z =0;
        int p1=0;
        int p2 =0;
        int p3 = 0;
        if (sWap(x,y)==true){
            x = z;
            x=y;
            
        }
        for (int m = a; m >= b; m--){
            if(isPrime(m)==true){
                p1 = m;
                p3=p1;
                p1=p2;
                p2=p3;
                if(p1 !=0||p2 !=0){
                    if(isPrime((p1+p2)/2)==true)
                    {
                        System.out.println(p1+p2/2);
                    }
                }
            }
        }
        return p1;
    }
    public static boolean isPrime(int num)
    {
        if(num < 2 ) return false;
        for (int i = 2; i < num; i++) 
        {
            if(num%i==0)return false;
        }
        return true;
    }
    
    
}