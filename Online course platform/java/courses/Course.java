package courses;

import interfaces.IContentDelivery;
import interfaces.ILearningMode;

public abstract class Course {

    private IContentDelivery delivery;
    private ILearningMode learningMode;

    public void setLearningMode(ILearningMode learningMode) {
        this.learningMode = learningMode;
    }

    public void setContentDelivery(IContentDelivery delivery) {
        this.delivery = delivery;
    }
    public void courseWithContent() {

        if (learningMode != null) {
            delivery.deliveryContent();
            System.out.println ("Content cost : "+delivery.getCost());
        }
    }

    public void courseInSchedule() {
        if (learningMode != null) {
            learningMode.scheduleDelivery();
        }
    }

    public abstract void displayCost();
    public abstract void displayCourse();

}
