package controller;

import service.CoordinateService;
import service.ShapeDTO;
import view.InputView;
import view.ResultView;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<String[]> coordinates = InputView.getCoordinates();
        CoordinateService coordinateService = new CoordinateService(coordinates);
        ShapeDTO result = coordinateService.getResult();

        ResultView.showCoordinatePlane(result);
        ResultView.showShapeInfo(result);
    }
}
