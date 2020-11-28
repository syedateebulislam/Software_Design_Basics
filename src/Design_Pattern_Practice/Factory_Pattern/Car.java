package Design_Pattern_Practice.Factory_Pattern;

public class Car implements Vehicle{
	@Override
	public void Engine() {
		System.out.println("Car has 2000cc Engine");
	}
	@Override
	public void AvgSpeed() {
		System.out.println("Avg speed of Car is 60Kmph");
	}	
}
