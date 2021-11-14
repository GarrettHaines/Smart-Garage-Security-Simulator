package director;

import components.smart.*;
import components.dumb.*;
import graphics.*;
import user.User;

public class Director {
	private User user;
	private String name;

	public Director(User user, String name) {
		this.user = user;
		this.name = name;
	}

	// go() directs the user to appropriate simulation or terminates the program
	public void go(int selection) {
		if (selection == 1)
			smartSimulation();
		else if (selection == 2)
			dumbSimulation();
		else if (selection == 3)
			System.exit(0);
	}

	// smartSimulation() begins the program's Smart Garage Security System Simulation
	public void smartSimulation() {
		// Create user's objects to...

		// simulate a mobile device capable of running the Authenticator application
		user.device = new MobileDevice(name);

		// print Smart Door Security System graphic user interface
		SmartSimulation smartGraphics = new SmartSimulation(name);
		smartGraphics.setUp();	// Begin WiFi network setup process and display network/device details to user

		// simulate the user's home WiFi network and connects automatically to user's mobile device when in range
		user.wifi = new WiFiNetwork(name, smartGraphics.getNetworkPassword());

		// simulate the Smart Garage Door, which connects to user's WiFi network and opens on Authenticator application's request
		user.smartDoor = new SmartDoor(name, user.wifi);

		
		// Add the user's mobile device to a list of authenticated devices with credentials to login automatically when in range
		user.wifi.addDevice(user.device);
		
	}

	// dumbSimulation() begins the program's Garage Security Vulnerability Simulation
	public void dumbSimulation() {
		//Create user's objects to...
		
		// simulate a regular, dumb garage door
		user.dumbDoor = new DumbDoor(user.getName());
		
		// print graphic user interface
		DumbSimulation dumbGraphics = new DumbSimulation(name);
		dumbGraphics.setUp();
		
		// simulate a radio transmitter used to attempt to access the garage door
		user.transmitter = new RadioTransmitter();
		
	}

}
