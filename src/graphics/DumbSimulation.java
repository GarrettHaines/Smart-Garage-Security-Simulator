package graphics;

public class DumbSimulation extends Core
{
	private String name; // User's name
	private String passcodeString; // String used for PIN input
	private int passcode; // Final, error-free four digit PIN
	private int attackerPasscode; // The PIN the attacker opened the garage door with (-1 for failure to open door)
	
	public DumbSimulation(String name)
	{
		this.name = name;
	}

	public void setUp()
	{
		passcode = getPIN(); // Get the garage door PIN from the user
		explain(); // Optionally, explain the method used to attack the dumb garage door
		attackerPasscode = attack(); // Trying various PINs to attempt to open the dumb garage door
		result(attackerPasscode); // Outputs the result of the attacker's attempt
	}

	public int getPIN()
	{
		passcode = -1;
		while (passcode == -1) // Loop until 4 digit PIN is entered
		{
			System.out.println("Please enter the 4-digit PIN you would like to use for your garage door!");
			System.out.print("> PIN: ");
			passcodeString = input.next();

			passcode = convertToInt(passcodeString); // Checks user input string to ensure proper length and that the characters are digits
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
		System.out.println("Would you like an explanation? Y/N");
		char explanation = input.next().charAt(0);
		if ((explanation == 'Y') || (explanation == 'y')) // Only explains if Y or y entered, default is to not explain. This can be changed as desired.
		{
			System.out.println("Most garage door openers use frequencies from 300 MHz to 390 MHz.");
			System.out.println("To activate the garage door opener, the remote must use a frequency matching the door opener's frequency.");
			System.out.println("The acceptable difference between the two frequencies depends on a number of factors.");
			System.out.println("However, it is possible to cycle through all frequencies in the typical garage door range.");
			System.out.println("At each frequency, all possible PINs must be tried. A correct frequency and PIN combination opens the door.");
			System.out.println("This is the method that the attacker will employ against the garage door, a brute force method.");
			System.out.println("For the purpose of this project, the frequency is not varied. In a real situation, it would take longer for the attacker");
			System.out.print("to open the door, as they would need to try all PINs on various frequencies.");

			String discard = input.nextLine();
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
		System.out.println("The attacker is trying the PIN " + testPasscode + "...");
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
			System.out.println("The attacker was able to open the garage door! The PIN used was " + attackerPasscode + ".");
			System.out.println();
			System.out.println("Returning to main menu.");
			String discard = input.nextLine();
			waitForUser();
		}
	}
}
