package in.kgcoding.challenge83;

public class Circle extends Shape {
    public float radius;

    @Override
    public void calculateArea() {
        double area=Math.PI*radius*radius;
        System.out.printf("Area of circle with radius %.2fcm is %.2f\n",radius,area);
    }
}
