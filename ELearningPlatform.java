import java.util.*;
interface Enrollable {
	
	void enrollCourse(String courseName);
	
}

interface Teachable {
	
	void assignCourse(String courseName);
	
}

class Student implements Enrollable {
	
	private ArrayList<String> courses;
	private String name;
	
	public Student (String name) {
		
		this.courses = new ArrayList<>();
		this.name = name;
	
	}
	
	@Override
	public void enrollCourse(String courseName) {
		
		courses.add(courseName);
		
	}
	
	public void displayEnrolledCourses() {
		
		int count = 0;
		
		for (String s : courses) {
			
			count++;
			
			System.out.println (count+") "+s);
			
		}
		
		System.out.println();
	}
	
	public String getName() {
		
		return name;
		
	}
	
}

class Instructor implements Enrollable,Teachable {
	
	private ArrayList<String> instEnrCourses;
	private ArrayList<String> instAssCourses;
	private String name;
	
	public Instructor(String name) {
		
		this.instEnrCourses = new ArrayList<>();
		this.instAssCourses = new ArrayList<>();
		this.name = name;
	}
	
	@Override
	public void enrollCourse (String courseName) {
		
		instEnrCourses.add(courseName);
		
	}
	
	@Override
	public void assignCourse (String courseName) {
		
		instAssCourses.add(courseName);
		
	}
	
	public void displayEnrolledCourses() {
		
		int count = 0;
		
		for (String c : instEnrCourses) {
			
			count++;
			System.out.println(count+") "+c);
			
		}
		
		System.out.println();
		
	}
	
	public void displayAssignedCourses() {
		
		int count = 0;
		
		for (String c : instAssCourses) {
			
			count++;
			System.out.println(count+") "+c);
			
		}
		
		System.out.println();
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
}

public class ELearningPlatform {
	public static void main (String...args) {
		
		Student st = new Student("Marshad");
	
		st.enrollCourse("IT");
		st.enrollCourse("Networking");
		st.enrollCourse("Trouble shooting");
		
		Instructor ins = new Instructor("Ramzan");
		
		ins.enrollCourse("Business");
		ins.enrollCourse("Statistics");
		ins.enrollCourse("Math");
		
		ins.assignCourse("DM");
		ins.assignCourse("OOP");
		ins.assignCourse("DSA");
		
		System.out.println(st.getName()+" has been enrolled to these courses : ");
		st.displayEnrolledCourses();
		
		System.out.println(ins.getName()+" has been enrolled to these courses : ");
		ins.displayEnrolledCourses();
		
		System.out.println(ins.getName()+" has been assigned to these courses : ");
		ins.displayAssignedCourses();
		
	}
	
}
		
		