package SOLID_OCP_Practice.Hospital_Management_By_Interface;

public class Doctor extends Employee implements Employee_Duties {
	
	public Doctor(int id, String name, String dept, boolean working) {
		super(id, name, dept, working);
		System.out.println("doctor in action");
	}
	public static void PrescribeMeds(){
		System.out.println("Prescribe Medicine...");
	}
	public static void ChkReports() {
		System.out.println("Check Reports...");
	}
	@Override
	public void PerformDuties() {
		PrescribeMeds();
		ChkReports();
	}
}
