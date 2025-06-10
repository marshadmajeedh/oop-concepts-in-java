import java.io.File;

public class StudentSaver {

    public void save (Student student) {

        System.out.println ("Student details saving");
        System.out.println ("Student ID: " + student.getStudentID());
        System.out.println("Student name: " + student.getName());
        System.out.println ("Student age: " + student.getAge());
        System.out.println("Student details saved successfully");
        System.out.println ("____________________________________");
    }
}
