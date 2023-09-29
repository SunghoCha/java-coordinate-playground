package view;

import domain.Line;
import domain.Square;

import java.util.List;

public class ResultView {

    public static void print(List<String[]> coordinates, double result) {

        if (isLine(coordinates)){
            System.out.printf("두 점 사이 거리는 %f",  result);
        }
        if (isSquare(coordinates)){
            System.out.printf("사각형 넓이는 %s", (int) result);
        }
    }

    private static boolean isSquare(List<String[]> coordinates) {
        return hasFourPoints(coordinates);
    }

    private static boolean isLine(List<String[]> coordinates) {
        return hasTwoPoints(coordinates);
    }

    private static boolean hasTwoPoints(List<String[]> coordinates) {
        return coordinates.size() == 2;
    }

    private static boolean hasFourPoints(List<String[]> coordinates) {
        return coordinates.size() == 4;
    }
}
