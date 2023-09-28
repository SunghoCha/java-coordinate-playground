package rentcar;

public class Avante extends Car {

    private static final double DistancePerLiter = 15;
    private double tripDistance;
    private String carName;

    public Avante(double tripDistance) {
        this.tripDistance = tripDistance;
        this.carName = "Avante";
    }

    @Override
    double getDistancePerLiter() {
        return DistancePerLiter;
    }

    @Override
    double getTripDistance() {
        return tripDistance;
    }

    @Override
    String getName() {
        return carName;
    }

    @Override
    public String toString() {
        return "Avante";
    }
}