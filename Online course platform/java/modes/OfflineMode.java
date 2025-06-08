package modes;

import interfaces.ILearningMode;

public class OfflineMode implements ILearningMode {
    @Override
    public void scheduleDelivery(){
        System.out.println("Learning mode as offline");
    }
}
