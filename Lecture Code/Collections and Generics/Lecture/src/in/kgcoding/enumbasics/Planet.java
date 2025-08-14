package in.kgcoding.enumbasics;

public enum Planet {
    EARTH(5.97e24, 6.37e6),
    VENUS(4.87e24, 6.05e6),
    MERCURY(3.30e23, 2.44e6);
    private final double radius;
    private final double mass;
    private static final double G = 6.674e-11;
    Planet(double mass,double radius){
        this.mass=mass;
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }

    public double getMass() {
        return mass;
    }
    public double surfaceGravity(){
        return G*mass/(radius*radius);
    }
}
