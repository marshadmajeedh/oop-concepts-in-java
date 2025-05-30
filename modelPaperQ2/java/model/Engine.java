package model;

public class Engine {
    private String engineType;

    public Engine(String engineType) {
        this.engineType = engineType;
    }

    public String toString() {
        return "Engine Type: " + engineType;
    }
}
