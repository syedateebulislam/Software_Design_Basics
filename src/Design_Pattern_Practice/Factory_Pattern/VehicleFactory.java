package Design_Pattern_Practice.Factory_Pattern;

public class VehicleFactory {
	
	public Vehicle getVehicle(VehicleType v) {
		return v.getVehicle();
	}
}
