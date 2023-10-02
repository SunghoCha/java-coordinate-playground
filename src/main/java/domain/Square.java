package domain;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.Math.abs;

public class Square implements Shape {

    private final List<Point> points;
    private final String RECTANGLE_INFO = "사각형 넓이는 ";


    public Square(List<Point> points) {
        if (!hasFourPoints(points)) {
            throw new IllegalArgumentException("올바른 입력이 아닙니다.");
        }
        if (!isRectangle(points)) {
            throw new IllegalArgumentException("직사각형이나 정사각형 좌표만 허용됩니다.");
        }
        this.points = points;
    }

    private static boolean hasFourPoints(List<Point> points) {
        return points.size() == 4;
    }

    private boolean isRectangle(List<Point> points) {
        return hasTwoXPoints(points) && hasTwoYPoints(points);
    }

    private boolean hasTwoYPoints(List<Point> points) {
        return convertToYValue(points).size() == 2;
    }

    private boolean hasTwoXPoints(List<Point> points) {
        return convertToXValue(points).size() == 2;
    }

    private static Set<Integer> convertToXValue(List<Point> points) {
        return points.stream().map(p -> p.getX()).collect(Collectors.toSet());
    }

    private static Set<Integer> convertToYValue(List<Point> points) {
        return points.stream().map(p -> p.getY()).collect(Collectors.toSet());
    }

    @Override
    public double calculate() {
        return area();
    }

    public double area() {
        return abs(getLength(convertToXValue(points)) * getLength(convertToYValue(points)));
    }

    private double getLength(Set setX) {
        Iterator<Integer> iter = setX.iterator();
        Integer next = iter.next();
        Integer next2 = iter.next();
        return next - next2;
    }

    @Override
    public List<Point> getPoints() {
        return points;
    }

    @Override
    public String getAreaInfo() {return RECTANGLE_INFO + String.format("%.1f", calculate());}
}
