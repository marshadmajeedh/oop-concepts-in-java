// Aggregation practice - A University has many Courses (HAS-A relationship)
import java.util.*;

class Course {
	
	private String courseName;
	private String courseCode; // Example: IT1030
	private String instructor;
	
	// Constructor to initialize course details
	public Course(String courseName, String courseCode, String instructor) {
		
		setCourseName(courseName);
		setCourseCode(courseCode);
		setInstructor(instructor);
	}
	
	// Setter for course name with validation
	public void setCourseName(String courseName) {
		
		if (courseName == null || courseName.trim().isEmpty()) {
			
			System.out.println("Course name cannot be empty!");
			
		} else {
			
			this.courseName = courseName;
			
		}
		
	}
	
	// Setter for course code with validation
	public void setCourseCode(String courseCode) {
		
		if (courseCode == null || courseCode.trim().isEmpty()) {
			
			System.out.println("Course code cannot be empty!");
			
		} else {
			
			this.courseCode = courseCode;
		}
		
	}
	
	// Setter for instructor name with validation
	public void setInstructor(String instructor) {
		
		if (instructor == null || instructor.trim().isEmpty()) {
			
			System.out.println("Instructor name cannot be empty!");
			
		} else {
			
			this.instructor = instructor;
			
		}
	}
	
	// Getter for course name
	public String getCourseName() {
		
		return courseName;
		
	}
	
	// Getter for course code
	public String getCourseCode() {
		
		return courseCode;
		
	}
	
	// Getter for instructor
	public String getInstructor() {
		
		return instructor;
		
	}
	
	// Display course details
	public void displayCourseDetails() {
		
		System.out.println("Course's name       : " + courseName);
		System.out.println("Course's code       : " + courseCode);
		System.out.println("Course's instructor : " + instructor);
		
	}
	
}

class University {
	
	private ArrayList<Course> courses;
	
	// Constructor accepts list of courses (aggregation)
	public University(ArrayList<Course> courses) {
		
		this.courses = courses;
		
	}
	
	// Method to add a course to the university
	public void addCourses(String courseName, String courseCode, String instructor) {
		
		courses.add(new Course(courseName, courseCode, instructor));
		
	}
	
	// Method to search for a course by name
	public boolean searchCourse(String courseName) {
		
		for (Course course : courses) {
			
			if (courseName.equalsIgnoreCase(course.getCourseName())) {
				
				return true;
				
			}
			
		}
		
		return false;
		
	}
	
	// Method to remove a course using its code
	public void removeCourse(String courseCode) {
		
		for (Course course : courses) {
			
			if (courseCode.equalsIgnoreCase(course.getCourseCode())) {
				
				courses.remove(course); // Unsafe in loop, but simple for now
				break;
				
			}
			
		}
		
	}
	
	// Get total number of courses in the university
	public int getTotalCourses() {
		
		return courses.size(); // cleaner than manually counting
		
	}
	
	// Display all course details
	public void displayAllCourses() {
		
		for (Course course : courses) {
			
			course.displayCourseDetails();
			System.out.println(); // spacing between courses
			
		}
	}
}

public class MainAggOne {
	
	public static void main(String... args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Course> courses = new ArrayList<Course>();
		
		String continueProgram;

		// Step 1: Take user input to create initial course list
		do {
			System.out.print("Enter course name : ");
			String courseName = sc.nextLine();

			System.out.print("Enter course code : ");
			String courseCode = sc.nextLine();

			System.out.print("Enter course instructor name : ");
			String instructor = sc.nextLine();

			// Create course and add to list
			Course course = new Course(courseName, courseCode, instructor);
			courses.add(course);

			System.out.println();
			
			System.out.print("Do you want to add more courses (y/n) : ");
			continueProgram = sc.next();
			sc.nextLine(); // consume newline

		} while (continueProgram.equalsIgnoreCase("y"));

		System.out.println("__________________________");

		// Step 2: Create university and pass course list (aggregation)
		University uni = new University(courses);

		// Step 3: Optional - Add more courses directly using University class
		System.out.print("Do you want to add more courses (y/n) : ");
		String choice = sc.next();
		sc.nextLine();

		if (choice.equalsIgnoreCase("y")) {
			
			System.out.print("Enter course name : ");
			String courseName = sc.nextLine();

			System.out.print("Enter course code : ");
			String courseCode = sc.nextLine();

			System.out.print("Enter course instructor name : ");
			String instructor = sc.nextLine();

			uni.addCourses(courseName, courseCode, instructor);
			System.out.println();
			
		}

		// Display all courses
		uni.displayAllCourses();
		System.out.println();

		// Step 4: Search for course by name
		System.out.print("Do you want to enroll for courses (y/n) : ");
		String choice1 = sc.next();
		sc.nextLine();

		if (choice1.equalsIgnoreCase("y")) {
			
			System.out.println("Enter course name : ");
			String courseName = sc.nextLine();

			System.out.println("The entered course is : " + (uni.searchCourse(courseName) ? "Valid" : "Invalid"));
			
		} else {
			
			uni.displayAllCourses();
			
		}

		System.out.println();

		// Step 5: Option to remove a course by its code
		System.out.println("Do you want to remove courses (y/n) : ");
		String choice2 = sc.next();
		sc.nextLine();

		if (choice2.equalsIgnoreCase("y")) {
			
			System.out.print("Enter course code : ");
			String courseCode = sc.nextLine();

			uni.removeCourse(courseCode);
			
		} else {
			
			uni.displayAllCourses();
			
		}

		// Final display of all courses and total count
		uni.displayAllCourses();
		System.out.println();
		System.out.println("Total courses in this university : " + uni.getTotalCourses());
		
	}
}

			
			
		
			
			
			
	
	
		
	