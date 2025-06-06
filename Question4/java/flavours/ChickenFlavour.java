package flavours;

import interfaces.IPrepareDeliciously;

public class ChickenFlavour implements IPrepareDeliciously {

    @Override
    public void addFlavour(){
        System.out.println ("Chicken Flavour added");
    }

    @Override
    public double getCost(){
        return 10;
    }
}
