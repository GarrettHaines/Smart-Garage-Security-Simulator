package graphics;

public class SmartSimulation extends Core {
	private String name;
	private String networkName;
	private String networkPassword;
	
	public SmartSimulation(String name) {
		this.name = name;
		networkName = name + "'s Network";
	}
	
	
	public void go() {
		setUpNetwork();
		displayNetworkDetails();
		displayDeviceDetails();
	}
	

	public String deviceNameLine() {
		String result;
		int length = 18 -  name.length();
		
		result = ("  " + name + "'s Device");

		for (int i = 0; i < length; i++)
			result += (" ");
		
		return result;
	}
	
	public String deviceListNameLine() {
		String result;
		int length = 15 -  name.length();
		
		result = (name + "'s Device");

		for (int i = 0; i < length; i++)
			result += (" ");
		
		return result;
	}
	
	public String networkNameLine() {
		String result;
		int length = 27 -  networkName.length();
		
		result = (networkName);

		for (int i = 0; i < length; i++)
			result += (" ");
		
		return result;
	}
	
	public String networkPasswordLine() {
		String result;
		int length = 27 -  networkPassword.length();
		
		result = (networkPassword);

		for (int i = 0; i < length; i++)
			result += (" ");
		
		return result;
	}
	
	public void createWiFiPassword() {
		System.out.print("> Password: ");
		networkPassword = input.next();
	}
	
	public String getNetworkPassword() {
		return networkPassword;
	}

	// house() prints Smart Garage Security System simulation's house art
	public void house() {
		System.out.println("             -  Smart Garage Security System Demonstration - \n\n");
		System.out.println( 
				"                                     /\\\r\n" + "                               /\\  //\\\\\r\n"
						+ "                         /\\    //\\\\///\\\\\\        /\\\r\n"
						+ "                        //\\\\  ///\\////\\\\\\\\  /\\  //\\\\\r\n"
						+ "           /\\          /  ^ \\/^ ^/^  ^  ^ \\/^ \\/  ^ \\\r\n"
						+ "          / ^\\    /\\  / ^   /  ^/ ^ ^ ^   ^\\ ^/  ^^  \\\r\n"
						+ "         /^   \\  / ^\\/ ^ ^   ^ / ^  ^    ^  \\/ ^   ^  \\       ^\r\n"
						+ "        /  ^ ^ \\/^  ^\\ ^ ^ ^   ^  ^   ^   ____  ^   ^  \\     /|\\\r\n"
						+ "       / ^ ^  ^ \\ ^  _\\___________________|  |_____^ ^  \\   /||o\\\r\n"
						+ "      / ^^  ^ ^ ^\\  /_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/\\ ^ ^ \\ /|o|||\\               \r\n"
						+ "     /  ^  ^^ ^ ^  /_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/__\\  ^  /|||||o|\\             \r\n"
						+ "    /^ ^  ^ ^^  ^    ||________||||(_)||||||___|||||     /||o||||||\\\r\n"
						+ "   / ^   ^   ^    ^  ||___SG___||||  o||||||___|||||         | |      \r\n"
						+ "  / ^ ^ ^  ^  ^  ^   ||________||||___||||||||||||||mmmmnmnmm| |mmnmmmm \r\n"
						+ " nmnmmmmmnmmmnmmmnmmmmmmmmmnnmmmmmmmmmmmmmnmmmmmnmmmmmmmmmnnmmmmnmmmnmmn");
	}
	
