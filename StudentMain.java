class Student {
	
	private String stID;//student id
	private String name;
	static String universityName;
	
	public Student (String stID, String name) {
		
		this.stID = stID;
		this.name = name;

	}
	
	
	public void displayStudentInfo() {
		
		System.out.println ("Student ID : "+stID);
		System.out.println ("Student name : "+name);
		System.out.println ("Student university name : "+universityName);
		
	}
	
}

public class StudentMain {
	public static void main (String...args) {
		
		Student[] students = new Student[3];
		

		Student.universityName = "SLIIT";
		students[0] = new Student("IT24102580","Marshad");
		students[1] = new Student("IT23102580","arshad");
		students[2] = new Student("IT22102580","rshad");
		
		for (Student st : students) {
			
			st.displayStudentInfo();
			System.out.println();
		}
		
		Student.universityName = "RUHUNU";
		for (Student st : students) {
			
			st.displayStudentInfo();
			System.out.println();
		}
		
	}
	
}
		
		
		


	