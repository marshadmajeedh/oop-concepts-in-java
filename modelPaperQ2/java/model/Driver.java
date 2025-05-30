package model;

public class Driver {
    private String name;
    private String licenseNumber;

    public Driver(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    public String toString() {
        return "Driver Name: " + name + "\nLicense Number: " + licenseNumber;
    }
}
