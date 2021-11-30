package graphics;

public class SmartSimulation extends Core {
	private String name;
	private String networkName;
	private String networkPassword;
	private String authenticatorPassword;
	
	
	public SmartSimulation(String name) {
		this.name = name;
		networkName = name + "'s Network";
	}
	
	
	// All users will set up their WiFi network
	// Afterwards, the user is given the option to view their device and network details
	// A boolean is returned from the user's choice
	public void setUpNetwork() {
		boolean userWantsDetails = printSetUpNetwork();
		
		if(userWantsDetails) {
			displayNetworkDetails();
			displayDeviceDetails();
		}
		else {
			shutDownDevice();
			String discard = input.nextLine();
		}
	}
	
	
	public void setUpSmartGarage() {
		boolean userWantsDetails = printSetUpSmartGarage();
		
		if(userWantsDetails) {
			displaySmartDoorDetails();
			displayAuthenticatorDetails();
		}
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
	
	public String authenticatorUsernameLine() {
		String result;
		int length = 27 -  name.length();
		
		result = (name);

		for (int i = 0; i < length; i++)
			result += (" ");
		
		return result;
	}
	
	public String authenticatorPasswordLine() {
		String result;
		int length = 27 - authenticatorPassword.length();
		
		result = (authenticatorPassword);

		for (int i = 0; i < length; i++)
			result += (" ");
		
		return result;
	}
	
	public void createNetworkPassword() {
		System.out.print("> Password: ");
		networkPassword = input.next();
	}
	
	public String getNetworkPassword() {
		String encryptedPassword = networkPassword;
		return encryptedPassword;
	}
	
	public void createAuthenticatorPassword() {
		System.out.print("> Password: ");
		authenticatorPassword = input.next();
	}
	
	public String getAuthenticatorPassword() {
		String encryptedPassword = authenticatorPassword;
		return encryptedPassword;
	}
	
	
	
	public boolean printSetUpNetwork() {
		printHouseWithPointer();
		refresh();
		printHouseNoGarage();
		System.out.println("\n\n--\n\n\nFirst, let's set up your WiFi network.\n");
		waitForUser();
		
		smartphoneTurnOn();
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
				+ " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n\n");
		
		createNetworkPassword();
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
				+ " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n\n");
		
		pause(750);
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
				+ " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		System.out.print("Would you like an explanation of the address information and data\n");
		System.out.print("details for your device and network?                        (Y/N): ");

		char letterChoice = input.next().charAt(0);
		refresh();
		
