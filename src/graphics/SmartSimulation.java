package graphics;

import java.util.Scanner;

public class SmartSimulation {
	Scanner input = new Scanner(System.in);
	
	// house() prints Smart Garage Security System simulation's house art
	public void house() {
		System.out.println("                                    /\\\r\n"
				+ "                               /\\  //\\\\\r\n"
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
	
	// pause() pauses the program until the user is ready to continue
	public void pause() {
		System.out.print("\nEnter any key to continue... ");

		@SuppressWarnings("unused")
		String discard = input.nextLine();
	}

	// refresh() clears the terminal window
	public void refresh() {
		for (int i = 0; i < 100; i++)
			System.out.println();
	}
}
