package durations;

import interfaces.IPrepareQuickly;

public class ThirtyMinutes implements IPrepareQuickly {

    @Override
    public void deliveryTime(){
        System.out.println("Meal will be prepare in Thirty minutes");
    }
}
