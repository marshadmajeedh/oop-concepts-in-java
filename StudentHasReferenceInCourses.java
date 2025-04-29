class Course {
	
	private String courseCode;
	private String courseTitle;
	
	public Course(String courseCode, String courseTitle) {
		
		this.courseCode = courseCode;
		this.courseTitle = courseTitle;
		
	}
	
	public Course() {
		
		this.courseCode = "IT000";
		this.courseTitle = "Unassigned";
		
	}
	
	public void displayCourseDetails() {
		
		System.out.println ("Course code : "+courseCode);
		System.out.println ("Course title : "+courseTitle);
		
	}
	
}

class Student {
	
	private String stID;
	private String stName;
	private Course[] courses;
	private int trackCourse;
	
	public Student (String stID, String stName) {
		
		this.stID = stID;
		this.stName = stName;
		this.courses = new Course[3];
		this.trackCourse = 0;
		
	}
	
	public Student() {
		
		this.stID = "IT00000000";
		this.stName = "Unknown";
	
	}
	
	public void enrollCourse(Course course) {
		
		if (trackCourse < courses.length) {
			
			courses[trackCourse++] = course;
			
		} else {
			
			System.out.println ("Each student can only enroll to 3 courses");
			
		}
		
	}
	
	public void displayStudentDetails() {
		
		System.out.println ("Student ID : "+stID);
		System.out.println ("Student name : "+stName);
		System.out.println ("\nEntrolled courses -->");
		for (int i = 0; i <= trackCourse; i++) {
			
			courses[i].displayCourseDetails();
			System.out.println();
			
		}
		
	}
	
}

public class StudentHasReferenceInCourses {
	
	public static void main (String...args) {

		Course c1 = new Course("IT1010","Descrete mathametics");
		Course c2 = new Course("IT1020","Object oriented programming");
		Course c3 = new Course("IT1030","Data structure and algorithms");
		
		Student st1 = new Student ("IT 24 102 580", "Ahamed A.M.M",courses);
		
		st1.enrollCourse(c1);		
		st1.enrollCourse(c2);		
		st1.enrollCourse(c3);

		st1.displayStudentDetails();
		
	}
	
}
		
	
	
	