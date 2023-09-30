package domain;

import org.junit.jupiter.api.Test;
import view.InputView;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.*;

public class TriangleTest {

    @Test
    void 중복좌표_입력시_오류발생() {
        String string = "(1,2)-(1,2)-(5,6)";
        List<String[]> pointStrings = InputView.convert(string);
        assertThatThrownBy(() -> new Triangle(pointStrings)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void sdf() {
        String string = "(0,0)-(0,4)-(4,0)";
        List<String[]> pointStrings = InputView.convert(string);
        Triangle triangle = new Triangle(pointStrings);
        double result = triangle.calculate();
        System.out.println("result = " + result);
    }

}
