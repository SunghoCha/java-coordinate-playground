package domain;

import java.util.List;
import java.util.Objects;

import static java.lang.Math.*;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        if (!hasCorrectPoints(x, y)) {
            throw new IllegalArgumentException("값은 0보다 크고 24를 초과할 수 없습니다.");
        }
        this.x = x;
        this.y = y;
    }

    private static boolean hasCorrectPoints(Integer x, Integer y) {
        return x > 0 && x < 24 && y > 0 && y < 24;
    }

    public double calculateDistance(Point point) {
        return sqrt(pow(x-point.x, 2) + pow(y-point.y, 2));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public boolean has(int x, int y) {
        return (this.x == x && this.y == y);

    }
}
