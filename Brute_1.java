public class Brute_1 {
    public static void main(String[] args) {
        for (int x = 1; x <= 100; x++){
            for (int y = 1; y <= 100; y++){
                if(Math.pow(y, x)==Math.pow(x, y)&& x!=y){
                    System.out.println("x= "+x+" y= "+ y);
                }
         }
     }


    }
}
