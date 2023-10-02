package domain;

import java.util.List;

public interface Shape {

    abstract double calculate();

    abstract List<Point> getPoints();

    abstract String getAreaInfo();
}
