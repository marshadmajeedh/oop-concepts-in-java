package A;

public class Grape implements IFruit {
    private String country;
    private String color;

    public Grape(String country, String color) {
        this.country = country;
        this.color = color;
    }

    @Override
    public String displayFruitDetails() {

        return "The Grapes Imported from = "+country+", and the color : "+color;

    }

}
