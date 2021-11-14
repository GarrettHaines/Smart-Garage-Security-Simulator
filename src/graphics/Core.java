package graphics;

import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Core {
	public Scanner input = new Scanner(System.in);
	private String name;
	
	public Core() {
		refresh();
	}
	
	
	// setName()  creates a copy of the user's first name
	public void setName(String firstName) {
		name = firstName;
	}
	
	// getName()  returns a copy of the user's first name
	public String getName() {
		return name;
	}
	
	
	// refresh() clears the console window by pushing old content out of view
	public void refresh() {
		for (int i = 0; i < 50; i++)
			System.out.println();
	}
	
	// waitForUser() pauses the program until the user is ready to continue
	public void waitForUser() {
		System.out.print("\nPress 'ENTER' to continue...");
		String discard = input.nextLine();
	}
	
	// pause()  pauses the program for desired amount of seconds
	public void pause(int milliseconds) {
		try {
			TimeUnit.MILLISECONDS.sleep(milliseconds);
		} catch (InterruptedException e) {}
	}
	

	
}
