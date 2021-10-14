class MobileDevice {
	private String addressMAC;
	private String addressIP;
	private String name;
	Authenticator app;
	
	public MobileDevice(String firstName) {
		addressMAC = "13:10:d9:1f:e5:03";
		addressIP = "192.168.1.154";
		name = Character.toUpperCase(firstName.charAt(0)) + firstName.substring(1, firstName.length()) + "'s Mobile Device";
		app = new Authenticator(firstName);
	}
	
	public void test() {
		System.out.println(name + " begins to ring");
		app.test();
	}
	
}