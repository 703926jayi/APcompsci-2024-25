import java.util.Scanner; 
public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double t = s.nextDouble();
        double v = s.nextDouble();
        if((t < -58 || t > 41)&&(v < 2)){
            System.out.println("Invalid temp and wind");
        } else if ( t < -58 || t > 41){
            System.out.println("Invalid temp");
        } else if(v < 2){
            System.out.println("Invalid wind");
        } else{
        double wc = 35.74 + .6215*t - 35.75*(Math.pow(v, .16))+ .4275*t*(Math.pow(v, .16));
        double wcz =  wc*1000;
        int wcy = (int) wcz;
        double f = ((double) wcy)/1000;
        System.out.println(f);
        }
    }
}