		if(letterChoice == 'Y' || letterChoice == 'y')
			return true;
		else
			return false;
	}
	
	public void displayNetworkDetails() {
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
				+ " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		String discard = input.nextLine();
		waitForUser();
		
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
				+ " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		System.out.print("> Your network's name is a string of characters used to refer to your WiFi network.");
		waitForUser();
		
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
				+ " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		System.out.print("> This password is a credential which must be provided in order to access the network.");
		waitForUser();
		
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
				+ " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		System.out.print("> This is necessary to ensure connections to the network are authentic.");
		waitForUser();
		
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
				+ " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n" 
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		System.out.print("> Once a device has been successfully authenticated, its information is saved in a list.");
		waitForUser();
		
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
				+ " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		System.out.print("> Devices on this list can connect to the network automatically when in range.");
		waitForUser();
		
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
				+ " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		System.out.print("> Each component of the network has one unique identifying 'MAC' address.");
		waitForUser();
		
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
				+ " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		System.out.print("> This includes devices, switches, and routers. Any given MAC address will never change.");
		waitForUser();
		
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
				+ " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		System.out.print("> A MAC address is used to ensure the physical address of the component.");
		waitForUser();
		
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
				+ " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		System.out.print("> The address listed here is used to identify your network's primary router.");
		waitForUser();
		
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
				+ " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		System.out.print("> Each component of the network is also given at least one IP address.");
		waitForUser();
		
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
				+ " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		System.out.print("> This address is used to identify the connection between the given component and the internet.");
		waitForUser();
		
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
				+ " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		System.out.print("> Unlike a MAC address, an IP address may change over time.");
		waitForUser();
		
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
				+ " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		System.out.print("> The address listed here identifies the connection between your router and the internet.");
		waitForUser();
		
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
				+ " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		System.out.print("Let's look at your network's device list.");
		waitForUser();
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
				+ " | |                             | |\r\n" 
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");

		System.out.print("Here is a list of your network's registered devices.");
		waitForUser();
		
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
				+ " | |                             | |\r\n" 
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		System.out.print("As you can see, the smartphone you're holding is currently the only registered device.");
		waitForUser();
		
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
				+ " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		System.out.print("Let's take a look at your device's information.");
		waitForUser();
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
				+ " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");

		System.out.print("Here is your smartphone's information.");
		waitForUser();
		
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
				+ " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");

		System.out.print("> As we discussed before, each component of the network has a MAC address.");
		waitForUser();
		
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
				+ " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");

		System.out.print("> This includes your smartphone. Your device's MAC address is listed here.");
		waitForUser();
		
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
				+ " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");

		System.out.print("> This is the same address we saw stored in the network's device list.");
		waitForUser();
		
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
				+ " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");

		System.out.print("> Likewise, your device's IP address is listed here.");
		waitForUser();
		
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
				+ " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");

		System.out.print("> This IP address was also displayed in the device list shown earlier.");
		waitForUser();
		
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
				+ " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");

		System.out.print("Let's move on.");
		waitForUser();
		
		shutDownDevice();
	}
	
	
	public boolean printSetUpSmartGarage() {
		printHouseNoGarage();
		System.out.println("\n\n--\n\n\nWelcome back, " + name + "! Your WiFi network setup is complete!\n");
		waitForUser();
		
		printHouseNoGarage();
		System.out.println("\n\n--\n\n\nNext, we'll help you set up your Smart Garage System.\n");
		waitForUser();
		
		smartphoneTurnOn();
		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n"
				+ " | |" + deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				+ " | |                             | |\r\n" + " | |  Enter a password for your  | |\r\n"
				+ " | |  Authenticator app:         | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n\n");
		
		createAuthenticatorPassword();
		refresh();
		String discard = input.nextLine();
		
		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n"
				+ " | |" + deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				+ " | |                             | |\r\n" + " | |  Enter a password for your  | |\r\n"
				+ " | |  Authenticator app:         | |\r\n" + " | |  " + authenticatorPasswordLine() + "| |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n\n");
		pause(750);
		refresh();
		load();
		
		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n"
				+ " | |" + deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				+ " | |        Smart Garage         | |\r\n" + " | |      ( Authenticator )      | |\r\n"
				+ " | |                             | |\r\n" + " | |  Username:                  | |\r\n"
				+ " | |  " + authenticatorUsernameLine() + "| |\r\n" + " | |                             | |\r\n"
				+ " | |  Password:                  | |\r\n" + " | |  " + authenticatorPasswordLine() + "| |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		System.out.print("Your Authenticator account is now set up!");
		waitForUser();
		
		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n"
				+ " | |" + deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				+ " | |        Smart Garage         | |\r\n" + " | |      ( Authenticator )      | |\r\n"
				+ " | |                             | |\r\n" + " | |  Username:                  | |\r\n"
				+ " | |  " + authenticatorUsernameLine() + "| |\r\n" + " | |                             | |\r\n"
				+ " | |  Password:                  | |\r\n" + " | |  " + authenticatorPasswordLine() + "| |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		System.out.print("Our Smart Garage Crew has finished installing your Smart Door.");
		waitForUser();
		
		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n"
				+ " | |" + deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				+ " | |        Smart Garage         | |\r\n" + " | |      ( Authenticator )      | |\r\n"
				+ " | |                             | |\r\n" + " | |  Username:                  | |\r\n"
				+ " | |  " + authenticatorUsernameLine() + "| |\r\n" + " | |                             | |\r\n"
				+ " | |  Password:                  | |\r\n" + " | |  " + authenticatorPasswordLine() + "| |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		System.out.print("Your Smart Garage System is now fully functional!");
		waitForUser();
		shutDownDevice();
		
		
		printHouseGarageClosing();
		printHouseWithGarage();
		System.out.println("\n");
		waitForUser();
		
		printHouseWithGarage();
		System.out.print("\n\nWould you like an explanation of the address information and data\n");
		System.out.print("details for your Smart Door and Authenticator app?          (Y/N): ");

		char letterChoice = input.next().charAt(0);
		refresh();
		

		
		if(letterChoice == 'N' || letterChoice == 'n')
			return false;
		else
			return true;
	}
	
	public void displaySmartDoorDetails() {
		printHouseWithGarage();
		System.out.print("\n\nYour Smart Garage's Smart Door has an attached microchip that is connected to your WiFi Network.");
		String discard = input.nextLine();
		waitForUser();

		printHouseWithGarage();
		System.out.print("\n\nIt is now registered in your network's device list, along with your smartphone.");
		waitForUser();

		printHouseWithGarage();
		System.out.print("\n\nAs you may recall, each device has a unique MAC address and an IP address.");
		waitForUser();

		printHouseWithGarage();
		System.out.print("\n\nYour Smart Door's MAC address is 2f:05:8c:ed:07:1b.");
		waitForUser();

		printHouseWithGarage();
		System.out.print("\n\nYour Smart Door's IP address is 192.168.1.159.");
		waitForUser();

		printHouseWithGarage();
		System.out.print("\n\nLet's revisit your network's device list.");
		waitForUser();
		
		smartphoneTurnOn();
		
		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n" + " | |"
				+ deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				+ " | |   ( Network Device List )   | |\r\n" + " | |                             | |\r\n" + " | |  1. "
				+ deviceListNameLine() + "| |\r\n" + " | |                             | |\r\n"
				+ " | |     Device MAC Address:     | |\r\n" + " | |     13:10:d9:1f:e5:03       | |\r\n"
				+ " | |                             | |\r\n" + " | |     Device IPv4 Address:    | |\r\n"
				+ " | |     192.168.1.154           | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |  2. Smart Garage Door       | |\r\n"
				+ " | |     Device MAC Address:     | |\r\n" + " | |     2f:05:8c:ed:07:1b       | |\r\n"
				+ " | |                             | |\r\n" + " | |     Device IPv4 Address:    | |\r\n"
				+ " | |     192.168.1.159           | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		System.out.print("> As you can see, your Smart Door is now registered to your network's device list.");
		waitForUser();
	}
	
	public void displayAuthenticatorDetails() {
		load();
		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n"
				+ " | |" + deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				+ " | |        Smart Garage         | |\r\n" + " | |      ( Authenticator )      | |\r\n"
				+ " | |                             | |\r\n" + " | |  Username:                  | |\r\n"
				+ " | |  " + authenticatorUsernameLine() + "| |\r\n" + " | |                             | |\r\n"
				+ " | |  Password:                  | |\r\n" + " | |  " + authenticatorPasswordLine() + "| |\r\n"
				+ " | |                             | |\r\n" + " | |  Your Home Network:         | |\r\n"
				+ " | |  " + networkNameLine() + "| |\r\n" + " | |                             | |\r\n"
				+ " | |  WiFi Router MAC Address:   | |\r\n" + " | |  37:b0:69:1e:45:01          | |\r\n"
				+ " | |                             | |\r\n" + " | |  Smart Door MAC Address:    | |\r\n"
				+ " | |  2f:05:8c:ed:07:1b          | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		System.out.print("\nYour Smart Garage System also includes a free download of the\n\'Authenticator\' app for your smartphone.");
		waitForUser();

		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n"
				+ " | |" + deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				+ " | |        Smart Garage         | |\r\n" + " | |      ( Authenticator )      | |\r\n"
				+ " | |                             | |\r\n" + " | |  Username:                  | |\r\n"
				+ " | |  " + authenticatorUsernameLine() + "| |\r\n" + " | |                             | |\r\n"
				+ " | |  Password:                  | |\r\n" + " | |  " + authenticatorPasswordLine() + "| |\r\n"
				+ " | |                             | |\r\n" + " | |  Your Home Network:         | |\r\n"
				+ " | |  " + networkNameLine() + "| |\r\n" + " | |                             | |\r\n"
				+ " | |  WiFi Router MAC Address:   | |\r\n" + " | |  37:b0:69:1e:45:01          | |\r\n"
				+ " | |                             | |\r\n" + " | |  Smart Door MAC Address:    | |\r\n"
				+ " | |  2f:05:8c:ed:07:1b          | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		System.out.print("\nThis application stores your Smart Door and home WiFi network addresses,\n"
							+ "and it requests the addresses of the WiFi network you are currently connected to.");
		waitForUser();

		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n"
				+ " | |" + deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				+ " | |        Smart Garage         | |\r\n" + " | |      ( Authenticator )      | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |            _____            | |\r\n" + " | |           /     \\           | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |    <  OPEN SMART DOOR  >    | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |           \\_____/           | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		System.out.print("In the Authenticator app, you can request to open your Smart Door,\n"
							+ "so long as you are connected to the same WiFi network\nas your Smart Door.");
		waitForUser();
		
		System.out.print("  .-------------------------------.\r\n" + " |                o                |\r\n"
				+ " | .-----------------------------. |\r\n" + " | |                             | |\r\n"
				+ " | |" + deviceNameLine() + "| |\r\n" + " | |  -                          | |\r\n"
				+ " | |        Smart Garage         | |\r\n" + " | |      ( Authenticator )      | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |            _____            | |\r\n" + " | |           /     \\           | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |    <  OPEN SMART DOOR  >    | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n" + " | |           \\_____/           | |\r\n"
				+ " | |                             | |\r\n" + " | |                             | |\r\n"
				+ " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		System.out.print("\n> Open Smart Door (Y/N): ");
		char choice = input.next().charAt(0);
		if(choice == 'Y' || choice == 'y')
			printHouseGarageOpening();
		waitForUser();
	}
	
	// printHouseNoGarage() prints Smart Garage Security System simulation's printHouseNoGarage art
	public void printHouseWithPointer() {
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
						+ " nmnmmmmmnmmmnmmmnmmmmmmmmmnnmmmmmmmmmmmmmnmmmmmnmmmmmmmmmnnmmmmnmmmnmmn");
		System.out.println("\n\n--\n\n\nWelcome home, " + name + "!\n\n");
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
						+ "    /^ ^  ^ ^^  ^    ||  o  You||||(_)|||||||___|||||    /||o||||||\\\r\n"
						+ "   / ^   ^   ^    ^  || /|\\<-' ||||  o|||||||___|||||        | |      \r\n"
						+ "  / ^ ^ ^  ^  ^  ^   ||_/_\\____||||___|||||||||||||||mmmnmnmm| |mmnmmmm \r\n"
						+ " nmnmmmmmnmmmnmmmnmmmmmmmmmnnmmmmmmmmmmmmmnmmmmmnmmmmmmmmmnnmmmmnmmmnmmn");
		System.out.println("\n\n--\n\n\nWelcome home, " + name + "!\n\n");
		pause(350);
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
						+ " nmnmmmmmnmmmnmmmnmmmmmmmmmnnmmmmmmmmmmmmmnmmmmmnmmmmmmmmmnnmmmmnmmmnmmn");
		System.out.println("\n\n--\n\n\nWelcome home, " + name + "!\n\n");
		pause(350);
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
						+ "    /^ ^  ^ ^^  ^    ||  o  You||||(_)|||||||___|||||    /||o||||||\\\r\n"
						+ "   / ^   ^   ^    ^  || /|\\<-' ||||  o|||||||___|||||        | |      \r\n"
						+ "  / ^ ^ ^  ^  ^  ^   ||_/_\\____||||___|||||||||||||||mmmnmnmm| |mmnmmmm \r\n"
						+ " nmnmmmmmnmmmnmmmnmmmmmmmmmnnmmmmmmmmmmmmmnmmmmmnmmmmmmmmmnnmmmmnmmmnmmn");
		System.out.println("\n\n--\n\n\nWelcome home, " + name + "!\n\n");
		pause(350);
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
						+ " nmnmmmmmnmmmnmmmnmmmmmmmmmnnmmmmmmmmmmmmmnmmmmmnmmmmmmmmmnnmmmmnmmmnmmn");
		System.out.println("\n\n--\n\n\nWelcome home, " + name + "!\n\n");
		pause(350);
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
						+ "    /^ ^  ^ ^^  ^    ||  o  You||||(_)|||||||___|||||    /||o||||||\\\r\n"
						+ "   / ^   ^   ^    ^  || /|\\<-' ||||  o|||||||___|||||        | |      \r\n"
						+ "  / ^ ^ ^  ^  ^  ^   ||_/_\\____||||___|||||||||||||||mmmnmnmm| |mmnmmmm \r\n"
						+ " nmnmmmmmnmmmnmmmnmmmmmmmmmnnmmmmmmmmmmmmmnmmmmmnmmmmmmmmmnnmmmmnmmmnmmn");
		System.out.println("\n\n--\n\n\nWelcome home, " + name + "!\n\n");
		pause(350);
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
						+ " nmnmmmmmnmmmnmmmnmmmmmmmmmnnmmmmmmmmmmmmmnmmmmmnmmmmmmmmmnnmmmmnmmmnmmn");
		System.out.println("\n\n--\n\n\nWelcome home, " + name + "!\n\n");
		pause(350);
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
						+ "    /^ ^  ^ ^^  ^    ||  o  You||||(_)|||||||___|||||    /||o||||||\\\r\n"
						+ "   / ^   ^   ^    ^  || /|\\<-' ||||  o|||||||___|||||        | |      \r\n"
						+ "  / ^ ^ ^  ^  ^  ^   ||_/_\\____||||___|||||||||||||||mmmnmnmm| |mmnmmmm \r\n"
						+ " nmnmmmmmnmmmnmmmnmmmmmmmmmnnmmmmmmmmmmmmmnmmmmmnmmmmmmmmmnnmmmmnmmmnmmn");
		System.out.println("\n\n--\n\n\nWelcome home, " + name + "!\n\n");
		pause(350);
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
						+ " nmnmmmmmnmmmnmmmnmmmmmmmmmnnmmmmmmmmmmmmmnmmmmmnmmmmmmmmmnnmmmmnmmmnmmn");
		System.out.println("\n\n--\n\n\nWelcome home, " + name + "!\n");
		waitForUser();
	}
	
	
	// printHouseNoGarage() prints Smart Garage Security System simulation's printHouseNoGarage art
	public void printHouseNoGarage() {
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
						+ " nmnmmmmmnmmmnmmmnmmmmmmmmmnnmmmmmmmmmmmmmnmmmmmnmmmmmmmmmnnmmmmnmmmnmmn");
	}
	
	// printHouseNoGarage() prints Smart Garage Security System simulation's printHouseNoGarage art
	public void printHouseGarageClosing() {
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
						+ " nmnmmmmmnmmmnmmmnmmmmmmmmmnnmmmmmmmmmmmmmnmmmmmnmmmmmmmmmnnmmmmnmmmnmmn\n\n\n\n");
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
						+ "    /^ ^  ^ ^^  ^    ||________||||(_)|||||||___|||||    /||o||||||\\\r\n"
						+ "   / ^   ^   ^    ^  || /|\\    ||||  o|||||||___|||||        | |      \r\n"
						+ "  / ^ ^ ^  ^  ^  ^   ||_/_\\____||||___|||||||||||||||mmmnmnmm| |mmnmmmm \r\n"
						+ " nmnmmmmmnmmmnmmmnmmmmmmmmmnnmmmmmmmmmmmmmnmmmmmnmmmmmmmmmnnmmmmnmmmnmmn\n\n\n\n");
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
						+ "    /^ ^  ^ ^^  ^    ||___SG___||||(_)|||||||___|||||    /||o||||||\\\r\n"
						+ "   / ^   ^   ^    ^  ||________||||  o|||||||___|||||        | |      \r\n"
						+ "  / ^ ^ ^  ^  ^  ^   ||_/_\\____||||___|||||||||||||||mmmnmnmm| |mmnmmmm \r\n"
						+ " nmnmmmmmnmmmnmmmnmmmmmmmmmnnmmmmmmmmmmmmmnmmmmmnmmmmmmmmmnnmmmmnmmmnmmn\n\n\n\n");
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
						+ "   / ^   ^   ^    ^  ||___SG___||||  o|||||||___|||||        | |      \r\n"
						+ "  / ^ ^ ^  ^  ^  ^   ||________||||___|||||||||||||||mmmnmnmm| |mmnmmmm \r\n"
						+ " nmnmmmmmnmmmnmmmnmmmmmmmmmnnmmmmmmmmmmmmmnmmmmmnmmmmmmmmmnnmmmmnmmmnmmn\n\n\n\n");
		pause(2000);
		refresh();
	}
	
	// printHouseNoGarage() prints Smart Garage Security System simulation's printHouseNoGarage art
		public void printHouseGarageOpening() {
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
							+ "   / ^   ^   ^    ^  ||___SG___||||  o|||||||___|||||        | |      \r\n"
							+ "  / ^ ^ ^  ^  ^  ^   ||________||||___|||||||||||||||mmmnmnmm| |mmnmmmm \r\n"
							+ " nmnmmmmmnmmmnmmmnmmmmmmmmmnnmmmmmmmmmmmmmnmmmmmnmmmmmmmmmnnmmmmnmmmnmmn\n\n\n\n");
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
							+ "    /^ ^  ^ ^^  ^    ||___SG___||||(_)|||||||___|||||    /||o||||||\\\r\n"
							+ "   / ^   ^   ^    ^  ||________||||  o|||||||___|||||        | |      \r\n"
							+ "  / ^ ^ ^  ^  ^  ^   ||_/_\\____||||___|||||||||||||||mmmnmnmm| |mmnmmmm \r\n"
							+ " nmnmmmmmnmmmnmmmnmmmmmmmmmnnmmmmmmmmmmmmmnmmmmmnmmmmmmmmmnnmmmmnmmmnmmn\n\n\n\n");
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
							+ " nmnmmmmmnmmmnmmmnmmmmmmmmmnnmmmmmmmmmmmmmnmmmmmnmmmmmmmmmnnmmmmnmmmnmmn\n\n\n\n");
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
							+ " nmnmmmmmnmmmnmmmnmmmmmmmmmnnmmmmmmmmmmmmmnmmmmmnmmmmmmmmmnnmmmmnmmmnmmn\n\n\n\n");
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
							+ "    /^ ^  ^ ^^  ^    ||  o Woo!||||(_)|||||||___|||||    /||o||||||\\\r\n"
							+ "   / ^   ^   ^    ^  || /|\\ -' ||||  o|||||||___|||||        | |      \r\n"
							+ "  / ^ ^ ^  ^  ^  ^   ||_/_\\____||||___|||||||||||||||mmmnmnmm| |mmnmmmm \r\n"
							+ " nmnmmmmmnmmmnmmmnmmmmmmmmmnnmmmmmmmmmmmmmnmmmmmnmmmmmmmmmnnmmmmnmmmnmmn\n\n\n\n");
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
							+ "    /^ ^  ^ ^^  ^    ||  o     ||||(_)|||||||___|||||    /||o||||||\\\r\n"
							+ "   / ^   ^   ^    ^  || /|\\    ||||  o|||||||___|||||        | |      \r\n"
							+ "  / ^ ^ ^  ^  ^  ^   ||_/_\\____||||___|||||||||||||||mmmnmnmm| |mmnmmmm \r\n"
							+ " nmnmmmmmnmmmnmmmnmmmmmmmmmnnmmmmmmmmmmmmmnmmmmmnmmmmmmmmmnnmmmmnmmmnmmn\n\n\n\n");
			pause(2000);
			refresh();
		}
	
	// printHouseNoGarage() prints Smart Garage Security System simulation's printHouseNoGarage art
	public void printHouseWithGarage() {
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
						+ "   / ^   ^   ^    ^  ||___SG___||||  o|||||||___|||||        | |      \r\n"
						+ "  / ^ ^ ^  ^  ^  ^   ||________||||___|||||||||||||||mmmnmnmm| |mmnmmmm \r\n"
						+ " nmnmmmmmnmmmnmmmnmmmmmmmmmnnmmmmmmmmmmmmmnmmmmmnmmmmmmmmmnnmmmmnmmmnmmn\n");
	}
	
	public void smartphoneTurnOn() {
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
				+ " | |                             | |\r\n"
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
				+ " | |                             | |\r\n"
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
				+ " | |                             | |\r\n" 
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		pause(333);
		refresh();
		load();
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
				+ " | |                             | |\r\n"
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
				+ " | |                             | |\r\n"
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
				+ " | |                             | |\r\n" 
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
				+ " | |                             | |\r\n"
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
				+ " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n\n");

		pause(333);
		refresh();
		
	}
	
	public void shutDownDevice() {
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
				+ " | |                             | |\r\n"
				+ " | '-----------------------------' |\r\n" + " |                _                |\r\n"
				+ " |              ( _ )              |\r\n" + "  '-------------------------------'\n\n");
		
		pause(1000);
		refresh();
	}

}
