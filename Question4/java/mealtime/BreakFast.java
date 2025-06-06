package mealtime;

public class BreakFast extends Meal {

    @Override
    public void displayMeal(){
        System.out.println("Preparing Breakfast");

    }

    @Override
    public void displayCost(){
        System.out.println("Cost for the meal is : "+50);
    }
}
