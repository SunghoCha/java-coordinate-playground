package rentcar;

public class K5 extends Car {

    private static final double DistancePerLiter = 13;
    private double tripDistance;
    private String carName;

    public K5(double tripDistance) {
        this.tripDistance = tripDistance;
        this.carName = "K5";
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
        return "K5";
    }
}
