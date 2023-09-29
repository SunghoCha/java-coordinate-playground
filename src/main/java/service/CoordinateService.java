package service;

import domain.Line;
import domain.Shape;
import domain.Square;

import java.util.List;

public class CoordinateService {
    private Shape shape;

    public CoordinateService(List<String[]> strings) {
        if (strings.size() == 2){
            this.shape = new Line(strings);
        }
        if (strings.size() == 4){
            this.shape = new Square(strings);
        }
    }

    public double calculate() {
        return shape.calculate();
    }
}
