package view;

import domain.Point;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class OutputTest {

    public static final String BLANK = "    ";
    public static final String ORIGIN = "+";
    public static final String MARKER = "*";
    public static final String HORIZONTAL_AXIS = "----";
    public static final String VERTICAL_AXIS = "|";

    @Test
    void resultPrint() {
        List<Point> points = Arrays.asList(new Point(1, 1),new Point(2, 2), new Point(3, 3), new Point(4, 4),
                new Point(5, 5),new Point(6, 6));

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
