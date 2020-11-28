package SOLID_OCP_Practice.RemoteControlHW;

public class Tv extends Appliance{

	public Tv(String device_name, int rate, String manufaturer) {
		super(device_name, rate, manufaturer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void turnOnDevice() {
		// TODO Auto-generated method stub
		System.out.println("tv is on...");
		setVolume();
		setChannel();
	}

	@Override
	public void turnOffDevice() {
		// TODO Auto-generated method stub
		System.out.println("tv is off...");
	}

	public void setChannel() {
		System.out.println("channel changed in tv...");
	}
	
	public void setVolume() {
		System.out.println("setting volume accordingly...");
	}
}
