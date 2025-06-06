package flavours;

import interfaces.IPrepareDeliciously;

public class FishFlavour implements IPrepareDeliciously {

    @Override
    public void addFlavour(){
        System.out.println("Fish Flavour added");
    }

    @Override
    public double getCost(){
        return 20;
    }
}
