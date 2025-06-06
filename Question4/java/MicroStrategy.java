import durations.FourtyFiveMinutes;
import durations.OneHour;
import durations.ThirtyMinutes;
import flavours.ChickenFlavour;
import flavours.EggFlavour;
import flavours.FishFlavour;
import mealtime.BreakFast;
import mealtime.Dinner;
import mealtime.Lunch;
import mealtime.Meal;

public class MicroStrategy {
    public static void main(String[] args) {

        Meal meal1 = new BreakFast();
        meal1.displayMeal();
        meal1.setFlavour(new ChickenFlavour());
        meal1.setDuration(new ThirtyMinutes());
        meal1.mealWithFlavour();
        meal1.mealInDuration();
        meal1.displayCost();
        System.out.println();

        //meal without flavour
        Meal meal4 = new BreakFast();
        meal4.displayMeal();
        meal4.setDuration(new ThirtyMinutes());
        meal4.mealInDuration();
        meal4.displayCost();
        System.out.println();

        Meal meal2 = new Lunch();
        meal2.displayMeal();
        meal2.setFlavour(new EggFlavour());
        meal2.setDuration(new FourtyFiveMinutes());
        meal2.mealWithFlavour();
        meal2.mealInDuration();
        meal2.displayCost();
        System.out.println();

        Meal meal3 = new Dinner();
        meal3.displayMeal();
        meal3.setFlavour(new FishFlavour());
        meal3.setDuration(new OneHour());
        meal3.mealWithFlavour();
        meal3.mealInDuration();
        meal3.displayCost();
    }
}
