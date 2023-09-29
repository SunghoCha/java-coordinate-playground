package Service;

import domain.*;

public class CoordinateService {
    public static Shape createShape(String[] points) {

        if (points.length == 1) {
            return new Dot(points);
        }
        if (points.length == 2) {
            return new Line(points);
        }
        if (points.length == 3) {
            return new Triangle(points);
        }
        if (points.length == 4) {
            return new Square(points);
        }
        return null;
    }
}
