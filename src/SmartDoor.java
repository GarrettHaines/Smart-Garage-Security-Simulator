class SmartDoor {
	private String name;
	private WiFiNetwork wifi;
	
	public SmartDoor(String firstName, WiFiNetwork network) {
		name = Character.toUpperCase(firstName.charAt(0)) + firstName.substring(1, firstName.length()) + "'s Smart Garage Door";
		wifi = network;
	}
	
	public void test() {
		System.out.println("Smart Garage Door connects automatically to " + wifi.getNetworkName());
	}
	
}