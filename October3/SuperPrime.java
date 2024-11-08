import java.util.Scanner;
public class SuperPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        if (n >= 2) {
            PrimeSeq(n);
        } 
    }
    public static void PrimeSeq(int n) {
        int seq = 1;         
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                if (isPrime(seq)) {
                    System.out.println(i);
                }
                seq++;
            }
        }
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
