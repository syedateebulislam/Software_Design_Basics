package SOLID_OCP_Practice.RemoteControlHW;

abstract public class Appliance {
	private String Device_name;
	private int rate;
	private String manufaturer;
	public Appliance(String device_name, int rate, String manufaturer) {
		super();
		Device_name = device_name;
		this.rate = rate;
		this.manufaturer = manufaturer;
	}
	
	public abstract void turnOnDevice();
	
	public abstract void turnOffDevice();
}
