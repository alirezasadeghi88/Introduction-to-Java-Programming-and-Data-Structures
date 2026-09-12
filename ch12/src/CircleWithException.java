public class CircleWithException {
    private double radius;
    private static int numberOfObjects = 0;

    public CircleWithException() {
        this(1.0);
    }

    public CircleWithException(double newRadius) {
        setRadius(newRadius);
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }
}
