package Design_Pattern_Practice.Factory_Pattern;

public class Bike implements Vehicle{

	@Override
	public void Engine() {
		// TODO Auto-generated method stub
		System.out.println("Bike has 180cc Engine");
	}

	@Override
	public void AvgSpeed() {
		// TODO Auto-generated method stub
		System.out.println("Avg speed of Bike is 40Kmph");
	}
	
}
