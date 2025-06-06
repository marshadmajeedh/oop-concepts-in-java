package mealtime;

import interfaces.IPrepareDeliciously;
import interfaces.IPrepareQuickly;

public abstract class Meal {

    private IPrepareQuickly prepareQuickly;
    private IPrepareDeliciously prepareDeliciously;

    public void setFlavour(IPrepareDeliciously prepareDeliciously) {

        this.prepareDeliciously = prepareDeliciously;

    }
    public void setDuration(IPrepareQuickly prepareQuickly) {

        this.prepareQuickly = prepareQuickly;
    }

    public void mealWithFlavour() {
        if (prepareDeliciously != null) {
            prepareDeliciously.addFlavour();
            System.out.println("Cost for the flvour is : "+prepareDeliciously.getCost());
        }
    }

    public void mealInDuration(){
        if (prepareQuickly != null) {
            prepareQuickly.deliveryTime();
        }
    }

    abstract public void displayMeal();
    abstract public void displayCost();

}
