package in.kgcoding.challenge86;

public class Car extends Vehicle{
    Car(){
super();
    }
    @Override
    public void service() {
        super.service();
        System.out.println("Car service is starting....");
    }
}
