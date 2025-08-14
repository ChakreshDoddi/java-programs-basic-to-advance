package in.kgcoding.customexceptions;

public class Temperature extends Exception {
    private double degrees;

    public Temperature(double degrees) {
        this.degrees = degrees;
    }

    @Override
    public String getMessage() {
        return "The temperature (" + degrees + "°C) isn't in the normal range.";
    }

    public double getDegrees() {
        return degrees;
    }

}
