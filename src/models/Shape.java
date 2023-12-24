package models;

import java.util.ArrayList;

public class Shape {
    //Store points forming the shape
    ArrayList<Point> points = new ArrayList<>();

    //Adding a point to the list
    public void addPoint(Point point) {
        points.add(point);
    }

    //Calculating the perimeter
    public double calculatePerimeter() {
        double perimeter = 0;
        int size = points.size();

        //Calculating the distance to the next point
        for (int i = 0; i < size; i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % size);

            perimeter += currentPoint.distance(nextPoint);
        }

        return perimeter;
    }

    //Average side length
    public double getAverageSide() {
        int size = points.size();
        if (size == 0) {
            return 0;
        }

        return calculatePerimeter() / size;
    }

    //The longest side
    public double getLongestSide() {
        double longestSide = 0;

        //Finding the length of the current side
        for (int i = 0; i < points.size(); i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % points.size());

            double currentSide = currentPoint.distance(nextPoint);
            if (currentSide > longestSide) {
                longestSide = currentSide;
            }
        }

        return longestSide;
    }
}