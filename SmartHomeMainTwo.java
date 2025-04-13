interface RemoteControl {
	
	void turnOn();
	void turnOff();
	
}

interface VoiceControl extends RemoteControl {
	
	void respondToVoiceCommand(String command);
	
}

abstract class SmartDevice {
	
	String deviceName;
	boolean isOn;
	int powerUsage;
	
	public SmartDevice (String deviceName, boolean isOn, int powerUsage) {
		
		this.deviceName = deviceName;
		this.isOn = isOn;
		this.powerUsage = powerUsage;
		
	}
	
	abstract void showStatus();
	
}

class SmartFan extends SmartDevice implements RemoteControl {
	
	public SmartFan(String deviceName, boolean isOn, int powerUsage) {
		
		super (deviceName,isOn,powerUsage);
		
	}
	
	
	@Override
	public void turnOn() {
		
		System.out.println ("Fan is turned ON");
		
	}
	
	@Override
	public void turnOff() {
		
		System.out.println ("Fan is turned oFF");
		
	}
	
	@Override
	public void showStatus() {
		
		System.out.println (deviceName+" is "+(isOn ? "On" : "Off")+" - Using "+powerUsage+"W");
		
	}
}

class SmartAssistant extends SmartDevice implements VoiceControl  {
	
	
	private String voice;
	
	public SmartAssistant(String deviceName, boolean isOn, int powerUsage,String voice) {
		
		super (deviceName,isOn,powerUsage);
		this.voice = voice;
		
	}
	
	
	@Override
	public void turnOn() {
		
		System.out.println ("smart assistant is turned ON");
		
	}
	
	@Override
	public void turnOff() {
		
		System.out.println ("smart assistant is turned oFF");
		
	}
	
	@Override
	public void respondToVoiceCommand(String command) {
		
		if (command.equalsIgnoreCase(voice)) {
			
			System.out.println ("Responded to voice command");
			
		} else {
			
			System.out.println ("Not responded to voice command");
			
		}
		
	}
	
	@Override
	public void showStatus() {
		
		System.out.println (deviceName+" is "+(isOn ? "On" : "Off")+" - Using "+powerUsage+"W");
		
	}
}

public class SmartHomeMainTwo {
	
	public static void main (String...args) {
		
		Scanner sc = new Scanner (System.in);
		
		SmartFan sf = new SmartFan("Fan",true,45);
		SmartAssistant sa = new SmartAssistant("Smart Assistant",true,10,"fathima");
		
		sf.turnOn();
		sf.showStatus();
		
		sa.turnOn();
		sa.respondToVoiceCommand("Fathima");
		sa.showStatus();
		
		sf.turnOff();
	}
}
		
	