package gojava.hw4.pointdistance;

public class GeometryHelper {
    public double CalculateDistance(Point p1, Point p2) {
        return Math.sqrt((p1.x1 - p2.x1) * (p1.x1 - p2.x1) + (p1.y1 - p2.y1) * (p1.y1 - p2.y1));
    }
}
