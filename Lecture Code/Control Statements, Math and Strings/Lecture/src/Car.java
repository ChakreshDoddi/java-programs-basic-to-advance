import java.util.Objects;

public class Car {
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String carName;
    String modelNumber;
    String manufacturer;
    String company;

    public Car(int noOfDoors, String carName, String modelNumber, String manufacturer, String company, int maxSpeed, int noOfWheels) {
        this.noOfDoors = noOfDoors;
        this.carName = carName;
        this.modelNumber = modelNumber;
        this.manufacturer = manufacturer;
        this.company = company;
        this.maxSpeed = maxSpeed;
        this.noOfWheels = noOfWheels;
    }


    @Override
    public String toString() {
        return "Car{" +
                "noOfWheels=" + noOfWheels +
                ", noOfDoors=" + noOfDoors +
                ", maxSpeed=" + maxSpeed +
                ", carName='" + carName + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Car swift=new Car(4,"Swift","2019","Swift","Suzuki",120,4);
        System.out.println(swift);
    }
}
