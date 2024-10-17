public class Blank {
    public static void main(String[] args) {
        int num = 0;
        boolean Special = false;
    }
    public static int sumDigits(int num){
        int sum = 0;
        while(num!=0){
            sum*=num %10;
            num /=10;
        }
        return sum;

    }
}
