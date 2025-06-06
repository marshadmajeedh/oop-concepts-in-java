package durations;

import interfaces.IPrepareQuickly;

public class FourtyFiveMinutes implements IPrepareQuickly {

    @Override
    public void deliveryTime(){
        System.out.println("Meal will be prepare in Fourty Five Minutes");
    }
}
