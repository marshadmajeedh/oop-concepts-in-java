import java.util.*;
abstract class Transport { //abstract class
	
	abstract double calculateFare();//abstract method
	
	void displayDetails() { //concrete method
	
		System.out.println ("Total fee is : "+calculateFare());
		
	}
	
}

class Bus extends Transport {
	
	
	private int distance;
	
	public Bus(int distance) {
		
		this.distance = distance;
		
	}
	
	@Override
	public double calculateFare() {
		
		return 10 * distance;
		
	}
	
	@Override
	void displayDetails() {
		
		super.displayDetails();
		
	}
	
}

class Taxi extends Transport {
	
	private int distance;
	
	public Taxi (int distance) {

		this.distance = distance;
		
	}
	
	@Override
	public double calculateFare() {
		
		return 20 * distance + 50;
		
	}
	
	@Override
	void displayDetails() {
		
		super.displayDetails();
		
	}
	
}

public class TransportFareSystem {
	public static void main (String...args) {
		
		Scanner sc = new Scanner (System.in);
		
		String continueProgram;
		
		do {
			
			System.out.print ("Enter your transport choice (Taxi || Bus) ? ");
			String choice = sc.next();
			
			sc.nextLine();
			
			if (choice.equalsIgnoreCase("bus")) {

				System.out.print ("Enter your travel distance : ");
				int distance = sc.nextInt();
				
				Transport bus = new Bus(distance);

				bus.displayDetails();
				System.out.println();
				
			} else if (choice.equalsIgnoreCase("taxi")) {
				
				System.out.print ("Enter your travel distance : ");
				int distance = sc.nextInt();
				
				Transport taxi = new Taxi(distance);

				taxi.displayDetails();
				System.out.println();
				
			} else {
				
				System.out.println ("Invalid choice");
				
			}
			
			System.out.print ("Do you want to continue this program ? ");
			continueProgram = sc.next();
			sc.nextLine();
			
		} while (continueProgram.equalsIgnoreCase("y"));
		
		
	}
	
}
				
				
				
		
		