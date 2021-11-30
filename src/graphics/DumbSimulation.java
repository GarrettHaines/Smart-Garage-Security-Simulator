package graphics;

public class DumbSimulation extends Core
{
	private String name; // User's name
	private String passcodeString; // String used for PIN input
	private int passcode; // Final, error-free 4-digit PIN
	private int attackerPasscode; // The PIN the attacker opened the garage door with (-1 for failure to open door)
	
	public DumbSimulation(String name)
	{
		this.name = name;
	}

	public void setUp()
	{
		passcode = getPIN(); // Get the garage door PIN from the user
		attackerPasscode = attack(); // Trying various PINs to attempt to open the dumb garage door
		result(attackerPasscode); // Outputs the result of the attacker's attempt
	}

	public int getPIN()
	{
		passcode = -1;
		while (passcode == -1) // Loop until 4 digit PIN is entered
		{
			printTransmitter();
			System.out.println("You have been given a programmable radio transmitter.\n\n");
			explain(); // Optionally, explain the method used to attack the dumb garage door
			
			printDumbDoor();
			System.out.println("Please enter a 4-digit PIN you would like to use for your garage door.");
			System.out.print("> PIN: ");
			passcodeString = input.next();

			passcode = convertToInt(passcodeString); // Checks user input string to ensure proper length and that the characters are digits
			refresh();
		}
		return passcode;
	}

	public int convertToInt(String passcodeString) // Function to convert user input to string, or displaying an error message if unable to do so
	{
		int length = passcodeString.length();
		if (length != 4) // Check PIN length
		{
			System.out.println("Incorrect passcode length. Please create a 4-digit PIN.");
			System.out.println();
			return -1;
		}
		for (int i = 0; i < length; i++)
		{
			if ((passcodeString.charAt(i) < 48) || (passcodeString.charAt(i) > 57)) // Check PIN for digits 0-9 using ASCII table
			{
				System.out.println("Non-integer input found. Please use the digits 0-9 to create the PIN.");
				System.out.println();
				return -1;
			}
		}
		passcode = Integer.parseInt(passcodeString);
		
		return passcode;
	}
	
	public void explain() // Explanation of garage door program
	{
		System.out.print("Would you like an explanation? (Y/N): ");
		char explanation = input.next().charAt(0);
		refresh();
		if ((explanation != 'N') && (explanation != 'n'))
		{
			String discard = input.nextLine();
			printTransmitter();
			System.out.println("Many homes utilize a simple radio receiver garage opener with a programmable 4-digit PIN.");
			System.out.println("Most garage door openers transmit signals on frequencies from 300 MHz to 390 MHz.");
			System.out.println("To activate the garage door opener, the remote must use a frequency matching the door opener's frequency.");
			System.out.println("The acceptable difference between the two frequencies depends on a number of factors.");
			System.out.println("However, it is possible to cycle through all frequencies in the typical garage door range.");
			waitForUser();
			printTransmitter();
			System.out.println("The attacker will create a simple program for the transmitter's microprocessor.");
			System.out.println("This program attempts to transmit a binary radio signal to the garage door's receiver.");
			System.out.println("However, any given garage door could operate on a signal within 90 MHz.");
			System.out.println("So, the attacker will begin by transmitting every possible 4-digit PIN combination at 300 MHz.");
			System.out.println("The program will continue this process at increasing frequencies.");
			System.out.println("At each frequency, all possible PIN's must be transmitted. A correct frequency and PIN combination opens the door.");
			waitForUser();
			printTransmitter();
			System.out.println("This is the approach that an attacker may employ against the garage door; it is a brute force method.");
			System.out.println("Our transmitter and garage door receiver will operate on 375 MHz.");
			System.out.println("On any given frequency, there are...\n\n\n (4)\n10^  =  10,000 possible PIN's.\n");
			waitForUser();
			printTransmitter();
			System.out.println("Assuming the attacker sends the signal at varying frequencies with an interval of 1 MHz,");
			System.out.println("from 300 MHz to 390 MHz, there are...\n\n\n (10,000)\n90^        =  1.782e+195424 possible combinations.\n");
			waitForUser();
			printTransmitter();
			System.out.println("Needless to say, this is a time consuming process.");
			System.out.println("But perhaps shorter than you might think...");
			waitForUser();
			printTransmitter();
			System.out.println("For the purpose of this project, the frequency is not varied. In a real situation, it would take longer for the attacker");
			System.out.println("to open the door, as they would have to attempt to transmit all possible PIN's on various frequencies.");
			waitForUser();
		}
	}
	
