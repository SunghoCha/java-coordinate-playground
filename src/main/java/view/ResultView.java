package view;

import domain.Point;
import service.ShapeDTO;

import java.util.List;

public class ResultView {
    public static final String BLANK = "    ";
    public static final String ORIGIN = "+";
    public static final String MARKER = "*";
    public static final String HORIZONTAL_AXIS = "----";
    public static final String VERTICAL_AXIS = "|";

    public static void showShapeInfo(ShapeDTO shapeDTO) {
        System.out.println(shapeDTO.getShapeInfo());
    }

    public static void showCoordinatePlane(ShapeDTO shapeDTO) {
        List<Point> points = shapeDTO.getPoints();

        showYAxisWithPoints(points);
        showXAxis();
        showXNumber();
    }

    private static void showYAxisWithPoints(List<Point> points) {
        for (int y = 24; y > 0; y--) {
            showAxisNumber(y);
            System.out.print(VERTICAL_AXIS);
            showPoints(points, y);
            emptyLine();
        }
    }

    private static void emptyLine() {
        System.out.println();
    }

    private static void showXNumber() {
        System.out.print(" ");
        for (int x = 0; x <= 24; x++) {
            showAxisNumber(x);
        }
        emptyLine();
    }

    private static void showXAxis() {
        System.out.print(BLANK + ORIGIN);
        for (int x = 1; x <= 24; x++) {
            System.out.print(HORIZONTAL_AXIS);
        }
        emptyLine();
    }

    private static void showPoints(List<Point> points, int y) {
        for (int x = 1; x <= 24; x++) {
            if (hasPoint(points, x, y)) {
                System.out.print(String.format("%4s", MARKER));
                continue;
            }
            System.out.print(BLANK);
        }
    }

    private static void showAxisNumber(int idx) {
        if (idx % 2 == 0) {
            System.out.printf("%4d", idx);
            return;
        }
        System.out.print(BLANK);
    }

    private static boolean hasPoint(List<Point> points, int x, int y) {
        return points.stream().anyMatch(point -> point.has(x, y));
    }
}
