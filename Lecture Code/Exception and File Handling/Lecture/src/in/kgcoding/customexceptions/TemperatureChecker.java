package in.kgcoding.customexceptions;

public class TemperatureChecker {
        public static void checkTemperature(double temp) throws Temperature{
            if (temp < 0 || temp > 45) {
                throw new Temperature(temp);  // Custom exception thrown
            } else {
                System.out.println("Temperature is normal.");
            }
        }

    public static void main(String[] args) {

            try {
                TemperatureChecker.checkTemperature(50);
            } catch (Temperature e) {
                System.out.println("Exception caught: " + e.getMessage());
                System.out.println("Faulty temperature: " + e.getDegrees());
            }
        }
}
