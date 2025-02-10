package Class;

public class PointRunner {

	public static void main(String[] args) {
        Point p1 = new Point(7, 11);
        Point p2 = new Point(-4, 3);
        Point p3 = new Point(-8, -3);
        Point p4 = new Point();
        System.out.println(p1);
        p1.outputQuadrant();
        p2.outputQuadrant();
        p3.outputQuadrant();
        p1.distance();
        p2.distance(p3);
        p3.distance(p4);
        p3.distance();
		
	}

}
