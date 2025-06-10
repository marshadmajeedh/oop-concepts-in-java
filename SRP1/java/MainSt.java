public class MainSt {
    public static void main(String[] args) {

        Student st = new Student("Marshad","IT24102580",20);
        StudentPrinter sp = new StudentPrinter();
        sp.printStudentInfo(st);
        System.out.println();
        StudentSaver saver = new StudentSaver();
        saver.save(st);
    }
}