	public void setUpNetwork() {
		refresh();
		house();
		System.out.println("\n\n--\n\n\nWelcome home, " + name + "!\n");
		waitForUser();
		refresh();
		house();
		System.out.println("\n\n--\n\n\nFirst, let's set up your WiFi network.\n");
		waitForUser();
		refresh();
		
		System.out.println("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		pause(750);
		refresh();

		System.out.println("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |               .:'           | |\r\n" + " | |           __ :'__           | |\r\n"
				+ " | |        .'`__`-'__``.        | |\r\n" + " | |       :__________.-'        | |\r\n"
				+ " | |       :_________:           | |\r\n" + " | |        :_________`-;        | |\r\n"
				+ " | |         `.__.-.__.'         | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		pause(1500);
		refresh();

		System.out.println("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");

		pause(333);
		refresh();

		load();

		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n"
				+ " | |" + deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				+ " | |                             | |\r\n" + " | |  Enter a password for your  | |\r\n"
				+ " | |  WiFi Network:              | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n\n");
		
		createWiFiPassword();
		refresh();
		
		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n"
				+ " | |" + deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				+ " | |                             | |\r\n" + " | |  Enter a password for your  | |\r\n"
				+ " | |  WiFi Network:              | |\r\n" + " | |  "  + networkPasswordLine() + "| |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n\n");
		
		pause(750);
		refresh();
		
	}
	
