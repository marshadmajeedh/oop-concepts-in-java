package content;

import interfaces.IContentDelivery;

public class VideoBased implements IContentDelivery {
    @Override
    public void deliveryContent() {
        System.out.println("content will be delivery as video based.");
    }
    @Override
    public double getCost() {
        return 1000;
    }
}
