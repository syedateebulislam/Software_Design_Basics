package SOLID_Liskov_Practice.School_With_Liskov;

public abstract class SchoolStaff {
	
	public abstract void getSalary();
	
	public void otherDuties() {
		takeAttend();
		examDuties();
		checkAnsSheet();
	}
	
	protected void takeAttend() {
		System.out.println("take class attendance.");
	}
	
	protected void examDuties() {
		System.out.println("perform exam duty.");
	}
	
	protected void checkAnsSheet() {
		System.out.println("check answer sheets.");
	}
}
