package model;

public class Vehicle {
    protected String brand;
    protected double speed;
    private final Engine engine;
    private Driver driver;

    public Vehicle(String brand, double speed, Engine engine) {
        this.brand = brand;
        this.speed = speed;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Vehicle is starting");
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    public String toString() {
        return "Brand: " + brand + "\nSpeed: " + speed+"\n"+
                engine.toString()+"\n"+
                driver.toString();
    }

}
