package controller;

import service.CoordinateService;
import view.InputView;
import view.ResultView;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<String[]> coordinates = InputView.getCoordinates();
        CoordinateService coordinateService = new CoordinateService(coordinates);
        double result = coordinateService.calculate();
        ResultView.print(coordinates, result);
    }
}
