package domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PointTest {

    @Test
    void coordinate생성() {
        Point point1 = new Point(1, 3);
        Point point2 = new Point(4, 6);
        assertThat(point2.calculateDistance(point1)).isEqualTo(4.2426,offset(0.00099));
    }


}
