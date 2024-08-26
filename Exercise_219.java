import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Exercise_219 {
    public static void main(String[] args) {
        Scanner sx = new Scanner(System.in);
        Scanner sy = new Scanner(System.in);
        System.out.println("Enter x1 and y1");
        double x1 = sx.nextDouble();
        double y1 = sx.nextDouble();
        System.out.println("Enter x2 and y2:");
        double x2 = sx.nextDouble();
        double y2 = sx.nextDouble();
        double l = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between the two points is " + l);

    }
}
