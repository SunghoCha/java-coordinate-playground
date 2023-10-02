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
        assertThatThrownBy(() -> new Point(1,25)).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Point(-1, 2)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("두 point간 거리 계산 함수")
    void calculateDistance() {
        Point point = new Point(1,2);
        Point point2 = new Point(4,5);
        //then
        assertThat(point.calculateDistance(point2)).isEqualTo(4.2426, offset(0.00099));
    }
}
