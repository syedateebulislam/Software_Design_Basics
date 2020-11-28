package Design_Pattern_Practice.Factory_Pattern;

public class App {
	
	public static void main(String[] args) {

		VehicleFactory f1 = new VehicleFactory();
		Vehicle v1=f1.getVehicle(VehicleType.Bike);
		v1.Engine();
		v1.AvgSpeed();
	}
}
