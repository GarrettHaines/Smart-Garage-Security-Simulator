package components.smart;

public class Device {
	private String MAC;
	private String IP;
	private String name;
	
	public Device(String firstName) {
		setMAC("13:10:d9:1f:e5:03");
		setIP("192.168.1.154");
		name = firstName + "'s Mobile Device";
		Authenticator app = new Authenticator(firstName);
	}
	
	public void setMAC(String MAC) {
		this.MAC = MAC;
	}
	
	public void setIP(String IP) {
		this.IP = IP;
	}
	
	public Device() { }
	
}