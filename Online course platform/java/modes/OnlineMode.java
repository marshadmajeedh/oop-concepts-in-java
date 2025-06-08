package modes;

import interfaces.ILearningMode;

public class OnlineMode implements ILearningMode {

    @Override
    public void scheduleDelivery(){
        System.out.println("Learning mode as online");
    }
}
