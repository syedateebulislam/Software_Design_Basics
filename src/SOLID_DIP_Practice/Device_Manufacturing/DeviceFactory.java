package SOLID_DIP_Practice.Device_Manufacturing;

import SOLID_DIP_Practice.Device_Factory.GeneralProcess;
import SOLID_DIP_Practice.Device_Factory.Mobile;

public class DeviceFactory {
	public static void main(String[] args) {
	
		GeneralProcess p1=new Mobile();
		
		p1.startMfg();

	}	
}