package SOLID_OCP_Practice.RemoteControlHW;

//import devices.Device;
//import remotes.RemoteControl;

public class  RemoteControl {

	Appliance device=null;
	
	private static final RemoteControl INSTANCE = new RemoteControl();
	
	private RemoteControl(){
	}
	
	public static RemoteControl getInstance(){
		return INSTANCE;
	}
	
	public void connectToDevice(Appliance aDevice){
		this.device = aDevice;
		System.out.println("---- connected to: "+ device + "----");
	}
	
	public void clickOffButon(){
		  device.turnOffDevice();

	}
	
	public void clickOnButon(){
		device.turnOnDevice();
	}

	
//	//choose device method
//	public static void chooseDevice(String device) {
//		System.out.println("inside choose device method..");
//		System.out.println(device+" is choosed by user...");
//	}
//	
//	public void turnOnDevice(String device) {
//	// TODO Auto-generated method stub
//		System.out.println(device+" is on...");
//	}
//
//	public void turnOffDevice(String device) {
//	// TODO Auto-generated method stub
//		System.out.println(device+" is off...");
////	abstract public void turnOnDevice();
////	abstract public void turnOffDevice();
//	}
}
