package graphics;

public class SmartSimulation extends Core {
	private String networkName = getName() + "'s Network";
	private String password;

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
		System.out.println("\n\n--\n\nWelcome home, " + getName() + "!\n");
		waitForUser();
		refresh();
		house();
		System.out.println("\n\n--\n\nFirst, let's set up your WiFi router.\n");
		waitForUser();
		refresh();
		activate();
	}
	
	public void activate() {
		System.out.println(" .-------------------------------.\r\n" + "|                o                |\r\n"
				+ "| .-----------------------------. |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| '-----------------------------' |\r\n" + "|                _                |\r\n"
				+ "|              ( _ )              |\r\n" + " '-------------------------------'");
		
		pause(1);
		refresh();

		System.out.println(" .-------------------------------.\r\n" + "|                o                |\r\n"
				+ "| .-----------------------------. |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| |               .:'           | |\r\n" + "| |           __ :'__           | |\r\n"
				+ "| |        .'`__`-'__``.        | |\r\n" + "| |       :__________.-'        | |\r\n"
				+ "| |       :_________:           | |\r\n" + "| |        :_________`-;        | |\r\n"
				+ "| |         `.__.-.__.'         | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| '-----------------------------' |\r\n" + "|                _                |\r\n"
				+ "|              ( _ )              |\r\n" + " '-------------------------------'");
		
		pause(3);
		refresh();

		System.out.println(" .-------------------------------.\r\n" + "|                o                |\r\n"
				+ "| .-----------------------------. |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| '-----------------------------' |\r\n" + "|                _                |\r\n"
				+ "|              ( _ )              |\r\n" + " '-------------------------------'");

		pause(1);
		refresh();

		System.out.print(" .-------------------------------.\r\n" + "|                o                |\r\n"
				+ "| .-----------------------------. |\r\n" + "| |                             | |\r\n"
				+ "| |" + phoneNameLine() + "| |\r\n" + "| |  --                         | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| '-----------------------------' |\r\n" + "|                _                |\r\n"
				+ "|              ( _ )              |\r\n" + " '-------------------------------'");

		pause(1);
		refresh();

		System.out.print(" .-------------------------------.\r\n" + "|                o                |\r\n"
				+ "| .-----------------------------. |\r\n" + "| |                             | |\r\n"
				+ "| |" + phoneNameLine() + "| |\r\n" + "| |  --                         | |\r\n"
				+ "| |                             | |\r\n" + "| |  Enter a password for your  | |\r\n"
				+ "| |  WiFi network:              | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| |                             | |\r\n" + "| |                             | |\r\n"
				+ "| '-----------------------------' |\r\n" + "|                _                |\r\n"
				+ "|              ( _ )              |\r\n" + " '-------------------------------'");
		
		pause(5);
		System.out.println(networkName);
		waitForUser();

	}

	public String phoneNameLine() {
		String result;
		int length = 14 - getName().length();
		
		result = ("  " + getName() + "'s Smartphone");

		for (int i = 0; i < length; i++)
			result += (" ");
		
		return result;
	}
	
	public void createWiFiPassword() {
		System.out.println("| Password: ");
		password = input.next();
	}

}
