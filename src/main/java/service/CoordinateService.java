package service;

import domain.Line;

import java.util.List;

public class CoordinateService {
    private final Line line;

    public CoordinateService(List<String[]> strings) {
        this.line = new Line(strings);
    }

    public double calculate() {
        return line.length();
    }
}
