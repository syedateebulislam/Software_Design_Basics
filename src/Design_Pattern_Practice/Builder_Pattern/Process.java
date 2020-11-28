package Design_Pattern_Practice.Builder_Pattern;

public class Process {
	public static void main(String[] args) {
		Vehicle v1=new Vehicle.Builder("UP60 V 0123", 72244).mfgBy("Honda").modelName("Activa").Build();
		System.out.println(v1);
	}
}
