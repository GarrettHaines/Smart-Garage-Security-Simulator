package user;

import components.dumb.*;
import components.smart.*;
import graphics.*;
import java.util.Scanner;

public class User {
	// The user provides a firstName for User object
	Scanner input = new Scanner(System.in);
	private String name;
	
	// User's doors
	SmartDoor smartDoor;
	DumbDoor dumbDoor;
	
	// User's objects for testing the security system
	MobileDevice device;
	WiFiNetwork wifi;
	
	// User's object for attempting a security breach
	RadioTransmitter transmitter;
	
	
	public User() {
		// Ask for the User's name
		System.out.print("Please enter your first name: ");
		name = input.next();
		name = Character.toUpperCase(name.charAt(0)) + name.substring(1, name.length());
		System.out.println("Welcome, " + name + "!\n");
	}
	
	
	// getName() returns the user's first name
	public String getName() {
		return name;
	}

}