import graphics.*;
import components.Director;
import user.User;

public class Driver {
	public static void main(String[] args) {
<<<<<<< HEAD
		// Core and Menu graphics initialized from the graphics package
		Core core = new Core();
		Menu menu = new Menu(core);
=======
		// Testing Simple Comment change to make sure I can push to Repo
		// Menu initialized (graphics package)
		Menu menu = new Menu();
>>>>>>> 141131566a4a3f47d40e68a6a58431e95194db13
		
		core.refresh();
		
		// User "user" created
		User user = new User(menu.getUserFirstName());
		core.setName(user.getName());
		System.out.println(user.getName());
		System.out.println(core.getName());
		core.waitForUser();
		
		// Create a Director to guide the user through the program
		Director director = new Director(core, user);

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