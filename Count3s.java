public class Count3s {
    public static void main(String[] args) {
        int z = 0;
        for (int i = 1; i <= 100; i++){
            if(i%10==3) z++;
            if(i/10 == 3) z++;
            System.out.println(z);
     }
    }
}
