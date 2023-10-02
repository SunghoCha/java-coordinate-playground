package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import view.InputView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.*;

public class LineTest {

    @Test
    void Line생성시_유효하지않은_입력시_오류발생() {
        List<Point> points = Arrays.asList(new Point(10, 20), new Point(1,2), new Point(3,4));
        //then
        assertThatThrownBy( () -> new Line(points)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("Line의 길이를 구하는 함수")
    void length() {
        List<Point> points = Arrays.asList(new Point(1,2), new Point(4,5));
        Line line = new Line(points);
        //then
        assertThat(line.length()).isEqualTo(4.2426,offset(0.00099));
    }
}
