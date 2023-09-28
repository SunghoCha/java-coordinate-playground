package rentcar;

public class Sonata extends Car {

    private static final double DistancePerLiter = 10;
    private double tripDistance;
    private String carName;

    public Sonata(double tripDistance) {
        this.tripDistance = tripDistance;
        this.carName = "Sonata";
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
        return "Sonata";
    }
}
