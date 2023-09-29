package controller;

import service.CoordinateService;
import view.InputView;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<String[]> coordinates = InputView.getCoordinates();
        CoordinateService coordinateService = new CoordinateService(coordinates);
        double result = coordinateService.calculate();
        System.out.printf("두 점 사이 거리는 %f",  result);
    }
}
