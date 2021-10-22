import graphics.*;
import java.util.Scanner;

class User {
	// The user provides a firstName for User object
	Scanner input = new Scanner(System.in);
	private String firstName;
	
	// User's doors
	SmartDoor smartDoor;
	DumbDoor dumbDoor;
	
	// User's objects for testing security system
	MobileDevice device;
	WiFiNetwork wifi;
	
	// User's object for attempting security breach
	RadioTransmitter transmitter;
	
	
	public User() {
		// Ask for the User's name
		System.out.print("Please enter your first name: ");
		firstName = input.next();
		firstName = Character.toUpperCase(firstName.charAt(0)) + firstName.substring(1, firstName.length());
		System.out.println("Welcome, " + firstName + "!\n");
	}

	
	// go() directs the user to appropriate simulation or terminate program
	public void go(int selection) {
		if(selection == 1)
			smartSimulation();
		else if(selection == 2)
			dumbSimulation();
		else if(selection == 3)
			System.exit(0);
	}

	// smartSimulation() begins the program's Smart Garage Security System Simulation
	public void smartSimulation() {
		// Create user's objects to...
		
			// simulate a mobile device capable of running the Authenticator application
			device = new MobileDevice(firstName);   
			
			// simulate the user's home WiFi network and connects automatically to user's mobile device when in range
			wifi = new WiFiNetwork(firstName);      
			
			// simulate the Smart Garage Door, which connects to user's WiFi network and opens on Authenticator application's request
			smartDoor = new SmartDoor(firstName, wifi);
		
		// Add the user's mobile device to a list of authenticated devices with credentials to login automatically when in range
		wifi.addDevice(device);
		
		SmartSimulation smartGraphics = new SmartSimulation();
		smartGraphics.refresh();
		smartGraphics.house();
		smartGraphics.pause();
	}
	
	// dumbSimulation() begins the program's Garage Security Vulnerability Simulation
	public void dumbSimulation() {
		dumbDoor = new DumbDoor(firstName);
	}

}