package domain;

import java.util.*;

import java.util.stream.Collectors;

import static java.lang.Math.*;

public class Triangle implements Shape {

    private final List<Point> points;
    private final String TRIANGLE_INFO = "삼각형 넓이는 ";

    public Triangle(List<Point> points) {
        if (!hasThree(points)) {
            throw new IllegalArgumentException("서로 다른 세 좌표를 입력하세요.");
        }
        this.points = points;
    }

    private static boolean hasThree(List<Point> points) {
        return points.stream().collect(Collectors.toSet()).size() == 3;
    }

    @Override
    public double calculate() {
        double a = points.get(0).calculateDistance(points.get(1));
        double b = points.get(0).calculateDistance(points.get(2));
        double c = points.get(1).calculateDistance(points.get(2));
        return getArea(a, b, c);
    }

    private static double getArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public List<Point> getPoints() {
        return points;
    }

    @Override
    public String getAreaInfo() {return TRIANGLE_INFO + String.format("%.1f", calculate());}
}
