// An APLine is a line defined by the equation ax + by + c = 0 , where a is not equal to zero, b is not equal to zero, and a, b, and c are all integers. 
// The slope of an APLine is defined to be the double value -a b/ . 
// A point (represented by integers x and y) is on an APLine if the equation of the APLine is satisfied when those x and y values are substituted into the equation. 
// That is, a point represented by x and y is on the line if ax + by + c is equal to 0. Examples of two APLine equations are shown in the following table.
// Write the APLine class. Your implementation must include a constructor that
//  has three integer parameters that represent a, b, and c, in that order. You may
//   assume that the values of the parameters representing a and b are not zero. 
//   It must also include a method getSlope that calculates and returns the slope of the line, and a method isOnLine
//    that returns true if the point represented by its two parameters (x and y, in that order) is on the APLine and returns
//     false otherwise. Your class must produce the indicated results when invoked by the code segment given above. 
//     You may ignore any issues related to integer overflow.
public class APLine{
    private int a;
    private int b;  
    private int c;
    public APLine(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getSlope( ){

        return -(double)a / (double)b; 

    }

    public boolean isOnLine(int x, int y){
        return (a * x) + (b * y) + c == 0; 
    }
    public static void main(String[] args) {
        APLine line1 = new APLine(5, 4, -17);
        System.out.println("Slope of line1: " + line1.getSlope());
        System.out.println("Is point (0, 2) on line1? " + line1.isOnLine(5, -2));


    }
    }