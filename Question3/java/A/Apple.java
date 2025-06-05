package A;

public class Apple implements IFruit {
    private String country;
    private double price;

    public Apple(String country, double price) {
        this.country = country;
        this.price = price;
    }

    @Override
    public String displayFruitDetails() {

        return "The A.Apple Imported from = "+country+", Price in LKR : "+price;
    }

}
