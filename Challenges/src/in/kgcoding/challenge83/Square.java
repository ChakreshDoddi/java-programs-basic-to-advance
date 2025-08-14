package in.kgcoding.challenge83;

public class Square extends Shape{
    public float side;

    @Override
    public void calculateArea() {
        System.out.printf("Area of square with side %.2fcm is %.2f cm^2\n",side,side*side);
    }
}
