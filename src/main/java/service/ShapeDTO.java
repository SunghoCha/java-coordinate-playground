package service;

import domain.Point;
import domain.Shape;

import java.util.List;

public class ShapeDTO {
    private List<Point> points;
    private String shapeInfo;

    public static ShapeDTO from(Shape shape) {
        return new ShapeDTO(shape);
    }

    private ShapeDTO(Shape shape) {
        shapeInfo = shape.getAreaInfo();
        this.points = shape.getPoints();
    }

    public List<Point> getPoints() {
        return points;
    }

    public String getShapeInfo() {
        return shapeInfo;
    }
}
