package Design_Pattern_Practice.Builder_Pattern;
import java.util.Locale.Builder;

public class Vehicle {
	private String numPlate;//mandatory
	private int price;//mandatory
	private String mfgBy;
	private String modelType;
	private String modelName;
	private int mileage;
	
	//1-private constructor
	private Vehicle(Builder b) {
		this.numPlate=b.numPlate;
		this.price=b.price;
		this.mfgBy=b.mfgBy;
		this.modelType=b.modelType;
		this.modelName=b.modelName;
		this.mileage=b.mileage;
	}
	
	
	
	@Override
	public String toString() {
		return "Vehicle [numPlate=" + numPlate + ", price=" + price + ", mfgBy=" + mfgBy + ", modelType=" + modelType
				+ ", modelName=" + modelName + ", mileage=" + mileage + "]";
	}


	//2-Nested Builder Class
	public static class Builder{

		private String numPlate;//mandatory
		private String mfgBy;
		private String modelType;
		private int seater;
		private String modelName;
		private int price;//mandatory
		private int mileage;
		
		//3-Builder constructor with mandatory parameters
		public Builder(String numplate,int price) {
			this.numPlate=numplate;
			this.price=price;
		}
		
		//4-Build constructor
		public Vehicle Build() {
			return new Vehicle(this);
		}
		
		//5-All other optional value setters
		public Builder mfgBy(String value) {
			this.mfgBy=value;
			return this;
		}
		public Builder modelType(String value) {
			this.modelType=value;
			return this;
		}
		
		public Builder seater(int value) {
			this.seater=value;
			return this;
		}
		
		public Builder modelName(String value) {
			this.modelName=value;
			return this;
		}

		public Builder mileage(int value) {
			this.mileage=value;
			return this;
		}
	}
}