	public int attack() // Attack attempt on the dumb garage door using the user's PIN
	{
		int testPasscode = 0;
		displayAttackAttempt(testPasscode);
		while ((testPasscode != passcode) && (testPasscode < 10000)) // Increment PIN by 1 each time, end if all 4-digit PINs have been tried
		{
			testPasscode++;
			displayAttackAttempt(testPasscode); // Display the attacker's current PIN attempt
		}
		
		System.out.println();
		
		if (testPasscode > 9999)
		{
			return -1;
		}
		
		return testPasscode;
	}
	
	public void displayAttackAttempt(int testPasscode) // Function to display the attacker's current PIN attempt
	{
		String formattedPIN = String.format("%04d", testPasscode);
		printTransmitter(formattedPIN);
		System.out.println("The attacker is trying the PIN " + formattedPIN + "...");
		pauseNano(1);
		
		if(testPasscode == passcode)
			pause(100);
		
		refresh();
	}
	
	public void result(int attackerPasscode) // Brief summary of the result of the attacker's attempt to open the dumb garage door
	{
		if (attackerPasscode == -1)
		{
			System.out.println("The attacker was unable to open the garage door! The PIN was" + passcode + ".");
			System.out.println("This shouldn't have happened. Please contact the team for support.");
			System.out.println();
			System.out.println("Returning to main menu.");
			String discard = input.nextLine();
			waitForUser();
		}
		else
		{
			printDumbDoorOpening();
			waitForUser();
		}
	}
	
	public void printTransmitter() {
		System.out.println("            /\\ o \r\n"
				+ "     o     /_ /~~/\r\n"
				+ "      \\      /\\/\r\n"
				+ "       \\    /   \r\n"
				+ "        \\  /   \r\n"
				+ "  ,----------------,\r\n"
				+ "  | ,----------,   |\r\n"
				+ "  | |  ||||||  | O |\r\n"
				+ "  | |-MMMMMMMM-| x |\r\n"
				+ "  | |  ||||||  |  _|\r\n"
				+ "  | |          |  _|\r\n"
				+ "  | |   XXXX   |   |\r\n"
				+ "  | |__________| RT|\r\n"
				+ "  |________________|\n\n");
	}
	
	public void printTransmitter(String PIN) {
		System.out.println("            /\\ o \r\n"
				+ "     o     /_ /~~/\r\n"
				+ "      \\      /\\/\r\n"
				+ "       \\    /   \r\n"
				+ "        \\  /   \r\n"
				+ "  ,----------------,\r\n"
				+ "  | ,----------,   |\r\n"
				+ "  | |  ||||||  | O |\r\n"
				+ "  | |-MMMMMMMM-| x |\r\n"
				+ "  | |  ||||||  |  _|\r\n"
				+ "  | |          |  _|\r\n"
				+ "  | |   " + PIN + "   |   |\r\n"
				+ "  | |__________| RT|\r\n"
				+ "  |________________|\n\n");
	}
	
