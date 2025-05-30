package model;

public class Truck extends Vehicle {

    public Truck(String brand, double speed, Engine engine) {
        super(brand, speed,engine);
    }

    @Override
    public void start() {
        System.out.println("Truck is starting");
    }

    @Override
    public String toString() {
        return super.toString() ;
    }
}
