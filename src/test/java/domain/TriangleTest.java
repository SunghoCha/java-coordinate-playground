package domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import view.InputView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.*;

public class TriangleTest {

    @Test
    void 중복좌표_입력시_오류발생() {
        List<Point> points = Arrays.asList(new Point(1,2), new Point(1,2), new Point(5,6));
        //then
        assertThatThrownBy(() -> new Triangle(points)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 삼각형_넓이_게산() {
        List<Point> points = Arrays.asList(new Point(1,1), new Point(1,5), new Point(5,1));
        Triangle triangle = new Triangle(points);
        double result = triangle.calculate();
        //then
        assertThat(result).isEqualTo(8, offset(0.00099));
    }
}
