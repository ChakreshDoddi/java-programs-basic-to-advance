package in.knowledgegate;

import in.gettersetter.Car;

public class GetterTest {
    public static void main(String[] args) {
        Car car=new Car("Red","Maruti",3,8000);
        car.setColor("Blue");
        System.out.printf("%S %S",car.getColor(),car.getModel());
    }
}
