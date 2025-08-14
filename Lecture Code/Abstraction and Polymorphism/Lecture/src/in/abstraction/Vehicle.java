package in.abstraction;

public abstract class Vehicle implements Transport{
    private int noOfTires;

    public Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }
public abstract void makeStartSound();
    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }
    public void commute(){
        System.out.println("Vehicle is going");
    }
    public void getSetGo() {
        System.out.println("Going to place.....");
    }

}
