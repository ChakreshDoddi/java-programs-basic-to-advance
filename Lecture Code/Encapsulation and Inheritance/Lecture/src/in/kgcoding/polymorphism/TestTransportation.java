package in.kgcoding.polymorphism;

public class TestTransportation {
    public static void main(String[] args) {
        Car c=new Car();
        Vehicle v=new Vehicle();
        castTest(c);
        castTest(v);
    }
    public static void castTest(Vehicle veh){
        Car cvehicle=(Car)veh;
        cvehicle.noOfDoors();
        cvehicle.start();
    }
}