	public void displayNetworkDetails() {
		load();
		
		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n"
				+ " | |" + deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				+ " | |     ( WiFi Connection )     | |\r\n"
				+ " | |                             | |\r\n" + " | |  Network ID:                | |\r\n"
				+ " | |  " + networkNameLine() + "| |\r\n" + " | |                             | |\r\n"
				+ " | |  Password:                  | |\r\n" + " | |  "  + networkPasswordLine() + "| |\r\n"
				+ " | |                             | |\r\n" + " | |  Router MAC Address:        | |\r\n"
				+ " | |  37:b0:69:1e:45:01          | |\r\n" + " | |                             | |\r\n"
				+ " | |  Router IPv4 Address:       | |\r\n" + " | |  192.168.1.203              | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n" + " | |                             | |\r\n" 
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		String discard = input.nextLine();
		waitForUser();
		refresh();
		
		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n"
				+ " | |" + deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				 + " | |     ( WiFi Connection )     | |\r\n"
				+ " | |                             | |\r\n" + " | |  Network Name:  <---------  | |\r\n"
				+ " | |  " + networkNameLine() + "| |\r\n" + " | |                             | |\r\n"
				+ " | |  Password:                  | |\r\n" + " | |  "  + networkPasswordLine() + "| |\r\n"
				+ " | |                             | |\r\n" + " | |  Router MAC Address:        | |\r\n"
				+ " | |  37:b0:69:1e:45:01          | |\r\n" + " | |                             | |\r\n"
				+ " | |  Router IPv4 Address:       | |\r\n" + " | |  192.168.1.203              | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		System.out.print("> Your network's name is a string of characters used to refer to your WiFi network.");
		waitForUser();
		refresh();
		
		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n"
				+ " | |" + deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				 + " | |     ( WiFi Connection )     | |\r\n"
				+ " | |                             | |\r\n" + " | |  Network ID:                | |\r\n"
				+ " | |  " + networkNameLine() + "| |\r\n" + " | |                             | |\r\n"
				+ " | |  Password:  <-------------  | |\r\n" + " | |  "  + networkPasswordLine() + "| |\r\n"
				+ " | |                             | |\r\n" + " | |  Router MAC Address:        | |\r\n"
				+ " | |  37:b0:69:1e:45:01          | |\r\n" + " | |                             | |\r\n"
				+ " | |  Router IPv4 Address:       | |\r\n" + " | |  192.168.1.203              | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		System.out.print("> This password is a credential which must be provided in order to access the network.");
		waitForUser();
		refresh();
		
		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n"
				+ " | |" + deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				 + " | |     ( WiFi Connection )     | |\r\n"
				+ " | |                             | |\r\n" + " | |  Network ID:                | |\r\n"
				+ " | |  " + networkNameLine() + "| |\r\n" + " | |                             | |\r\n"
				+ " | |  Password:  <-------------  | |\r\n" + " | |  "  + networkPasswordLine() + "| |\r\n"
				+ " | |                             | |\r\n" + " | |  Router MAC Address:        | |\r\n"
				+ " | |  37:b0:69:1e:45:01          | |\r\n" + " | |                             | |\r\n"
				+ " | |  Router IPv4 Address:       | |\r\n" + " | |  192.168.1.203              | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		System.out.print("> This is necessary to ensure connections to the network are authentic.");
		waitForUser();
		refresh();
		
		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n"
				+ " | |" + deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				 + " | |     ( WiFi Connection )     | |\r\n"
				+ " | |                             | |\r\n" + " | |  Network ID:                | |\r\n"
				+ " | |  " + networkNameLine() + "| |\r\n" + " | |                             | |\r\n"
				+ " | |  Password:  <-------------  | |\r\n" + " | |  "  + networkPasswordLine() + "| |\r\n"
				+ " | |                             | |\r\n" + " | |  Router MAC Address:        | |\r\n"
				+ " | |  37:b0:69:1e:45:01          | |\r\n" + " | |                             | |\r\n"
				+ " | |  Router IPv4 Address:       | |\r\n" + " | |  192.168.1.203              | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n" 
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		System.out.print("> Once a device has been successfully authenticated, its information is saved in a list.");
		waitForUser();
		refresh();
		
		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n"
				+ " | |" + deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				 + " | |     ( WiFi Connection )     | |\r\n"
				+ " | |                             | |\r\n" + " | |  Network ID:                | |\r\n"
				+ " | |  " + networkNameLine() + "| |\r\n" + " | |                             | |\r\n"
				+ " | |  Password:  <-------------  | |\r\n" + " | |  "  + networkPasswordLine() + "| |\r\n"
				+ " | |                             | |\r\n" + " | |  Router MAC Address:        | |\r\n"
				+ " | |  37:b0:69:1e:45:01          | |\r\n" + " | |                             | |\r\n"
				+ " | |  Router IPv4 Address:       | |\r\n" + " | |  192.168.1.203              | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		System.out.print("> Devices on this list can connect to the network automatically when in range.");
		waitForUser();
		refresh();
		
		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n"
				+ " | |" + deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				 + " | |     ( WiFi Connection )     | |\r\n"
				+ " | |                             | |\r\n" + " | |  Network ID:                | |\r\n"
				+ " | |  " + networkNameLine() + "| |\r\n" + " | |                             | |\r\n"
				+ " | |  Password:                  | |\r\n" + " | |  "  + networkPasswordLine() + "| |\r\n"
				+ " | |                             | |\r\n" + " | |  Router MAC Address:  <---  | |\r\n"
				+ " | |  37:b0:69:1e:45:01          | |\r\n" + " | |                             | |\r\n"
				+ " | |  Router IPv4 Address:       | |\r\n" + " | |  192.168.1.203              | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		System.out.print("> Each component of the network has one unique identifying 'MAC' address.");
		waitForUser();
		refresh();
		
		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n"
				+ " | |" + deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				 + " | |     ( WiFi Connection )     | |\r\n"
				+ " | |                             | |\r\n" + " | |  Network ID:                | |\r\n"
				+ " | |  " + networkNameLine() + "| |\r\n" + " | |                             | |\r\n"
				+ " | |  Password:                  | |\r\n" + " | |  "  + networkPasswordLine() + "| |\r\n"
				+ " | |                             | |\r\n" + " | |  Router MAC Address:  <---  | |\r\n"
				+ " | |  37:b0:69:1e:45:01          | |\r\n" + " | |                             | |\r\n"
				+ " | |  Router IPv4 Address:       | |\r\n" + " | |  192.168.1.203              | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		System.out.print("> This includes devices, switches, and routers. Any given MAC address will never change.");
		waitForUser();
		refresh();
		
		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n"
				+ " | |" + deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				 + " | |     ( WiFi Connection )     | |\r\n"
				+ " | |                             | |\r\n" + " | |  Network ID:                | |\r\n"
				+ " | |  " + networkNameLine() + "| |\r\n" + " | |                             | |\r\n"
				+ " | |  Password:                  | |\r\n" + " | |  "  + networkPasswordLine() + "| |\r\n"
				+ " | |                             | |\r\n" + " | |  Router MAC Address:  <---  | |\r\n"
				+ " | |  37:b0:69:1e:45:01          | |\r\n" + " | |                             | |\r\n"
				+ " | |  Router IPv4 Address:       | |\r\n" + " | |  192.168.1.203              | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		System.out.print("> A MAC address is used to ensure the physical address of the component.");
		waitForUser();
		refresh();
		
		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n"
				+ " | |" + deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				 + " | |     ( WiFi Connection )     | |\r\n"
				+ " | |                             | |\r\n" + " | |  Network ID:                | |\r\n"
				+ " | |  " + networkNameLine() + "| |\r\n" + " | |                             | |\r\n"
				+ " | |  Password:                  | |\r\n" + " | |  "  + networkPasswordLine() + "| |\r\n"
				+ " | |                             | |\r\n" + " | |  Router MAC Address:  <---  | |\r\n"
				+ " | |  37:b0:69:1e:45:01          | |\r\n" + " | |                             | |\r\n"
				+ " | |  Router IPv4 Address:       | |\r\n" + " | |  192.168.1.203              | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		System.out.print("> The address listed here is used to identify your network's primary router.");
		waitForUser();
		refresh();
		
		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n"
				+ " | |" + deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				 + " | |     ( WiFi Connection )     | |\r\n"
				+ " | |                             | |\r\n" + " | |  Network ID:                | |\r\n"
				+ " | |  " + networkNameLine() + "| |\r\n" + " | |                             | |\r\n"
				+ " | |  Password:                  | |\r\n" + " | |  "  + networkPasswordLine() + "| |\r\n"
				+ " | |                             | |\r\n" + " | |  Router MAC Address:        | |\r\n"
				+ " | |  37:b0:69:1e:45:01          | |\r\n" + " | |                             | |\r\n"
				+ " | |  Router IPv4 Address:  <--  | |\r\n" + " | |  192.168.1.203              | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		System.out.print("> Each component of the network is also given at least one IP address.");
		waitForUser();
		refresh();
		
		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n"
				+ " | |" + deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				 + " | |     ( WiFi Connection )     | |\r\n"
				+ " | |                             | |\r\n" + " | |  Network ID:                | |\r\n"
				+ " | |  " + networkNameLine() + "| |\r\n" + " | |                             | |\r\n"
				+ " | |  Password:                  | |\r\n" + " | |  "  + networkPasswordLine() + "| |\r\n"
				+ " | |                             | |\r\n" + " | |  Router MAC Address:        | |\r\n"
				+ " | |  37:b0:69:1e:45:01          | |\r\n" + " | |                             | |\r\n"
				+ " | |  Router IPv4 Address:  <--  | |\r\n" + " | |  192.168.1.203              | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		System.out.print("> This address is used to identify the connection between the given component and the internet.");
		waitForUser();
		refresh();
		
		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n"
				+ " | |" + deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				 + " | |     ( WiFi Connection )     | |\r\n"
				+ " | |                             | |\r\n" + " | |  Network ID:                | |\r\n"
				+ " | |  " + networkNameLine() + "| |\r\n" + " | |                             | |\r\n"
				+ " | |  Password:                  | |\r\n" + " | |  "  + networkPasswordLine() + "| |\r\n"
				+ " | |                             | |\r\n" + " | |  Router MAC Address:        | |\r\n"
				+ " | |  37:b0:69:1e:45:01          | |\r\n" + " | |                             | |\r\n"
				+ " | |  Router IPv4 Address:  <--  | |\r\n" + " | |  192.168.1.203              | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		System.out.print("> Unlike a MAC address, an IP address may change over time.");
		waitForUser();
		refresh();
		
		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n"
				+ " | |" + deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				 + " | |     ( WiFi Connection )     | |\r\n"
				+ " | |                             | |\r\n" + " | |  Network ID:                | |\r\n"
				+ " | |  " + networkNameLine() + "| |\r\n" + " | |                             | |\r\n"
				+ " | |  Password:                  | |\r\n" + " | |  "  + networkPasswordLine() + "| |\r\n"
				+ " | |                             | |\r\n" + " | |  Router MAC Address:        | |\r\n"
				+ " | |  37:b0:69:1e:45:01          | |\r\n" + " | |                             | |\r\n"
				+ " | |  Router IPv4 Address:  <--  | |\r\n" + " | |  192.168.1.203              | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		System.out.print("> The address listed here identifies the connection between your router and the internet.");
		waitForUser();
		refresh();
		
		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n"
				+ " | |" + deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				 + " | |     ( WiFi Connection )     | |\r\n"
				+ " | |                             | |\r\n" + " | |  Network ID:                | |\r\n"
				+ " | |  " + networkNameLine() + "| |\r\n" + " | |                             | |\r\n"
				+ " | |  Password:                  | |\r\n" + " | |  "  + networkPasswordLine() + "| |\r\n"
				+ " | |                             | |\r\n" + " | |  Router MAC Address:        | |\r\n"
				+ " | |  37:b0:69:1e:45:01          | |\r\n" + " | |                             | |\r\n"
				+ " | |  Router IPv4 Address:       | |\r\n" + " | |  192.168.1.203              | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		System.out.print("Let's look at your network's device list.");
		waitForUser();
		refresh();
		load();

		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n" + " | |"
				+ deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				+ " | |   ( Network Device List )   | |\r\n" + " | |                             | |\r\n" + " | |  1. "
				+ deviceListNameLine() + "| |\r\n" + " | |                             | |\r\n"
				+ " | |     Device MAC Address:     | |\r\n" + " | |     13:10:d9:1f:e5:03       | |\r\n"
				+ " | |                             | |\r\n" + " | |     Device IPv4 Address:    | |\r\n"
				+ " | |     192.168.1.154           | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");

