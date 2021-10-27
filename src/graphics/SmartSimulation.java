package graphics;

import user.*;
import java.util.Scanner;

public class SmartSimulation {
	User user;
	Smartphone smartphone;
	Scanner input = new Scanner(System.in);
	
	public SmartSimulation(User user) {
		this.user = user;
		smartphone = new Smartphone(user.getName());
	}

	// house() prints Smart Garage Security System simulation's house art
	public void house() {
		System.out.println("             - Smart Garage Security System Demonstration -\n\n");
		System.out.println(
				"                                    /\\\r\n" + "                               /\\  //\\\\\r\n"
						+ "                        /\\    //\\\\///\\\\\\        /\\\r\n"
						+ "                       //\\\\  ///\\////\\\\\\\\  /\\  //\\\\\r\n"
						+ "          /\\          /  ^ \\/^ ^/^  ^  ^ \\/^ \\/  ^ \\\r\n"
						+ "         / ^\\    /\\  / ^   /  ^/ ^ ^ ^   ^\\ ^/  ^^  \\\r\n"
						+ "        /^   \\  / ^\\/ ^ ^   ^ / ^  ^    ^  \\/ ^   ^  \\       ^\r\n"
						+ "       /  ^ ^ \\/^  ^\\ ^ ^ ^   ^  ^   ^   ____  ^   ^  \\     /|\\\r\n"
						+ "      / ^ ^  ^ \\ ^  _\\___________________|  |_____^ ^  \\   /||o\\\r\n"
						+ "     / ^^  ^ ^ ^\\  /_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/\\ ^ ^ \\ /|o|||\\               \r\n"
						+ "    /  ^  ^^ ^ ^  /_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/__\\  ^  /|||||o|\\             \r\n"
						+ "   /^ ^  ^ ^^  ^    ||________||||(_)||||||___|||||     /||o||||||\\\r\n"
						+ "  / ^   ^   ^    ^  ||___SG___||||  o||||||___|||||         | |      \r\n"
						+ " / ^ ^ ^  ^  ^  ^   ||________||||___||||||||||||||mmmmnmnmm| |mmnmmmm \r\n"
						+ "nmnmmmmmnmmmnmmmnmmmmmmmmmnnmmmmmmmmmmmmmnmmmmmnmmmmmmmmmnnmmmmnmmmnmmn");
	}
	
	public void setupWiFi() {
		refresh();
		house();
		System.out.println("\n--\nWelcome home, " + user.getName() + "!");
		pause();
		refresh();
		house();
		System.out.println("\n--\nFirst, let's set up your WiFi router.");
		pause();
		refresh();
		smartphone.activate();
		pause();
	}

	public void select() {
	}

	// pause() pauses the program until the user is ready to continue
	public void pause() {
		System.out.print("\n\nEnter any key to continue... ");
		String discard = input.nextLine();
	}

	// refresh() clears the console window by pushing old text
	public void refresh() {
		for (int i = 0; i < 100; i++)
			System.out.println();
	}
}
