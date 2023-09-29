package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Line implements Shape{

    private final List<Point> points = new ArrayList<>();

    public Line(List<String[]> pointStrings) {
        if (!hasTwoPoints(pointStrings)) {
            throw new IllegalArgumentException("올바른 입력이 아닙니다.");
        }
        for (String[] str : pointStrings) {
            List<Integer> numbers = Arrays.stream(str).map(Integer::parseInt).collect(Collectors.toList());
            points.add(new Point(numbers));
        }
    }

    private static boolean hasTwoPoints(List<String[]> pointStrings) {
        return pointStrings.size() == 2;
    }

    public double length() {
        return points.get(0).calculateDistance(points.get(1));
    }

    @Override
    public double calculate() {
        return length();
    }
}
