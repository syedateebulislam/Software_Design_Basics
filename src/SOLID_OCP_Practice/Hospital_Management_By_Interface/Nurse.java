package SOLID_OCP_Practice.Hospital_Management_By_Interface;

public class Nurse extends Employee implements Employee_Duties{
	
	public Nurse(int id, String name, String dept, boolean working) {
		super(id, name, dept, working);
		System.out.println("nurse in action");
	}
	public static void GiveMeds() {
		System.out.println("Give Medicines...");
	}
	public static void CleanRoom() {
		System.out.println("Clean Room...");
	}
	@Override
	public void PerformDuties() {
		GiveMeds();
		CleanRoom();
	}
}
