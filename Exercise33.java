import java.util.Scanner;
public class Exercise33 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            double a = s.nextDouble();
            double b = s.nextDouble();
            double c = s.nextDouble();
            double d = s.nextDouble();
            double e = s.nextDouble();
            double f = s.nextDouble();
        if (a*d - b*c == 0){
            System.out.println("The equation has no solution");
        } else {
            double x =(((e*d)-(b*f))/((a*d)-(b*c)));
            double y =(((a*f)-(e*c))/((a*d)-(b*c)));
            System.out.println("x is "+ x + "and y is "+ y);
        }
    }
}
