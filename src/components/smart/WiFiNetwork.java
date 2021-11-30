package components.smart;

import java.util.ArrayList;

public class WiFiNetwork {
	// A router has a given MAC address that will never change
	// This is used to identify the router itself
	private String addressMAC;
	
	// A router has an IPv4 address that will likely change over time
	// This is used to identify a connection to the internet
	private String addressIP;
	
	// A router has a network name and password that can be altered by a User
	// This is used to verify that the identity of a User attempting to access the network is authentic
	// The network name is visible to mobile devices within the router's range
	private String networkName;
	private String networkPassword;
	
	
	// A router has a list of authenticated devices that have credentials to access the network
	private ArrayList<Device> networkDevices = new ArrayList<Device>();
	
	
	// Default configuration of a WifiNetwork object
	public WiFiNetwork(String name, String networkPassword) {
		addressMAC = "37:b0:69:1e:45:01";
		addressIP = "192.168.1.203";
		networkName = name + "'s WiFi Network";
		this.networkPassword = networkPassword;
	}
	
	
	// addDevice allows for a new mobile device to be added to the list of authenticated devices
	public void addDevice(Device newDevice) {
		networkDevices.add(newDevice);
	}

	// Return network's name
	public String getNetworkName() {
		return networkName;
	}
	
}