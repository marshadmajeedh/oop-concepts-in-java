import model.*;

public class TransportApp {
    public static void main(String[] args) {

        Engine engine1 = new Engine ("Electric");
        Engine engine2 = new Engine ("Petrol");

        Driver driver1 = new Driver ("Marshad","200432203483");

        Vehicle[] vehicles = new Vehicle[2];

        vehicles[0] = new Bus("Yutong",160,engine1);
        vehicles[0].setDriver(driver1);

        vehicles[1] = new Truck("Mahindra",120,engine1);
        vehicles[1].setDriver(driver1);

        for (Vehicle v : vehicles) {
            v.start();
            System.out.println(v);
            System.out.println("---------------------------------------");

        }


    }
}
