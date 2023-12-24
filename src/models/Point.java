package models;

public class Point {
    //Coordinates of the point
    private double x;
    private double y;

    //Initialization of a point with coordinates
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Distance from the current point to the destination point
    public double distance(Point dest) {
        double dx = this.x - dest.x;
        double dy = this.y - dest.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    //String representation of the point
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}