	public void printDumbDoor() {
		System.out.println( 
				"                                     /\\\r\n" + "                                /\\  //\\\\\r\n"
						+ "                         /\\    //\\\\///\\\\\\        /\\\r\n"
						+ "                        //\\\\  ///\\////\\\\\\\\  /\\  //\\\\\r\n"
						+ "           /\\          /  ^ \\/^ ^/^  ^  ^ \\/^ \\/  ^ \\\r\n"
						+ "          / ^\\    /\\  / ^   /  ^/ ^ ^ ^   ^\\ ^/  ^^  \\\r\n"
						+ "         /^   \\  / ^\\/ ^ ^   ^ / ^  ^    ^  \\/ ^   ^  \\       ^\r\n"
						+ "        /  ^ ^ \\/^  ^\\ ^ ^ ^   ^  ^   ^   ____  ^   ^  \\     /|\\\r\n"
						+ "       / ^ ^  ^ \\ ^  _\\___________________|  |_____^ ^  \\   /||o\\\r\n"
						+ "      / ^^  ^ ^ ^\\  /_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/\\ ^ ^ \\ /|o|||\\               \r\n"
						+ "     /  ^  ^^ ^ ^  /_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/__\\  ^  /|||||o|\\             \r\n"
						+ "    /^ ^  ^ ^^  ^    ||________||||(_)|||||||___|||||    /||o||||||\\\r\n"
						+ "   / ^   ^   ^    ^  ||________||||  o|||||||___|||||        | |      \r\n"
						+ "  / ^ ^ ^  ^  ^  ^   ||________||||___|||||||||||||||mmmnmnmm| |mmnmmmm \r\n"
						+ " nmnmmmmmnmmmnmmmnmmmmmmmmmnnmmmmmmmmmmmmmnmmmmmnmmmmmmmmmnnmmmmnmmmnmmn\n\n\n");
	}
	
