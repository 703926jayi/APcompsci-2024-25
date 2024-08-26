import java.util.Scanner;
public class Exercise_215 {
    public static void main(String[] args) {
        Scanner sx = new Scanner(System.in);
        Scanner sy = new Scanner(System.in);
        System.out.println("Enter three points for a triangle:");
        double x1 = sx.nextDouble();
        double y1 = sx.nextDouble();
        double x2 = sx.nextDouble();
        double y2 = sx.nextDouble();
        double x3 = sx.nextDouble();
        double y3 = sx.nextDouble();
        double side1 = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3-x2,2) + Math.pow(y3 - y2, 2));
        double side3 = Math.sqrt(Math.pow(x1-x3,2) + Math.pow(y1 - y3, 2));
        double sidescomb = (side1 + side2+side3)/2;
        double area = Math.sqrt(sidescomb*(sidescomb-side1)*(sidescomb-side2)*(sidescomb-side3));
        System.out.println("The area of the triangle is " + area);

 
    }
}
