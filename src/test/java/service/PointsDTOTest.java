package service;

import domain.Point;
import domain.Triangle;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class PointsDTOTest {

    @Test
    void DTO생성테스트() {
        List<Point> points = Arrays.asList(new Point(1, 1), new Point(1, 5), new Point(5, 1));
        Triangle triangle = new Triangle(points);
        ShapeDTO shapeDTO = ShapeDTO.from(triangle);
        List<Point> pointsDTO = shapeDTO.getPoints();

        assertThat(pointsDTO.size()).isEqualTo(3);
        assertThat(pointsDTO.get(0)).isEqualTo(new Point(1,1));

    };
}
