package Class;

public class Point {
    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public void setX(int newX) { x = newX; }
    public int getY() { return y; }
    public void setY(int newY) { y = newY; }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public void outputQuadrant() {
        if (x > 0 && y > 0) {
            System.out.println("The point " + toString() + " resides in quadrant 1.");
        } else if (x < 0 && y > 0) {
            System.out.println("The point " + toString() + " resides in quadrant 2.");
        } else if (x < 0 && y < 0) {
            System.out.println("The point " + toString() + " resides in quadrant 3.");
        } else if (x > 0 && y < 0) {
            System.out.println("The point " + toString() + " resides in quadrant 4.");
        } else if (x == 0 && y != 0) {
            System.out.println("The point " + toString() + " resides on the y-axis.");
        } else if (y == 0 && x != 0) {
            System.out.println("The point " + toString() + " resides on the x-axis.");
        } else {
            System.out.println("The point " + toString() + " is at the origin.");
        }
    }

    public void distance() {
        double dist = Math.sqrt(x * x + y * y);
        System.out.println(toString() + "'s distance from the origin is " + dist);
    }

    public void distance(Point p) {
        int deltaX = p.getX() - x;
        int deltaY = p.getY() - y;
        double dist = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        System.out.println(toString() + "'s distance from " + p.toString() + " is " + dist);
    }
}
