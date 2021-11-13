import director.Director;
import graphics.*;
import user.User;

public class Driver {
	public static void main(String[] args) {
		// Core and Menu graphics initialized from the graphics package
		Core core = new Core();
		Menu menu = new Menu(core);
		
		core.refresh();
		
		// User "user" created
		User user = new User(menu.getUserFirstName());
		core.setName(user.getName());
		
		// Create a Director to guide the user through the program
		Director director = new Director(user, user.getName());

		// Menu is looped after User creation process until user requests to terminate program
		while(true) {
			// User is prompted for menu selection, 
			menu.select();
			director.go(menu.getSelection());
			
			// 1) Simulate Smart Garage Security System demonstration
			// 2) Simulate attack against a regular, dumb garage door
			// 3) Exit program
		}
		
	}
	
}