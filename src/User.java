import java.util.Scanner;

class User {
	// The user provides a firstName for User
	Scanner input = new Scanner(System.in);
	private String firstName;
	
	// User's doors
	SmartDoor smart;
	DumbDoor dumb;
	
	// User's objects for testing security system
	MobileDevice device;
	WiFiNetwork wifi;
	
	// User's object for attempting security breach
	RadioTransmitter transmitter;
	
	public User() {
		// Ask for the User's name
		System.out.print("Please enter your first name: ");
		firstName = input.next();
		System.out.println("Welcome, " + firstName + "!");
		
		// Create User's objects
		device = new MobileDevice(firstName);
		wifi = new WiFiNetwork(firstName);
		smart = new SmartDoor(firstName, wifi);
		dumb = new DumbDoor(firstName);
		
		// Add User's mobile device to list of authenticated devices with credentials to login
		wifi.addDevice(device);
	}
	
	// User's test method, calls testable objects' tests
	public void test() {
		System.out.println("\n\n\n" + firstName + " is given");
		System.out.println("- a mobile device (with Smart Garage Authenticator app)");
		System.out.println("- a WiFi router and network");
		System.out.println("- a programmable radio transmitter");
		System.out.println("- a Smart Garage door");
		System.out.println("- a regular, dumb garage door\n");
		
		System.out.print("Enter any key to continue... ");
		String discard = input.next();
		System.out.println();
		
		device.test();
		smart.test();
	}
	
}