		System.out.print("Here is a list of your network's registered devices.");
		waitForUser();
		refresh();
		
		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n"
				+ " | |" + deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				 + " | |   ( Network Device List )   | |\r\n"
				+ " | |                             | |\r\n" + " | |  1. " + deviceListNameLine() + "| |\r\n"
				+ " | |                             | |\r\n" + " | |     Device MAC Address:     | |\r\n"
				+ " | |     13:10:d9:1f:e5:03       | |\r\n" + " | |                             | |\r\n"
				+ " | |     Device IPv4 Address:    | |\r\n" + " | |     192.168.1.154           | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		System.out.print("As you can see, the smartphone you're holding is currently the only registered device.");
		waitForUser();
		refresh();
		
		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n"
				+ " | |" + deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				 + " | |   ( Network Device List )   | |\r\n"
				+ " | |                             | |\r\n" + " | |  1. " + deviceListNameLine() + "| |\r\n"
				+ " | |                             | |\r\n" + " | |     Device MAC Address:     | |\r\n"
				+ " | |     13:10:d9:1f:e5:03       | |\r\n" + " | |                             | |\r\n"
				+ " | |     Device IPv4 Address:    | |\r\n" + " | |     192.168.1.154           | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		System.out.print("Let's take a look at your device's information.");
		waitForUser();
		refresh();
		load();

	}

	private void displayDeviceDetails() {
		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n" + " | |"
				+ deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				+ " | |       ( Device Info )       | |\r\n" + " | |                             | |\r\n"
				+ " | |  Device MAC Address:        | |\r\n" + " | |  13:10:d9:1f:e5:03          | |\r\n"
				+ " | |                             | |\r\n" + " | |  Device IPv4 Address:       | |\r\n"
				+ " | |  192.168.1.154              | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");

		System.out.print("Here is your smartphone's information.");
		waitForUser();
		refresh();
		
		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n" + " | |"
				+ deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				+ " | |       ( Device Info )       | |\r\n" + " | |                             | |\r\n"
				+ " | |  Device MAC Address:  <---  | |\r\n" + " | |  13:10:d9:1f:e5:03          | |\r\n"
				+ " | |                             | |\r\n" + " | |  Device IPv4 Address:       | |\r\n"
				+ " | |  192.168.1.154              | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");

		System.out.print("> As we discussed before, each component of the network has a MAC address.");
		waitForUser();
		refresh();
		
		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n" + " | |"
				+ deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				+ " | |       ( Device Info )       | |\r\n" + " | |                             | |\r\n"
				+ " | |  Device MAC Address:  <---  | |\r\n" + " | |  13:10:d9:1f:e5:03          | |\r\n"
				+ " | |                             | |\r\n" + " | |  Device IPv4 Address:       | |\r\n"
				+ " | |  192.168.1.154              | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");

		System.out.print("> This includes your smartphone. Your device's MAC address is listed here.");
		waitForUser();
		refresh();
		
		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n" + " | |"
				+ deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				+ " | |       ( Device Info )       | |\r\n" + " | |                             | |\r\n"
				+ " | |  Device MAC Address:  <---  | |\r\n" + " | |  13:10:d9:1f:e5:03          | |\r\n"
				+ " | |                             | |\r\n" + " | |  Device IPv4 Address:       | |\r\n"
				+ " | |  192.168.1.154              | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");

		System.out.print("> This is the same address we saw stored in the network's device list.");
		waitForUser();
		refresh();
		
		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n" + " | |"
				+ deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				+ " | |       ( Device Info )       | |\r\n" + " | |                             | |\r\n"
				+ " | |  Device MAC Address:        | |\r\n" + " | |  13:10:d9:1f:e5:03          | |\r\n"
				+ " | |                             | |\r\n" + " | |  Device IPv4 Address:  <--  | |\r\n"
				+ " | |  192.168.1.154              | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");

		System.out.print("> Likewise, your device's IP address is listed here.");
		waitForUser();
		refresh();
		
		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n" + " | |"
				+ deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				+ " | |       ( Device Info )       | |\r\n" + " | |                             | |\r\n"
				+ " | |  Device MAC Address:        | |\r\n" + " | |  13:10:d9:1f:e5:03          | |\r\n"
				+ " | |                             | |\r\n" + " | |  Device IPv4 Address:  <--  | |\r\n"
				+ " | |  192.168.1.154              | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");

		System.out.print("> This IP address was also displayed in the device list shown earlier.");
		waitForUser();
		refresh();
		
		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n" + " | |"
				+ deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				+ " | |       ( Device Info )       | |\r\n" + " | |                             | |\r\n"
				+ " | |  Device MAC Address:        | |\r\n" + " | |  13:10:d9:1f:e5:03          | |\r\n"
				+ " | |                             | |\r\n" + " | |  Device IPv4 Address:       | |\r\n"
				+ " | |  192.168.1.154              | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");

		System.out.print("Let's move on.");
		waitForUser();
		refresh();
		
		System.out.println("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		pause(1000);
		refresh();
		
		house();
		System.out.println("\n\n--\n\n\nWelcome back, " + name + "! Your WiFi network setup is complete!\n");
		waitForUser();
		refresh();
		house();
		System.out.println("\n\n--\n\n\nNext, we'll help you set up your Smart Garage System.\n");
		waitForUser();
		refresh();

	}
	
	public void load() {
		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n"
				+ " | |" + deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n\n");

		pause(333);
		refresh();

		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n"
				+ " | |" + deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				+ " | |                             | |\r\n" + " | |  .                          | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n\n");

		pause(333);
		refresh();
		
		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n"
				+ " | |" + deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				+ " | |                             | |\r\n" + " | |  . .                        | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n\n");

		pause(333);
		refresh();
		
		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n"
				+ " | |" + deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				+ " | |                             | |\r\n" + " | |  . . .                      | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n\n");

		pause(333);
		refresh();
		
		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n"
				+ " | |" + deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n\n");

		pause(333);
		refresh();
		
	}

}
