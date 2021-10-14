class Driver {
	public static void main(String[] args) {
		printMenu();
	}
	
	public static void printMenu() {
		System.out.println("SMART GARAGE SECURITY SIMULATOR");
		System.out.println("--\n");
		
		// Create instance of User and User's corresponding objects
		User me = new User();
		me.test();
	}
	
}