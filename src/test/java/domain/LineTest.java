package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import view.InputView;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class LineTest {

    @Test
    void Line생성시_유효하지않은_입력시_오류발생() {
        String string = "(10,20)-(1,2)-(3,4)";
        List<String[]> numbers = InputView.convert(string);
        assertThatThrownBy( () -> new Line(numbers)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("Line의 길이를 구하는 함수")
    void length() {
        String string = "(1,2)-(4,5)";
        List<String[]> numbers = InputView.convert(string);
        Line line = new Line(numbers);
        assertThat(line.length()).isEqualTo(4.2426,offset(0.00099));
    }

}
