package Design_Pattern_Practice.Factory_Pattern;

public enum VehicleType {
	Car{
		public Vehicle getVehicle() {
			return new Car();
		}
	},
	Bike{
		public Vehicle getVehicle() {
			return new Bike();
		}
	};
	
	abstract Vehicle getVehicle();
}
