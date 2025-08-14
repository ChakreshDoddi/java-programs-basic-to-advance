package in.kgcoding;

public class AccessTest {
    public static void main(String[] args) {
        Car car=new Car();
        car.color="Red";
        car.model="Swift";
        car.costOfPurchase=3000;
        System.out.println(car);
        Car newCar=new Car("Black","BMW",5,5000);
        System.out.println(newCar);
        Default def=new Default();
    }
}
