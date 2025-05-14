class Device {
	private String deviceID;
	private String deviceType;
	private static int deviceCount;
	
	static {
		
		deviceCount = 100;
		
	}
	
	public Device (String dID, String t) {
		
		this.deviceID = dID;
		this.deviceType = t;
		deviceCount++;
		
	}
	
	public static void displayDeviceCount() {
		
		System.out.println ("Device count is : "+deviceCount);
		
	}
	
	public void displayDeviceInfo() {
		
		System.out.println("Device ID : "+deviceID);
		System.out.println("Device type : "+deviceType);
		
	}
	
}

public class DeviceMain {
	public static void main (String...args) {
		
		Device[] devices = new Device[3];
		
		devices[0] = new Device("D1020","Electric");
		devices[1] = new Device("1020","lectric");
		devices[2] = new Device("020","ectric");
		
		for (Device d : devices) {
			
			d.displayDeviceInfo();
			System.out.println();
			
		}
		
		Device.displayDeviceCount();
		
	}
	
}
		