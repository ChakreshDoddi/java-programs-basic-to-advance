public class Driver {
    public static void main(String[] args) {
        Car myCar=new Car("RED");
        Car thar=new Car();
        myCar.start().drive();
        System.out.println(myCar.color);

    }
}