	public void printDumbDoorOpening() {
		System.out.println("              \n\n");
		System.out.println( 
				"                                     /\\\r\n" + "                                /\\  //\\\\\r\n"
						+ "                         /\\    //\\\\///\\\\\\        /\\\r\n"
						+ "                        //\\\\  ///\\////\\\\\\\\  /\\  //\\\\\r\n"
						+ "           /\\          /  ^ \\/^ ^/^  ^  ^ \\/^ \\/  ^ \\\r\n"
						+ "          / ^\\    /\\  / ^   /  ^/ ^ ^ ^   ^\\ ^/  ^^  \\\r\n"
						+ "         /^   \\  / ^\\/ ^ ^   ^ / ^  ^    ^  \\/ ^   ^  \\       ^\r\n"
						+ "        /  ^ ^ \\/^  ^\\ ^ ^ ^   ^  ^   ^   ____  ^   ^  \\     /|\\\r\n"
						+ "       / ^ ^  ^ \\ ^  _\\___________________|  |_____^ ^  \\   /||o\\\r\n"
						+ "      / ^^  ^ ^ ^\\  /_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/\\ ^ ^ \\ /|o|||\\               \r\n"
						+ "     /  ^  ^^ ^ ^  /_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/__\\  ^  /|||||o|\\             \r\n"
						+ "    /^ ^  ^ ^^  ^    ||________||||(_)|||||||___|||||    /||o||||||\\\r\n"
						+ "   / ^   ^   ^    ^  ||________||||  o|||||||___|||||        | |      \r\n"
						+ "  / ^ ^ ^  ^  ^  ^   ||________||||___|||||||||||||||mmmnmnmm| |mmnmmmm \r\n"
						+ " nmnmmmmmnmmmnmmmnmmmmmmmmmnnmmmmmmmmmmmmmnmmmmmnmmmmmmmmmnnmmmmnmmmnmmn\n\n\n");
		System.out.print("The attacker was able to open the garage door! The PIN used was " + attackerPasscode + ".\n");
		pause(2000);
		refresh();
		System.out.println("              \n\n");
		System.out.println( 
				"                                     /\\\r\n" + "                                /\\  //\\\\\r\n"
						+ "                         /\\    //\\\\///\\\\\\        /\\\r\n"
						+ "                        //\\\\  ///\\////\\\\\\\\  /\\  //\\\\\r\n"
						+ "           /\\          /  ^ \\/^ ^/^  ^  ^ \\/^ \\/  ^ \\\r\n"
						+ "          / ^\\    /\\  / ^   /  ^/ ^ ^ ^   ^\\ ^/  ^^  \\\r\n"
						+ "         /^   \\  / ^\\/ ^ ^   ^ / ^  ^    ^  \\/ ^   ^  \\       ^\r\n"
						+ "        /  ^ ^ \\/^  ^\\ ^ ^ ^   ^  ^   ^   ____  ^   ^  \\     /|\\\r\n"
						+ "       / ^ ^  ^ \\ ^  _\\___________________|  |_____^ ^  \\   /||o\\\r\n"
						+ "      / ^^  ^ ^ ^\\  /_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/\\ ^ ^ \\ /|o|||\\               \r\n"
						+ "     /  ^  ^^ ^ ^  /_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/__\\  ^  /|||||o|\\             \r\n"
						+ "    /^ ^  ^ ^^  ^    ||________||||(_)|||||||___|||||    /||o||||||\\\r\n"
						+ "   / ^   ^   ^    ^  ||________||||  o|||||||___|||||        | |      \r\n"
						+ "  / ^ ^ ^  ^  ^  ^   ||_/_\\____||||___|||||||||||||||mmmnmnmm| |mmnmmmm \r\n"
						+ " nmnmmmmmnmmmnmmmnmmmmmmmmmnnmmmmmmmmmmmmmnmmmmmnmmmmmmmmmnnmmmmnmmmnmmn\n\n\n");
		System.out.print("The attacker was able to open the garage door! The PIN used was " + attackerPasscode + ".\n");
		pause(500);
		refresh();
		
		System.out.println("              \n\n");
		System.out.println( 
				"                                     /\\\r\n" + "                                /\\  //\\\\\r\n"
						+ "                         /\\    //\\\\///\\\\\\        /\\\r\n"
						+ "                        //\\\\  ///\\////\\\\\\\\  /\\  //\\\\\r\n"
						+ "           /\\          /  ^ \\/^ ^/^  ^  ^ \\/^ \\/  ^ \\\r\n"
						+ "          / ^\\    /\\  / ^   /  ^/ ^ ^ ^   ^\\ ^/  ^^  \\\r\n"
						+ "         /^   \\  / ^\\/ ^ ^   ^ / ^  ^    ^  \\/ ^   ^  \\       ^\r\n"
						+ "        /  ^ ^ \\/^  ^\\ ^ ^ ^   ^  ^   ^   ____  ^   ^  \\     /|\\\r\n"
						+ "       / ^ ^  ^ \\ ^  _\\___________________|  |_____^ ^  \\   /||o\\\r\n"
						+ "      / ^^  ^ ^ ^\\  /_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/\\ ^ ^ \\ /|o|||\\               \r\n"
						+ "     /  ^  ^^ ^ ^  /_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/__\\  ^  /|||||o|\\             \r\n"
						+ "    /^ ^  ^ ^^  ^    ||________||||(_)|||||||___|||||    /||o||||||\\\r\n"
						+ "   / ^   ^   ^    ^  || /|\\    ||||  o|||||||___|||||        | |      \r\n"
						+ "  / ^ ^ ^  ^  ^  ^   ||_/_\\____||||___|||||||||||||||mmmnmnmm| |mmnmmmm \r\n"
						+ " nmnmmmmmnmmmnmmmnmmmmmmmmmnnmmmmmmmmmmmmmnmmmmmnmmmmmmmmmnnmmmmnmmmnmmn\n\n\n");
		System.out.print("The attacker was able to open the garage door! The PIN used was " + attackerPasscode + ".\n");
		pause(500);
		refresh();
		
		System.out.println("              \n\n");
		System.out.println( 
				"                                     /\\\r\n" + "                                /\\  //\\\\\r\n"
						+ "                         /\\    //\\\\///\\\\\\        /\\\r\n"
						+ "                        //\\\\  ///\\////\\\\\\\\  /\\  //\\\\\r\n"
						+ "           /\\          /  ^ \\/^ ^/^  ^  ^ \\/^ \\/  ^ \\\r\n"
						+ "          / ^\\    /\\  / ^   /  ^/ ^ ^ ^   ^\\ ^/  ^^  \\\r\n"
						+ "         /^   \\  / ^\\/ ^ ^   ^ / ^  ^    ^  \\/ ^   ^  \\       ^\r\n"
						+ "        /  ^ ^ \\/^  ^\\ ^ ^ ^   ^  ^   ^   ____  ^   ^  \\     /|\\\r\n"
						+ "       / ^ ^  ^ \\ ^  _\\___________________|  |_____^ ^  \\   /||o\\\r\n"
						+ "      / ^^  ^ ^ ^\\  /_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/\\ ^ ^ \\ /|o|||\\               \r\n"
						+ "     /  ^  ^^ ^ ^  /_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/__\\  ^  /|||||o|\\             \r\n"
						+ "    /^ ^  ^ ^^  ^    ||  o     ||||(_)|||||||___|||||    /||o||||||\\\r\n"
						+ "   / ^   ^   ^    ^  || /|\\    ||||  o|||||||___|||||        | |      \r\n"
						+ "  / ^ ^ ^  ^  ^  ^   ||_/_\\____||||___|||||||||||||||mmmnmnmm| |mmnmmmm \r\n"
						+ " nmnmmmmmnmmmnmmmnmmmmmmmmmnnmmmmmmmmmmmmmnmmmmmnmmmmmmmmmnnmmmmnmmmnmmn\n\n\n");
		System.out.print("The attacker was able to open the garage door! The PIN used was " + attackerPasscode + ".\n");
		pause(1000);
		refresh();
		
		System.out.println("              \n\n");
		System.out.println( 
				"                                     /\\\r\n" + "                                /\\  //\\\\\r\n"
						+ "                         /\\    //\\\\///\\\\\\        /\\\r\n"
						+ "                        //\\\\  ///\\////\\\\\\\\  /\\  //\\\\\r\n"
						+ "           /\\          /  ^ \\/^ ^/^  ^  ^ \\/^ \\/  ^ \\\r\n"
						+ "          / ^\\    /\\  / ^   /  ^/ ^ ^ ^   ^\\ ^/  ^^  \\\r\n"
						+ "         /^   \\  / ^\\/ ^ ^   ^ / ^  ^    ^  \\/ ^   ^  \\       ^\r\n"
						+ "        /  ^ ^ \\/^  ^\\ ^ ^ ^   ^  ^   ^   ____  ^   ^  \\     /|\\\r\n"
						+ "       / ^ ^  ^ \\ ^  _\\___________________|  |_____^ ^  \\   /||o\\\r\n"
						+ "      / ^^  ^ ^ ^\\  /_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/\\ ^ ^ \\ /|o|||\\               \r\n"
						+ "     /  ^  ^^ ^ ^  /_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/__\\  ^  /|||||o|\\             \r\n"
						+ "    /^ ^  ^ ^^  ^    ||  o $!@#||||(_)|||||||___|||||    /||o||||||\\\r\n"
						+ "   / ^   ^   ^    ^  || /|\\ -' ||||  o|||||||___|||||        | |      \r\n"
						+ "  / ^ ^ ^  ^  ^  ^   ||_/_\\____||||___|||||||||||||||mmmnmnmm| |mmnmmmm \r\n"
						+ " nmnmmmmmnmmmnmmmnmmmmmmmmmnnmmmmmmmmmmmmmnmmmmmnmmmmmmmmmnnmmmmnmmmnmmn\n\n\n");
		System.out.println("The attacker was able to open the garage door! The PIN used was " + attackerPasscode + ".");
		pause(1000);
		refresh();
		String discard = input.nextLine();
		
		System.out.println("              \n\n");
		System.out.println( 
				"                                     /\\\r\n" + "                                /\\  //\\\\\r\n"
						+ "                         /\\    //\\\\///\\\\\\        /\\\r\n"
						+ "                        //\\\\  ///\\////\\\\\\\\  /\\  //\\\\\r\n"
						+ "           /\\          /  ^ \\/^ ^/^  ^  ^ \\/^ \\/  ^ \\\r\n"
						+ "          / ^\\    /\\  / ^   /  ^/ ^ ^ ^   ^\\ ^/  ^^  \\\r\n"
						+ "         /^   \\  / ^\\/ ^ ^   ^ / ^  ^    ^  \\/ ^   ^  \\       ^\r\n"
						+ "        /  ^ ^ \\/^  ^\\ ^ ^ ^   ^  ^   ^   ____  ^   ^  \\     /|\\\r\n"
						+ "       / ^ ^  ^ \\ ^  _\\___________________|  |_____^ ^  \\   /||o\\\r\n"
						+ "      / ^^  ^ ^ ^\\  /_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/\\ ^ ^ \\ /|o|||\\               \r\n"
						+ "     /  ^  ^^ ^ ^  /_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/__\\  ^  /|||||o|\\             \r\n"
						+ "    /^ ^  ^ ^^  ^    ||  o     ||||(_)|||||||___|||||    /||o||||||\\\r\n"
						+ "   / ^   ^   ^    ^  || /|\\    ||||  o|||||||___|||||        | |      \r\n"
						+ "  / ^ ^ ^  ^  ^  ^   ||_/_\\____||||___|||||||||||||||mmmnmnmm| |mmnmmmm \r\n"
						+ " nmnmmmmmnmmmnmmmnmmmmmmmmmnnmmmmmmmmmmmmmnmmmmmnmmmmmmmmmnnmmmmnmmmnmmn\n\n\n");
		System.out.print("The attacker was able to open the garage door! The PIN used was " + attackerPasscode + ".");
		waitForUser();
		
		System.out.println("              \n\n");
		System.out.println( 
				"                                     /\\\r\n" + "                                /\\  //\\\\\r\n"
						+ "                         /\\    //\\\\///\\\\\\        /\\\r\n"
						+ "                        //\\\\  ///\\////\\\\\\\\  /\\  //\\\\\r\n"
						+ "           /\\          /  ^ \\/^ ^/^  ^  ^ \\/^ \\/  ^ \\\r\n"
						+ "          / ^\\    /\\  / ^   /  ^/ ^ ^ ^   ^\\ ^/  ^^  \\\r\n"
						+ "         /^   \\  / ^\\/ ^ ^   ^ / ^  ^    ^  \\/ ^   ^  \\       ^\r\n"
						+ "        /  ^ ^ \\/^  ^\\ ^ ^ ^   ^  ^   ^   ____  ^   ^  \\     /|\\\r\n"
						+ "       / ^ ^  ^ \\ ^  _\\___________________|  |_____^ ^  \\   /||o\\\r\n"
						+ "      / ^^  ^ ^ ^\\  /_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/\\ ^ ^ \\ /|o|||\\               \r\n"
						+ "     /  ^  ^^ ^ ^  /_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/__\\  ^  /|||||o|\\             \r\n"
						+ "    /^ ^  ^ ^^  ^    ||  o     ||||(_)|||||||___|||||    /||o||||||\\\r\n"
						+ "   / ^   ^   ^    ^  || /|\\    ||||  o|||||||___|||||        | |      \r\n"
						+ "  / ^ ^ ^  ^  ^  ^   ||_/_\\____||||___|||||||||||||||mmmnmnmm| |mmnmmmm \r\n"
						+ " nmnmmmmmnmmmnmmmnmmmmmmmmmnnmmmmmmmmmmmmmnmmmmmnmmmmmmmmmnnmmmmnmmmnmmn\n\n\n");
		System.out.print("Perhaps you should invest in a smarter garage door!");
	}
	
}
