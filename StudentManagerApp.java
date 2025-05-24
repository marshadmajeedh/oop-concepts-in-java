import java.util.*;
class Student {
	
	private String name;
	private int studentID;
	private int age;
	private String major;
	private double gpa;
	
	public Student (int studentID, String name, int age, String major,double gpa) {
		
		this.studentID = studentID;
		this.name = name;
		this.age = age;
		this.major = major;
		this.gpa = gpa;
		
	}
	
	public Student() {
		
		this.studentID = 0;
		this.name = "Unassigned";
		this.age = 0;
		this.major = "Unassigned";
		this.gpa = 0;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public int getID() {
		
		return studentID;
		
	}
	
	public String getMajor() {
		
		return major;
		
	}
	
	public int getAge() {
		
		return age;
		
	}
	
	public double getGPA() {
		
		return gpa;
		
	}
	
	public void updateGPA (double newGpa) {
		
		this.gpa = newGpa;
		
	}
	
	public void displayStudentDetails() {
		
		System.out.println ("Student ID -> "+studentID);
		System.out.println ("Student name -> "+name);
		System.out.println ("Student age -> "+age);
		System.out.println ("Student major -> "+major);
		System.out.println ("Student gpa -> "+gpa);
	}
	
}

class StudentManager {
	
	ArrayList<Student>studentList;
	
	public StudentManager () {
		
		this.studentList = new ArrayList<>();
		
	}
	
	public void addStudent (Student student) {
		
		studentList.add(student);
		System.out.println ("Student with ID : "+student.getID()+", added to the list");
		
	}
	
	public void searchStudent (int studentID) {
		
		System.out.println ("\nSearching for a student by their ID and displaying their details : ");
		for (Student s : studentList) {
			
			if (s.getID() == studentID) {
				
				s.displayStudentDetails();
				return;
				
			}
			
		}
		
		System.out.println ("Given student ID "+studentID+", has not found in the list");
		
	}
	
	public void updateStudentGPA (int studentID, double newGpa) {
		
		System.out.println ("\nUpdating gpa : ");
		for (Student s : studentList) {
			
			if (s.getID() == studentID) {
				
				s.updateGPA(newGpa);
				System.out.println ("1) Gpa has been updated to - "+newGpa);
				return;
				
			}
			
		}
		
		System.out.println ("1) Given student ID "+studentID+", has not found in the list");
		
	}
	
	public void displayAllStudentDetails() {
		
		System.out.println ("\nDisplying Student list :"+"\n");
		for (Student s : studentList) {
			
			s.displayStudentDetails();
			System.out.println();
			
		}
		
	}
	
}

public class StudentManagerApp {
	public static void main (String...args) {
		
		StudentManager sm = new StudentManager();
		
		Student st1 = new Student(1,"Marshad",20,"Information Technology",3.17);
		Student st2 = new Student(2,"Mohamed",21,"CS",3.20);
		Student st3 = new Student(3,"Shilmy",22,"ENG",3.30);
		Student st4 = new Student(4,"Ilahm",23,"Business",3.45);
		Student st5 = new Student(5,"Aqeel",24,"CS",3.60);
		
		sm.addStudent(st1);
		sm.addStudent(st2);
		sm.addStudent(st3);
		sm.addStudent(st4);
		sm.addStudent(st5);
		System.out.println();
		
		sm.searchStudent(4);
		sm.updateStudentGPA(3,3.70);
		sm.displayAllStudentDetails();
		
	}
	
}