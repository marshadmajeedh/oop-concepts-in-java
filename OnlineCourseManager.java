import java.util.*;
class User {
	
	protected String name;
	protected String email;
	
	public User (String name, String email) {
		
		this.name = name;
		this.email = email;
		
	}
	
	public void loggenIn() {
		
		System.out.println ("User "+name+" has logged in.");
		
	}
	
	public void loggenOut() {
		
		System.out.println ("User "+name+" has logged out.");
		
	}
	
}

class Instructor extends User {
	
	private ArrayList<String>coursesTaugth;
	
	
	public Instructor(String name, String email,ArrayList<String>coursesTaugth) {
		
		super(name,email);
		this.coursesTaugth = coursesTaugth;
		
	}
	
	public void addCourse(String coursesName) {
		
		coursesTaugth.add(coursesName);
		
	}
	
	@Override
	public void loggenIn() {
		
		System.out.println ("User "+name+" has logged in.");
		
	}
	
	@Override
	public void loggenOut() {
		
		System.out.println ("User "+name+" has logged out.");
		
	}
	
	public void displayCourses() {
		
		int count = 0;
		
		for (String st : coursesTaugth) {
			
			count++;
			System.out.println(count+")"+"course : "+st);
			
		}
		
	}
	
	public void interact() {
		
		System.out.println ("Instructor "+name+" is reviewing assignments.");
		
	}
	
}

class Student extends User {
	
	private List<String> coursesEnrolled;
	
	public Student (String name, String email, List<String> coursesEnrolled) {
		
		super(name,email);
		this.coursesEnrolled = coursesEnrolled;
		
	}
	
	@Override
	public void loggenIn() {
		
		System.out.println ("User "+name+" has logged in.");
		
	}
	
	@Override
	public void loggenOut() {
		
		System.out.println ("User "+name+" has logged out.");
		
	}
	
	public void enroll(String courseName) {
		
		coursesEnrolled.add(courseName);
		
	}
	
	public void displayCourses() {
		
		int count = 0;
		
		for (String st : coursesEnrolled) {
			
			count++;
			System.out.println (+count+")"+"enrolled to course  : "+st);
			
		}
		
	}
	
	public void interact() {
		
		System.out.println ("Student "+name+" is watching lectures.");
		
	}
		
}

public class OnlineCourseManager {
	
	public static void main (String...args) {
		
		
	ArrayList<String>coursesTaugth = new ArrayList<>();
	ArrayList<String>coursesEnrolled =  new ArrayList<>();
	
	Instructor instructor1 = new Instructor ("Chat gpt","Chatgpt@goodinstructor.com",coursesTaugth);
	
	ArrayList<User>users = new ArrayList<>();
	
	instructor1.addCourse("good");
	instructor1.addCourse("bad");
	instructor1.addCourse("ugly");
	
	Student student1 = new Student ("Marshad","marshadAhamedh@gmail.com",coursesEnrolled);
	
	student1.enroll("ugly");
	student1.enroll("bad");
	student1.enroll("good");
	
	users.add(instructor1);
	users.add(student1);
	
	for (User user : users) {
		
		user.loggenIn();
		
		if (user instanceof Instructor) {
			
			((Instructor)user).interact();
			((Instructor)user).displayCourses();
			
		}
		
		if (user instanceof Student) {
			
			((Student)user).interact();
			((Student)user).displayCourses();
			
		}
		
		user.loggenOut();
		System.out.println();
		
	}
	
	}
	
}