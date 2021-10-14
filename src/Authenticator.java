class Authenticator {
	private String name;
	
	public Authenticator(String firstName) {
		name = Character.toUpperCase(firstName.charAt(0)) + firstName.substring(1, firstName.length()) + "'s Smart Garage Authenticator App";
	}
	
	public void test() {
		System.out.println("A notification appears from " + name);
	}

}