package domain;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.Math.abs;

public class Square implements Shape {

    private final List<Point> points = new ArrayList<>();
    private final HashSet<Integer> setX = new HashSet<>();
    private final HashSet<Integer> setY = new HashSet<>();

    public Square(List<String[]> pointStrings) {
        if (!hasFourPoints(pointStrings)) {
            throw new IllegalArgumentException("올바른 입력이 아닙니다.");
        }
        for (String[] str : pointStrings) {
            List<Integer> numbers = Arrays.stream(str).map(Integer::parseInt).collect(Collectors.toList());
            setX.add(numbers.get(0));
            setY.add(numbers.get(1));
            points.add(new Point(numbers));
        }
        if (!isRectangle()) {
            throw new IllegalArgumentException("직사각형이나 정사각형 좌표만 허용됩니다.");
        }
    }

    private static boolean hasFourPoints(List<String[]> pointStrings) {
        return pointStrings.size() == 4;
    }

    private boolean isRectangle() {
        return setX.size() == 2 && setY.size() == 2;
    }

    @Override
    public double calculate() {
        return area();
    }

    public double area() {
        return abs(getLength(setX) * getLength(setY));
    }

    private double getLength(Set setX) {
        Iterator<Integer> iter = setX.iterator();
        Integer next = iter.next();
        Integer next2 = iter.next();
        return next - next2;
    }


}
