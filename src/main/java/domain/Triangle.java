package domain;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Math.*;

public class Triangle implements Shape {

    private final List<Point> points = new ArrayList<>();
    private final HashSet<Point> set = new HashSet<>();

    public Triangle(List<String[]> pointStrings) {
        for (String[] pointString : pointStrings) {
            List<Integer> numbers = Arrays.stream(pointString).map(Integer::parseInt).collect(Collectors.toList());
            set.add(new Point(numbers));
            points.add(new Point(numbers));
        }
        if (set.size() != 3) {
            throw new IllegalArgumentException("서로 다른 세 좌표를 입력하세요.");
        }
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
}
