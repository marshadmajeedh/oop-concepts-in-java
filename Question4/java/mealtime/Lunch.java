package mealtime;

public class Lunch extends Meal {

    @Override
    public void displayMeal(){
        System.out.println("Preparing Lunch");
    }

    @Override
    public void displayCost(){
        System.out.println("Cost for the meal is  : "+200);
    }
}
