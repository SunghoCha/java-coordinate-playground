package service;

import domain.*;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CoordinateService {
    private Shape shape;
    private static final HashMap<Integer, Function<List<Point>, Shape>> classifier = new HashMap<>();

    static {
        classifier.put(2,Line::new);
        classifier.put(3,Triangle::new);
        classifier.put(4,Square::new);
    }

    public CoordinateService(List<String[]> strings) {
        List<Point> points = convertToPoints(strings);
        this.shape = classifier.get(strings.size()).apply(points);
        shape.calculate();
    }

    private List<Point> convertToPoints(List<String[]> strings) {
        List<Point> points = new ArrayList<>();
        for (String[] string : strings) {
            List<Integer> numbers = Arrays.stream(string).map(Integer::parseInt).collect(Collectors.toList());
            points.add(new Point(numbers.get(0), numbers.get(1)));
        }
        return points;
    }

    public ShapeDTO getResult() {
        return ShapeDTO.from(shape);
    }

    public double calculate() {
        return shape.calculate();
    }
}
