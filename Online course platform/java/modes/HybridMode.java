package modes;

import interfaces.ILearningMode;

public class HybridMode implements ILearningMode {

    @Override
    public void scheduleDelivery(){
        System.out.println("Learning mode as Hybrid");
    }

}
