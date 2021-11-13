package graphics;

public class Menu extends Core {
	private Core core;
	private int selection;
	
	public Menu(Core core) {
		this.core = core;
	}

	// getSelection() returns selected menu option
	public int getSelection() {
		return selection;
	}
	
	public String getUserFirstName() {
		String name;
		
		title();
		System.out.println("\nDeveloped by Garrett Haines, Jacob Elwell, and Paul Gudan.\n\n");
		System.out.print("Please enter your first name: ");
		name = input.next();
		name = Character.toUpperCase(name.charAt(0)) + name.substring(1, name.length());
		core.refresh();
		
		title();
		System.out.println("\nWelcome, " + name + "!\n");
		core.waitForUser();
		core.refresh();
		
		return name;
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