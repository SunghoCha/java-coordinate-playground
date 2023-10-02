package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Line implements Shape{

    private final List<Point> points;
    private final String LINE_INFO = "두 점 사이 거리는 ";

    public Line(List<Point> points) {
        if (!hasTwoPoints(points)) {
            throw new IllegalArgumentException("올바른 입력이 아닙니다.");
        }
        this.points = points;
    }

    private static boolean hasTwoPoints(List<Point> points) {
        return points.size() == 2;
    }

    public double length() {
        return points.get(0).calculateDistance(points.get(1));
    }

    @Override
    public double calculate() {
        return length();
    }

    @Override
    public List<Point> getPoints() {
        return points;
    }

    @Override
    public String getAreaInfo() {return LINE_INFO + String.format("%f", calculate());}
}
