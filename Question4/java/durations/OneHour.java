package durations;

import interfaces.IPrepareQuickly;

public class OneHour implements IPrepareQuickly {

    @Override
    public void deliveryTime(){
        System.out.println ("Meal will be prepare in Sixty minutes");
    }

}
