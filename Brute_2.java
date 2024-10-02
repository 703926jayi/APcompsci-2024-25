public class Brute_2 {
    public static void main(String[] args) {
        for (int m = 1; m <= 100; m++){
            for (int w = 1; w <= 100; w++){
                int revW = 0; 
                int wifec = w;
                while(wifec != 0)
                {
                    revW = revW * 10 + wifec % 10;
                    wifec/=10;      
                    System.out.println(wifec);   
                    System.out.println(m);
                }
               if (m+w == 99 && m == w+9&& m == wifec) {
               System.out.println(m + " "+ w);
               }
       
         }
     }
    }
}
