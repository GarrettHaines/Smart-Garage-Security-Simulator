import graphics.*;

class Driver {
	public static void main(String[] args) {
		// Menu initialized (graphics package)
		Menu menu = new Menu();
		
		// Smart Garage Security Simulator menu is printed
		menu.refresh();
		menu.title();
		
		// User "user" created
		User user = new User();
		menu.pause();

		// Menu is looped after User creation process until user requests to terminate program
		while(true) {
			menu.refresh();
			menu.title();
			
			// User is prompted for menu selection, 
			menu.select();
			user.go(menu.getSelection());
			
			// 1) Simulate Smart Garage Security System demonstration
			// 2) Simulate attack against a regular, dumb garage door
			// 3) Exit program
		}
		
	}
	
}