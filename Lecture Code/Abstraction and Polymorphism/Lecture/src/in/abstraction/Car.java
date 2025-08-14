package in.abstraction;

import java.security.PrivateKey;

public class Car extends Vehicle{
    private int noOfDoors;
public Car(){
    super(4);
}


    @Override
    public void makeStartSound() {
        System.out.println("Vroomm........");
    }
}
