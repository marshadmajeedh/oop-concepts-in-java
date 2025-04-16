import java.util.*;
class Person {
	
	protected String name;
	protected String phoneNumber;
	
	public Person (String name, String phoneNumber) {
		
		this.name = name;
		this.phoneNumber = phoneNumber;
		
	}
	
	public void displayDetails() {
		
		System.out.println ("This person's name : "+name);
		System.out.println ("This person's phone number : "+phoneNumber);
		
	}
	
}

class Driver extends Person {
	
	private String vehicleType;
	private String licenseNumber;
	private ArrayList<String> completedRides;
	
	public Driver (String name,String phoneNumber,String vehicleType,String licenseNumber, ArrayList<String> completedRides) {
	
		super(name,phoneNumber);
		this.vehicleType = vehicleType;
		this.licenseNumber = licenseNumber;
		this.completedRides = completedRides;
		
	}
	
	public void addRide(String rideInfo) {
		
		completedRides.add(rideInfo);
		
	}
	
	@Override
	public void displayDetails() {
		
		super.displayDetails();
		System.out.println ("Vehicle type : "+vehicleType);
		System.out.println ("License number : "+licenseNumber);
		
	}
	
	public void displayRides() {
		
		int count = 0;

		for (String st : completedRides) {
			
			count++;
			System.out.println (count+")"+"ride info : "+st);
			
		}
 	
	}
	
}

class Passenger extends Person {
	
	private ArrayList<String> bookedRides;
	 
	public Passenger(String name, String phoneNumber,ArrayList<String> bookedRides) {
		 
		super(name,phoneNumber);
		this.bookedRides = bookedRides;
		 
	}
	
	public void bookRide(String rideInfo) {
		
		bookedRides.add(rideInfo);
		
	}

	public void displayRides() {
		
		int count = 0;
		
		for (String st : bookedRides) {
			
			count++;
			System.out.println (count+")"+"booked ride info : "+st);
		
		}
		
	}
}

public class RideSharingApp {
	
	public static void main (String...args) {
		
		ArrayList<String> completedRides = new ArrayList<>();
		ArrayList<String> bookedRides = new ArrayList<>();
	 
		Driver driver = new Driver ("driver","0000000","4X4","NC3536",completedRides);
		Passenger passenger = new Passenger ("passenger","1111111",bookedRides);
		
		ArrayList<Person>persons = new ArrayList<>();
		
		persons.add(driver);
		persons.add(passenger);
		
		for (Person person : persons) {
			
			if (person instanceof Driver) {
				
				((Driver)person).addRide("Jaffna");
				((Driver)person).addRide("Colombo");
				((Driver)person).addRide("Palastine");
				((Driver)person).displayDetails();
				((Driver)person).displayRides();
				System.out.println();
				
			}
			
			if (person instanceof Passenger) {
				
				((Passenger)person).bookRide("Jaffna");
				((Passenger)person).bookRide("Colombo");
				((Passenger)person).bookRide("Palastine");
				((Passenger)person).displayDetails();
				((Passenger)person).displayRides();
				System.out.println();
				
			}
			
		}
	}
}
	

		