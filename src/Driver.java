import director.Director;
import graphics.*;
import user.User;

public class Driver {
	public static void main(String[] args) {
		// Core graphics enables basic commands such as refreshing the screen, prompting the user to continue, and pausing the program
		// Menu graphics is used to print the menu art and selection options
		Core core = new Core();
		Menu menu = new Menu();
		
		// User class stores information about the user, such as their name, which is prompted for upon initialization
		User user = new User(menu.getUserFirstName());
		core.setName(user.getName());	// The user's name is passed to the Core graphics class for printing purposes
		
		// Director sets up the appropriate simulation for the user based on their selection
		Director director = new Director(user, user.getName());

		// Menu selection options are looped after the user creation process until they request to terminate program
		while(true) { 
			menu.select();
			director.go(menu.getSelection());	// Direct user to appropriate simulation
			
			// 1) Simulate Smart Garage Security System demonstration
			// 2) Simulate attack against a regular, dumb garage door
			// 3) Exit program
			
		}
		
	}
	
}