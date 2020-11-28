package SOLID_DIP_Practice.Device_Factory;

public class Laptop extends GeneralProcess {

	@Override
	public void Assemble() {
		// TODO Auto-generated method stub
		System.out.println("Assembling Laptop...");
	}

	@Override
	public void Test() {
		// TODO Auto-generated method stub
		System.out.println("Testing Laptop...");
		
	}

	@Override
	public void Pack() {
		// TODO Auto-generated method stub
		System.out.println("Packing Laptop...");
		
	}

	@Override
	public void Store() {
		// TODO Auto-generated method stub
		System.out.println("Storing Laptop...");		
	}
}
