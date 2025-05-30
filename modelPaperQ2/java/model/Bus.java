package model;

public class Bus extends Vehicle{

    public Bus(String brand, double speed,Engine engine) {
        super(brand, speed,engine);
    }

    @Override
    public void start() {
        System.out.println("Bus is starting");
    }

    @Override
    public String toString() {
        return super.toString() ;

    }

}
