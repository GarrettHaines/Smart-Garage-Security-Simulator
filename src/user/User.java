package user;

import components.smart.*;
import components.dumb.*;

public class User {
	// The user provides a firstName for User object
	private String name;
	
	// User's doors
	public SmartDoor smartDoor;
	public DumbDoor dumbDoor;
	
	// User's objects for testing the security system
	public MobileDevice device;
	public WiFiNetwork wifi;
	
	// User's object for attempting a security breach
	public RadioTransmitter transmitter;
	
	
	public User(String name) {
		this.name = name;
	}
	
	
	// getName() returns the user's first name
	public String getName() {
		return name;
	}

}