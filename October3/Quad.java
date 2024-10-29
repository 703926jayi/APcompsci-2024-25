


import java.util.Scanner;


public class Quad {
    static Scanner s = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Enter values for a, b, and c");
        // Get a, b, and c from user
        double a = convertToDouble(getValue());
        double b = convertToDouble(getValue());
        double c = convertToDouble(getValue());


        double discriminant = calculateDiscriminant(a, b, c);
        outputEquation(a, b, c); // Output equation


        // Calculate and output answers based on the user input
        if (isPositive(discriminant) || numberOfRoots(discriminant) == 2)
            outputTwoRoots(a, b, discriminant);
        else if (isZero(discriminant) || numberOfRoots(discriminant) == 1)
            outputOneRoot(a, b, discriminant);
        else if (isNegative(discriminant) || numberOfRoots(discriminant) == 0)
            noRoots();
    }


    public static int getValue() {
        return s.nextInt();
    }


    public static double convertToDouble(int value) {
        return (double) value;
    }


    public static int numberOfRoots(double discriminant) {
        if (isPositive(discriminant)) return 2;
        else if (isZero(discriminant)) return 1;
        else return 0;
    }


    public static double calculateDiscriminant(double a, double b, double c) {
        return squareIt(b) - 4 * a * c;
    }


    public static boolean isPositive(double value) {
        return value > 0;
    }


    public static boolean isNegative(double value) {
        return value < 0;
    }


    public static boolean isZero(double value) {
        return value == 0;
    }


    public static double calculateSquareRoot(double value) {
        return Math.sqrt(value);
    }


    public static double squareIt(double value) {
        return value * value;
    }


    public static void outputTwoRoots(double a, double b, double discriminant) {
        outputRoot1(a, b, discriminant);
        outputRoot2(a, b, discriminant);
    }


    public static void outputOneRoot(double a, double b, double discriminant) {
        outputRoot1(a, b, discriminant);
    }


    public static void noRoots() {
        System.out.println("No roots for this equasion.");
    }


    public static void outputEquation(double a, double b, double c) {
        System.out.println("The equation is: " + a + "x^2 + " + b + "x + " + c + " = 0");
    }


    public static void outputRoot1(double a, double b, double discriminant) {
        double root = (-b + calculateSquareRoot(discriminant)) / (2 * a);
        System.out.println("Root 1: " + root);
    }


    public static void outputRoot2(double a, double b, double discriminant) {
        double root = (-b - calculateSquareRoot(discriminant)) / (2 * a);
        System.out.println("Root 2: " + root);
    }
}
