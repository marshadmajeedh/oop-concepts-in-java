package mealtime;

public class Dinner extends Meal {

    @Override
    public void displayMeal(){
        System.out.println("Preparing Dinner");
    }

    @Override
    public void displayCost(){
        System.out.println("Cost for the meal is : " +150);
    }
}
