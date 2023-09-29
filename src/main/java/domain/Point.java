package domain;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

import static java.lang.Math.*;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double calculateDistance(Point point2) {
       return sqrt(pow(x-point2.x,2) + pow(y-point2.y,2));
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
}
