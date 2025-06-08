package content;

import interfaces.IContentDelivery;

public class Interactive implements IContentDelivery {

    @Override
    public void deliveryContent() {
        System.out.println("content will be delivery as interactive.");
    }

    @Override
    public double getCost() {
        return 1500;
    }
}
