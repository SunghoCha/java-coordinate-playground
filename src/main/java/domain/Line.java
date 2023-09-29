package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Line extends Shape {

    private List<Point> points = new ArrayList<>();

    public Line(List<String[]> points) {
        if (!(points.size() == 2)) {
            throw new IllegalArgumentException("중복 좌표 입력");
        }
        for (String[] point : points) {
            List<String> collect = Arrays.stream(point).collect(Collectors.toList());
            Point point1 = new Point(Integer.parseInt(collect.get(0)), Integer.parseInt(collect.get(1)));
            points.add()
        }

    }

    @Override
    public double calculate() {
        return points.get(0).calculateDistance(points.get(1));
    }
}


