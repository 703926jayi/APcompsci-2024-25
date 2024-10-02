public class RGB {
    public static void main(String[] args) {
        for (int r = 1; r <= 24; r++){
            for (int g = 1; g <= 24; g++){
                for (int b = 1; b <= 24; b++){
                    if (r==b+1&&r==g*2&&r+b+g ==24) {
                        System.out.println("red = "+ r+"blue = "+b+ "green = "+ g);
                    }
             }
         }
     }
    }
}
