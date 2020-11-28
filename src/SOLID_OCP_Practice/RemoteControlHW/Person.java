package SOLID_OCP_Practice.RemoteControlHW;

//import devices.TV;
//import remotes.RemoteControl;

public class Person  {
	public static void main(String[] args) {
		
		Tv niceLargeScreenTV = new Tv(null, 0, null);
		
		// The user's control
		RemoteControl remoteControl = RemoteControl.getInstance();
	
		remoteControl.connectToDevice(niceLargeScreenTV);
		remoteControl.clickOnButon();

		
		
		//ser u1=new User("ateeb",101);
//		Appliance a1=new Tv("Tv",10999,"sony"); //purchased new appliance
		
//		Tv t1=new Tv();
//		
//		RemoteControl r1=new RemoteControl();
//		
//		r1.chooseDevice("tv");
//		r1.turnOnDevice("tv");
		
	}
}
