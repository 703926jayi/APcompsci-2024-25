public class Rev {
    public static void main(String[] args) {
        int num = 0;
    }
    public static int reverse(int num){
        int rev = 0;
        while (num!=0){
        rev = rev*10+num%10;
        num/=10;
        }
        return rev;
    }
}
