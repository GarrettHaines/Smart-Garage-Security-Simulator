package graphics;

import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Core {
	public Scanner input = new Scanner(System.in);
	private String name;
	private int selection;
	
	
	public Core() {
		refresh();
	}

	
	public String getUserFirstName() {
		String name;
		
		title();
		System.out.println("\nDeveloped by Garrett Haines, Jacob Elwell, and Paul Gudan.\n\n");
		System.out.print("Please enter your first name: ");
		name = input.next();
		name = Character.toUpperCase(name.charAt(0)) + name.substring(1, name.length());
		refresh();
		String discard = input.nextLine();
		
		title();
		System.out.println("\nWelcome, " + name + "!\n");
		waitForUser();
		
		this.name = name;
		return name;
	}
	
	// getName()  returns a copy of the user's first name
	public String getName() {
		return name;
	}
	
	// setName()  creates a copy of the user's first name
	public void setName(String firstName) {
		name = firstName;
	}

	// Allows the User to chose to simulate the Smart Door Security System or
	// attempt to breach the dumb door's security system
	public void select() {
		title();
		System.out.println("1) Simulate a Smart Garage Security System Demonstration");
		System.out.println("2) Simulate a Garage Security System Attack");
		System.out.println("3) Exit program\n");
		System.out.print("Please enter your selection: ");
		selection = input.nextInt();
	}
	
	// getSelection() returns selected menu option
	public int getSelection() {
		return selection;
	}
	
	// refresh() clears the console window by pushing old content out of view
	public void refresh() {
		for (int i = 0; i < 50; i++)
			System.out.println();
	}
	
	// pause()  pauses the program for desired amount of seconds
	public void pause(int milliseconds) {
		try {
			TimeUnit.MILLISECONDS.sleep(milliseconds);
		} catch (InterruptedException e) {}
	}
	
	// pause()  pauses the program for desired amount of seconds
	public void pauseNano(int nanoseconds) {
		try {
			TimeUnit.NANOSECONDS.sleep(nanoseconds);
		} catch (InterruptedException e) {}
	}
	
	// waitForUser() pauses the program until the user is ready to continue
	public void waitForUser() {
		System.out.print("\nPress 'ENTER' to continue...");
		String discard = input.nextLine();
		refresh();
	}
	
	// printMenu() prints program's stylized title screen
	public void title() {
		System.out
				.println("    _____ __  __          _____ _______     _____          _____            _____ ______ \r\n"
						+ "   / ____|  \\/  |   /\\   |  __ \\__   __|   / ____|   /\\   |  __ \\     /\\   / ____|  ____|\r\n"
						+ "  | (___ | \\  / |  /  \\  | |__) | | |     | |  __   /  \\  | |__) |   /  \\ | |  __| |__   \r\n"
						+ "   \\___ \\| |\\/| | / /\\ \\ |  _  /  | |     | | |_ | / /\\ \\ |  _  /   / /\\ \\| | |_ |  __|  \r\n"
						+ "   ____) | |  | |/ ____ \\| | \\ \\  | |     | |__| |/ ____ \\| | \\ \\  / ____ \\ |__| | |____ \r\n"
						+ "  |_____/|_|  |_/_/    \\_\\_|  \\_\\ |_|      \\_____/_/    \\_\\_|  \\_\\/_/    \\_\\_____|______|\r\n"
						+ "                                                                                         \r");
		System.out.println("           ___                  _ _          ___ _           _      _           \r\n"
				+ "          / __| ___ __ _  _ _ _(_) |_ _  _  / __(_)_ __ _  _| |__ _| |_ ___ _ _ \r\n"
				+ "          \\__ \\/ -_) _| || | '_| |  _| || | \\__ \\ | '  \\ || | / _` |  _/ _ \\ '_|\r\n"
				+ "          |___/\\___\\__|\\_,_|_| |_|\\__|\\_, | |___/_|_|_|_\\_,_|_\\__,_|\\__\\___/_|  \r\n"
				+ "                                      |__/                                      \n\n\n--\n");
	}
	
}
