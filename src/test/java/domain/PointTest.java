package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static org.assertj.core.api.Assertions.*;

public class PointTest {

    @Test
    void 잘못된_좌표값_입력시_오류발생() {
        List<Integer> numbers = Arrays.asList(1,25);
        List<Integer> numbers2 = Arrays.asList(-1,2);
        assertThatThrownBy(() -> new Point(numbers)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Point(numbers2)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("두 point간 거리 계산 함수")
    void calculateDistance() {
        List<Integer> numbers = Arrays.asList(1,2);
        List<Integer> numbers2 = Arrays.asList(4,5);
        Point point = new Point(numbers);
        Point point2 = new Point(numbers2);
        assertThat(point.calculateDistance(point2)).isEqualTo(4.2426, offset(0.00099));
    }


}
