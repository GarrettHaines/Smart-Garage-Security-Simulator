package components.dumb;

import java.util.Scanner;

public class DumbDoor {
	Scanner input = new Scanner(System.in);
	private int frequency;
	private int passcode;
	private String name;
	
	public DumbDoor(String firstName) {
		frequency = 375;  // in MHz
		name = firstName + "'s Dumb Door";
	}
	
}