package flavours;

import interfaces.IPrepareDeliciously;

public class EggFlavour implements IPrepareDeliciously {

    @Override
    public void addFlavour(){
        System.out.println("Egg Flavour added");
    }

    @Override
    public double getCost(){
        return 15;
    }
}
