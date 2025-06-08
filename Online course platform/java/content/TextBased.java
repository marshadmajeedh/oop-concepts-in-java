package content;

import interfaces.IContentDelivery;

public class TextBased implements IContentDelivery {
    @Override
    public void deliveryContent() {
        System.out.println("content will be delivery as  text based.");
    }

    @Override
    public double getCost() {
        return 500;
    }
}
