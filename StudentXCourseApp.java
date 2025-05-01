import java.util.*;
class Course {
	
	private String courseName;
	private String courseCode;
	private String instructor;
	
	public Course (String cn, String cc, String i) {
		
		this.courseName = cn;
		this.courseCode = cc;
		this.instructor = i;
		
	}
	
	public String getCName() {
		
		return courseName;
		
	}
	
	public String getCCode() {
		
		return courseCode;
		
	}
	
	public String getI() {
		
		return instructor;
		
	}
	
	public String toString() {
		
		return "Course name : "+courseName+"\n"+
				"Course code : "+courseCode+"\n"+
				"Course instructor : "+instructor;
				
	}
	
}

class Student {
	
	private final ArrayList<Course>courses;
	private String name;
	private String stID;
	
	public Student(String n, String ID) {
		
		this.name = n;
		this.stID = ID;
		this.courses = new ArrayList<>();
		
	}
	
	public void addCourse(Course c) {
		
		courses.add(c);
		
	}
	
	public Course removeCourseByCode (String code) {
		
		for (Course c : courses) {
			
			if (c.getCCode().equalsIgnoreCase(code)) {
				
				courses.remove(c);
				return c;
				
			}
			
		}
		
		return null;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public String toString() {
		
		return "["+stID+"]"+" - "+name;
		
	}
	
	public void displayCourses() {
		
		for (int i = 0; i < courses.size(); i++) {
			
			System.out.println (courses.get(i));
			System.out.println();
			
		}
		System.out.println ("|||||||||||||||||||||");
		
	}
	
}

public class StudentXCourseApp {
	public static void main (String...args) {
		
		Course c1 = new Course("IT","IT1","Samali");
		Course c2 = new Course("ENG","IT2","amali");
		Course c3 = new Course("BUSS","IT3","mali");
		
		Student st = new Student("Marshad","IT 24 102 580");
		
		st.addCourse(c1);
		st.addCourse(c2);
		st.addCourse(c3);
		
		System.out.println (st+" has enrolled to these courses : ");
		System.out.println();
		st.displayCourses();
		System.out.println();
		Course remove = st.removeCourseByCode("IT2");
		
		if (remove != null) {
			
			System.out.println ("Removed from the enrolled list : ");
			System.out.println (remove);
			System.out.println();
			
		} else {
			
			System.out.println ("Given course code is invalid");
			
		}
		
		System.out.println ("Remaining courses ->");
		st.displayCourses();
		
	}
	
}
		
				
				
	
	