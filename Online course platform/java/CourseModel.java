import content.Interactive;
import courses.Course;
import courses.FullCourse;
import modes.HybridMode;

public class CourseModel {
    public static void main(String[] args) {

        Course c1 = new FullCourse();
        c1.setLearningMode(new HybridMode());
        c1.setContentDelivery(new Interactive());
        c1.displayCourse();
        c1.courseWithContent();
        c1.courseInSchedule();
        c1.displayCost();

    }
}
