public class Student {
    private String name;
    private String studentID;
    private int age;

    public Student(String name, String studentID, int age) {
        this.name = name;
        this.studentID = studentID;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getStudentID() {
        return studentID;
    }

    public int getAge() {
        return age;
    }

}
