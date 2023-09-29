package domain;

import org.junit.jupiter.api.Test;
import view.InputView;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class SquareTest {

    @Test
    void 사다리꼴좌표입력시_오류() {
        String string = "(1,2)-(4,5)-(5,6)-(7,8)";
        List<String[]> numbers = InputView.convert(string);
        assertThatThrownBy( () -> new Square(numbers)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 직사각형좌표입력시_면적계산() {
        String string = "(1,3)-(1,5)-(4,3)-(4,5)";
        List<String[]> numbers = InputView.convert(string);
        Square square = new Square(numbers);
        assertThat(square.area()).isEqualTo(6);
    }
}
