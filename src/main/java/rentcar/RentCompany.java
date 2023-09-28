package rentcar;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {

    private static final String NEWLINE = System.getProperty("line.separator");
    private final List<Car> cars = new ArrayList<>();

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car rentCar) {
        cars.add(rentCar);
    }

    public String generateReport() {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car).append(" : ").append((int)car.getChargeQuantity()).append("리터").append(NEWLINE);
        }
        return sb.toString();
    }
}
