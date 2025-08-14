package in.kgcoding.enumbasics;

public class TestPlanetEnum {
    public static void main(String[] args) {
        double g=Planet.EARTH.surfaceGravity();
        System.out.println("Earth Gravity is: "+g);
    }
}
