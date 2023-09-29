package domain;

import Service.CoordinateService;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.*;


public class LineTest {

    @Test
    void line() {
//        Point point1 = new Point(1, 3);
//        Point point2 = new Point(4, 6);
//        ArrayList<Point> points = new ArrayList<>();
//        points.add(point1);
//        points.add(point2);
        String[] strings = {"1,3","4,6"};
        Shape line = CoordinateService.createShape(strings);
        assertThat(line.calculate()).isEqualTo(4.2,offset(0.00099));
    }
}
