//COMPOSTION & ENCAPSULATION PRACTICE;
import java.util.Scanner;
//part class 1
class Screen {
	
	private String resolution; // Encaspsulation 
	private String size;
	private String type;
	
	public Screen (String resolution, String size, String type) {
		
		this.resolution = resolution;
		this.size = size;
		this.type = type; //OLED | LCD
		
	}
	
	//getter methods for encapsulated attritbutes
	public String getResolution () {
		
		return resolution;
		
	}
	
	public String getSize() {
		
		return size;
		
	}
	
	public String getType() {
		
		return type;
		
	}
	
}

// part class 2
class Battery {
	
	private int capacity;
	private String type;
	
	public Battery (int capacity, String type) {
		
		this.capacity = capacity;
		this.type = type; //(Li-ion)
		
	}
	
	public int getCapacity () {
		
		return capacity;
		
	}
	
	public String getType() {
		
		return type;

	}

}

// part class 3
class Camera {

	private int megaPixels;
	private String lensType;
	
	public Camera (int megaPixels, String lensType) {
		
		this.megaPixels = megaPixels;
		this.lensType = lensType;
		
	}
	
	public int getMegaPixels() {
		
		return megaPixels;
		
	}
	
	public String getLensType() {
		
		return lensType;
		
	}
	
}

// whole class
class SmartPhone {
	
	private Screen screen;
	private Battery battery;
	private Camera[] camera; // one smartphone can HAS-a  many cameras (main/portrait/zooming)
	
	public SmartPhone(Screen screen, Battery battery, Camera[] camera) {
		
		this.screen = screen;
		this.battery = battery;
		this.camera = camera;
		
	}
	
	public int calculateTotalCameraMP() {
		
		int total = 0;
		
		for (Camera cam : camera) {
			
			total += cam.getMegaPixels();
			
		}
		
		return total;
		
	}
	
	public void displaySpecs () {
		
		System.out.println (" "+"|DETAILS ABOUT SMARTPHONE|" +" ");
		System.out.println ("--------------------------------");
		
		System.out.println ("\nSmartphone's screen details");
		System.out.println ("-----------------------------");
		
		System.out.println ("Smartphone's screen resolution : "+screen.getResolution());
		System.out.println ("Smartphone's screen size : "+screen.getSize());
		System.out.println ("Smartphone's screen type (OLED / LCD) : "+screen.getType());
		
		System.out.println ("\nSmartphone's battery details");
		System.out.println ("------------------------------");
		System.out.println ("Smartphone's battery capacity : "+battery.getCapacity());
		System.out.println ("Smartphone's battery type : "+battery.getType());
		System.out.println ("\nSmartphone's camera details");
		System.out.println ("-----------------------------");
		for (int i = 0; i < camera.length; i++) {
			
			System.out.println ("Smartphone's camera lens type : "+camera[i].getLensType());
			System.out.println ("SmartPhone's camera pixels : "+camera[i].getMegaPixels());
			
		}
		System.out.println ();
		
		System.out.println ("Smartphone's total camera pixels : "+calculateTotalCameraMP());
				
	}
	
}

public class PhoneShop {
	
	public static void main (String...args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("Fill the question with appropriate smartphone's details : ");
		System.out.println ("\nScreen details");
		System.out.println ("----------------");
		
		System.out.print ("Enter screen's resolution : ");
		String resolution = sc.nextLine();
		
		System.out.print ("Enter screen's size : ");
		String size = sc.nextLine();
		
		System.out.print ("Enter screen's type (OLED / LCD) : ");
		String type1 = sc.nextLine();
		
		Screen screen = new Screen (resolution,size,type1);
		
		System.out.println ("\nBattery details");
		System.out.println ("-----------------");
		
		System.out.print ("Enter battery's capacity : ");
		int capacity = Integer.parseInt(sc.nextLine());
		
		System.out.print ("Enter battery's type (Li-ion) : ");
		String type2 = sc.nextLine();
		
		Battery battery = new Battery (capacity,type2);
		
		System.out.println ("\nCamera details");
		System.out.println ("----------------");
		
		Camera [] camera = new Camera[3];
		
		for (int i = 0; i < camera.length; i++) {
			
			System.out.print ("Enter camera's lens type "+(i + 1)+ " : " );
			String lensType = sc.nextLine();
		
			System.out.print ("Enter camera's pixel size for lens type "+(i + 1)+" : ");
			int megaPixel = Integer.parseInt(sc.nextLine());
		
			camera[i] = new Camera (megaPixel,lensType);
		
		}
		
		SmartPhone smartphone = new SmartPhone(screen,battery,camera);
		
		smartphone.displaySpecs();
		
	}
}

// definition of compostion : Whole(smartphone) class HAS-a realtionship with part classes(screen,battery,cameras) , part classes cannot live without whole class 

/*This code demonstrates object composition
 where a : 
A SmartPhone has-a:

-1 Screen

-1 Battery

-3 Cameras (stored in an array)

*/


		
		
		
		
		
		
		