package domain;

import java.util.List;

import static java.lang.Math.*;

public class Point {

    private int x;
    private int y;

    public Point(List<Integer> numbers) {
        Integer x = numbers.get(0);
        Integer y = numbers.get(1);
        if (x < 0 || x > 24 || y < 0 || y > 24) {
            throw new IllegalArgumentException("값은 24를 초과할 수 없습니다.");
        }
        this.x = x;
        this.y = y;
    }

    public double calculateDistance(Point point) {
        return sqrt(pow(x-point.x, 2) + pow(y-point.y, 2));

    }
}
