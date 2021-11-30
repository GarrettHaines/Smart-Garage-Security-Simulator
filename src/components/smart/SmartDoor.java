package components.smart;

public class SmartDoor extends Device {
	private String name;
	private WiFiNetwork wifi;
	
	public SmartDoor(String firstName, WiFiNetwork network) {
		name = firstName + "'s Smart Garage Door";
		wifi = network;
		setMAC("2f:05:8c:ed:07:1b");
		setIP("192.168.1.159");
	}
	
}