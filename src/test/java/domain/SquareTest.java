package domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import view.InputView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class SquareTest {

    @Test
    void 사다리꼴좌표입력시_오류() {
        List<Point> points = Arrays.asList(new Point(1,3),new Point(10,21),
                new Point(4,3),new Point(4,5));
        //then
        assertThatThrownBy( () -> new Square(points)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 직사각형좌표입력시_면적계산() {
        List<Point> points = Arrays.asList(new Point(1,3),new Point(1,5),
                new Point(4,3),new Point(4,5));
        Square square = new Square(points);
        //then
        assertThat(square.area()).isEqualTo(6);
    }
}
